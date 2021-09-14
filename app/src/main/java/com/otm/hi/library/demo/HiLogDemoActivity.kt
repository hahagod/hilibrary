package com.otm.hi.library.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.otm.hi.library.R
import com.otm.hi.library.log.*

class HiLogDemoActivity : AppCompatActivity() {

    var viewPrinter: HiViewPrinter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_log_demo)
        viewPrinter = HiViewPrinter(this)
        findViewById<View>(R.id.btn_log).setOnClickListener {
            printLog()
        }

        viewPrinter!!.viewProvider.showFloatingView()
    }

    private fun printLog(){
        HiLogManager.getInstance().addPrinter(viewPrinter)
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