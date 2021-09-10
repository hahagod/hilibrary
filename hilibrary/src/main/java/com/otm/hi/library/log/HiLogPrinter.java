package com.otm.hi.library.log;

import androidx.annotation.NonNull;

/**
 * Author: zhuyongqiang
 * Date: 2021/9/10
 * Desc:
 */
public interface HiLogPrinter {
    void print(@NonNull HiLogConfig config, int level, String tag, @NonNull String printString);
}
