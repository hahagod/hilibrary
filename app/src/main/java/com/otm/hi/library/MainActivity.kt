package com.otm.hi.library

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.otm.hi.library.demo.HiLogDemoActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.tv_hilog -> {
                startActivity(Intent(this, HiLogDemoActivity::class.java))
            }
        }
    }
}