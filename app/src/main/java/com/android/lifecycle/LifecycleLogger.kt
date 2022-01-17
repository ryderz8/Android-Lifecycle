package com.android.lifecycle

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class LifecycleLogger(
    tag: String? = null
) : DefaultLifecycleObserver {

    private val tag = if (tag != null){
        "Lifecycle Logger-$tag"
    }else{
        "Lifecycle Logger"
    }

    override fun onCreate(owner: LifecycleOwner) {
        log("onCreate")
    }

    override fun onStart(owner: LifecycleOwner) {
        log("onStart")
    }

    override fun onResume(owner: LifecycleOwner) {
        log("onResume")
    }

    override fun onPause(owner: LifecycleOwner) {
        log("onPause")
    }

    override fun onStop(owner: LifecycleOwner) {
        log("onStop")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        log("onDestroy")
    }

    private fun log(message : String) {
        Log.d(tag, message)
    }
}