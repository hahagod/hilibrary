package com.otm.hi.library

import android.app.Application
import com.otm.hi.library.log.HiLogConfig
import com.otm.hi.library.log.HiLogManager

/**
 * Author: zhuyongqiang
 * Date: 2021/9/10
 * Desc:
 */
class HiApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        HiLogManager.init(object : HiLogConfig(){
            override fun getGlobalTag(): String {
                return "HiApplication Test"
            }

            override fun enable(): Boolean {
                return true
            }
        })
    }
}