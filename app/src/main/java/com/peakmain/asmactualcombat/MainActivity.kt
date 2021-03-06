package com.peakmain.asmactualcombat

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.peakmain.sdk.utils.LogMessageTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvName = findViewById<TextView>(R.id.tv_name)
        tvName.setOnClickListener {
            Toast.makeText(this, "你好", Toast.LENGTH_SHORT).show()
        }
        val handler = Handler(Looper.getMainLooper())

        handler.post {
            Log.e("MainActivity", "开始了")
            try {
                Thread.sleep(1000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
    }
}