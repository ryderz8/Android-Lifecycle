package com.android.lifecycle
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        lifecycle.addObserver(LifecycleLogger( "FragmentActivity"))

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.root, LoggerFragment(), null)
                .commit()
        }
    }
}

