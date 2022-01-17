package com.android.lifecycle

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class LoggerFragment : Fragment(R.layout.fragment_logger){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(LifecycleLogger( "LoggerFragment"))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.dialogLauncher)
        button.setOnClickListener {
            LoggerDialogFragment().show(childFragmentManager, null)
        }
    }
}