package com.otm.hi.library.log;

import java.text.SimpleDateFormat;

/**
 * Author: zhuyongqiang
 * Date: 2021/9/13
 * Desc:
 */
public class HiLogMo {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss", Locale.CHINA);
    public long timeMillis;
    public int level;
    public String tag;
    public String log;

    public HiLogMo(long timeMillis, int level, String tag, String log) {
        this.timeMillis = timeMillis;
        this.level = level;
        this.tag = tag;
        this.log = log;
    }

    public String flattenedLog() {
        return getFlattened() + "\n" + log;
    }

    public String getFlattened() {
        return format(timeMillis) + '|' + level + '|' + tag + "|:";
    }

    private String format(long timeMillis) {
        return sdf.format(timeMillis);
    }
}