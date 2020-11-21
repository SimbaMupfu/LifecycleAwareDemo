package hustle.sims.inc.lifecycleawaredemo

import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MainActivityObserver: LifecycleObserver {

    lateinit var model: MainActivityViewModel

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.i(TAG, "Observer ON_CREATE")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(){
        Log.i(TAG, "Observer ON_START")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        Log.i(TAG, "Observer ON_PAUSE")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        Log.i(TAG, "Observer ON_RESUME")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(){
        Log.i(TAG, "Observer ON_DESTROY")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        Log.i(TAG, "Observer ON_STOP")
    }

    companion object{
        private val TAG : String = MainActivityObserver::class.java.simpleName
    }
}