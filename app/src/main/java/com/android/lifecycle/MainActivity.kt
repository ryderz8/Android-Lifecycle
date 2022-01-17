package com.android.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    lateinit var root : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(LifecycleLogger( "MainActivity"))

        root = findViewById(R.id.root)

        addScreens()
    }

    private fun addScreens() {
        createButton("Activity with AlertDialog") {
            val intent = Intent(this, AlertDialogActivity::class.java)
            startActivity(intent)
        }

        createButton("Activity with DialogFragment") {
            val intent = Intent(this, DialogFragmentActivity::class.java)
            startActivity(intent)
        }

        createButton("Activity with Fragment") {
            val intent = Intent(this, FragmentActivity::class.java)
            startActivity(intent)
        }

        createButton("Transparent Activity") {
            val intent = Intent(this, TransparentActivity::class.java)
            startActivity(intent)
        }

    }

    private fun createButton(txt: String, clickListener: (View) -> Unit): AppCompatButton =
        AppCompatButton(this).apply {
            text = txt
            setOnClickListener(clickListener)

            root.addView(this)
        }
}