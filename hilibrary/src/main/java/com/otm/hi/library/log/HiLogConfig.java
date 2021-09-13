package com.otm.hi.library.log;

/**
 * Author: zhuyongqiang
 * Date: 2021/9/10
 * Desc: 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
 */
public abstract class HiLogConfig {
    static int MAX_LEN = 512;

    static HiStackTraceFormatter HI_STACK_TRACE_FORMATTER = new HiStackTraceFormatter();

    static HiThreadFormatter HI_THREAD_FORMATTER = new HiThreadFormatter();

    public JsonParser injectJsonParser() {
        return null;
    }

    public String getGlobalTag() {
        return "HiLog";
    }

    public boolean includeThread() {
        return false;
    }

    public int statckTraceDepth(){
        return 5;
    }

    public HiLogPrinter[] printers(){
        return null;
    }

    public boolean enable() {
        return true;
    }

    public interface JsonParser {
        String toJson(Object src);
    }
}
