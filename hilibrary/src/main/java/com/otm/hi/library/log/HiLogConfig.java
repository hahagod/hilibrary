package com.otm.hi.library.log;

/**
 * Author: zhuyongqiang
 * Date: 2021/9/10
 * Desc:
 */
public abstract class HiLogConfig {

    public String getGlobalTag() {
        return "HiLog";
    }

    public boolean enable() {
        return true;
    }
}
