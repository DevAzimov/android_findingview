package com.magicapp.android_findingview.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import butterknife.BindView
import com.magicapp.android_findingview.R

class ButterKnifeActivity : AppCompatActivity() {
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.b_butter) lateinit var b_butter: Button
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.tv_butter) lateinit var tv_butter: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_butter_knife)
        initViews()
    }

    private fun initViews() {
        b_butter.setOnClickListener {
            tv_butter.text = "Butter Knife"
        }
    }
}