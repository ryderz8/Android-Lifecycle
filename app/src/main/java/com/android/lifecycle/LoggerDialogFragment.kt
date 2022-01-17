package com.android.lifecycle

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class LoggerDialogFragment : DialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(LifecycleLogger( "DialogFragment"))
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .setTitle("DialogFragment")
            .setMessage("check logs to see the lifecycle events")
            .setPositiveButton("close") { dialog,_ ->
                dialog.cancel()
            }
            .create()
}