package com.test.doneanimation

import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var avd: AnimatedVectorDrawableCompat
        var avd2: AnimatedVectorDrawable

        btn_animate.setOnClickListener {
            val drawable: Drawable = iv_done.drawable
            if (drawable is AnimatedVectorDrawableCompat) {
                avd = drawable
                avd.start()
            } else if (drawable is AnimatedVectorDrawable) {
                avd2 = drawable
                avd2.start()
            }
        }
    }
}