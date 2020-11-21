package hustle.sims.inc.lifecycleawaredemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var data: MainActivityDataGenerator
    lateinit var numberTV : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberTV = findViewById(R.id.tvNumber)

        data = MainActivityDataGenerator()
        val myRandomNumber = data.getNumber()
        numberTV.text = myRandomNumber

        Log.i(TAG, "Random number set")

//        Log.i(TAG, "Owner onCreate")
//        lifecycle.addObserver(MainActivityObserver())
    }

//    override fun onStart() {
//        super.onStart()
//
//        Log.i(TAG, "Owner onStart")
//    }
//
//    override fun onPause() {
//        super.onPause()
//
//        Log.i(TAG, "Owner onPause")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.i(TAG, "Owner onResume")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//
//        Log.i(TAG, "Owner onDestroy")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.i(TAG, "Owner onStop")
//    }

    companion object{
        private val TAG : String = MainActivity::class.java.simpleName
    }
}