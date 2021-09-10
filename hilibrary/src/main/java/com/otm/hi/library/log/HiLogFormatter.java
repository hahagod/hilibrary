package com.otm.hi.library.log;

/**
 * Author: zhuyongqiang
 * Date: 2021/9/10
 * Desc:
 */
public interface HiLogFormatter<T> {
    String format(T data);
}
