package hustle.sims.inc.lifecycleawaredemo

import android.util.Log
import androidx.lifecycle.ViewModel
import java.util.*

class MainActivityViewModel: ViewModel() {

    private lateinit var myRandomNumber: String

    fun getNumber(): String{
        Log.i(TAG, "Get number")

        if(!::myRandomNumber.isInitialized){
            this.createNumber()
        }
        return myRandomNumber
    }

    private fun createNumber(){
        Log.i(TAG, "Create new number")
        val random = Random()
        myRandomNumber = "Number: ${(random.nextInt(10 - 1) + 1)}"
    }

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG, "ViewModel onCleared")
    }

    companion object{
        private val TAG : String = MainActivityViewModel::class.java.simpleName
    }
}