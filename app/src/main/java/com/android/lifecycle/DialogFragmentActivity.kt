package com.android.lifecycle

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DialogFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_fragment)
        lifecycle.addObserver(LifecycleLogger("DialogFragmentActivity"))

        val button = findViewById<Button>(R.id.dialogLauncher)
        button.setOnClickListener {
            createAndLaunchDialog()
        }

    }

    private fun createAndLaunchDialog() {
        LoggerDialogFragment().show(supportFragmentManager, null)
    }
}

