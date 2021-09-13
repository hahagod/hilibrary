package com.otm.hi.library.log;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.otm.hi.library.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zhuyongqiang
 * Date: 2021/9/13
 * Desc:
 */
public class HiViewPrinter implements HiLogPrinter {
    @Override
    public void print(@NonNull HiLogConfig config, int level, String tag,
                      @NonNull String printString) {

    }

    private static class LogAdapter extends RecyclerView.Adapter<LogViewHolder> {

        private LayoutInflater inflater;
        private List<HiLogMo> logs = new ArrayList<>();

        @NonNull
        @Override
        public LogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = inflater.inflate(R.layout.hilog_item, parent, false);
            return new LogViewHolder(itemView);
        }

        void addItem(HiLogMo log) {
            logs.add(log);
            notifyItemInserted(logs.size() - 1);
        }

        @Override

        public void onBindViewHolder(@NonNull LogViewHolder holder, int position) {
            HiLogMo logItem = logs.get(position);
            int color = getHighlightColor(logItem.level);
            holder.tvTag.setTextColor(color);
            holder.tvMessage.setTextColor(color);

            holder.tvTag.setText(logItem.getFlattened());
            holder.tvMessage.setText(logItem.log);
        }

        private int getHighlightColor(int logLevel) {
            int highlight;
            switch (logLevel) {
                case HiLogType.V:
                    highlight = 0xffbbbbbb;
                    break;
                case HiLogType.D:
                    highlight = 0xffffffff;
                    break;
                case HiLogType.I:
                    highlight = 0xff6a8759;
                    break;
                case HiLogType.W:
                    highlight = 0xffbbb529;
                    break;
                case HiLogType.E:
                    highlight = 0xffff6b68;
                    break;
                default:
                    highlight = 0xffffff00;
                    break;
            }
            return highlight;
        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

    private static class LogViewHolder extends RecyclerView.ViewHolder {
        TextView tvTag;
        TextView tvMessage;

        public LogViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTag = itemView.findViewWithTag(R.id.tag);
            tvMessage = itemView.findViewWithTag(R.id.message);
        }
    }
}
