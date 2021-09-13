package com.otm.hi.library.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.otm.hi.library.R
import com.otm.hi.library.log.HiLog
import com.otm.hi.library.log.HiLogConfig
import com.otm.hi.library.log.HiLogType

class HiLogDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_log_demo)
        findViewById<View>(R.id.btn_log).setOnClickListener {
            printLog()
        }
    }

    private fun printLog(){
        //自定义log配置
        HiLog.log(object : HiLogConfig(){
            override fun includeThread(): Boolean {
                return true
            }

            override fun statckTraceDepth(): Int {
                return 0
            }
        }, HiLogType.E, "-----", "5566")
        HiLog.a("9900")
    }
}