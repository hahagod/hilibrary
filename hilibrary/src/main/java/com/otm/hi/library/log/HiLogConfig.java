package com.otm.hi.library.log;

/**
 * Author: zhuyongqiang
 * Date: 2021/9/10
 * Desc: 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
 */
public abstract class HiLogConfig {

    public String getGlobalTag() {
        return "HiLog";
    }

    public boolean enable() {
        return true;
    }
}
