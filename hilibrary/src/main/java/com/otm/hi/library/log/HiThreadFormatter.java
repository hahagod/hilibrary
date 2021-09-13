package com.otm.hi.library.log;

/**
 * Author: zhuyongqiang
 * Date: 2021/9/13
 * Desc:
 */
public class HiThreadFormatter implements HiLogFormatter<Thread>{

    @Override
    public String format(Thread data) {
        return "Thread:" + data.getName();
    }
}
