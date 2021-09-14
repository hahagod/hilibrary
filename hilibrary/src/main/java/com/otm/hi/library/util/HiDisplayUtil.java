package com.otm.hi.library.util;

import android.content.res.Resources;
import android.util.TypedValue;

/**
 * Author: zhuyongqiang
 * Date: 2021/9/14
 * Desc:
 */
public class HiDisplayUtil {
    public static int dp2px(float dp, Resources resources) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                resources.getDisplayMetrics());
    }
}
