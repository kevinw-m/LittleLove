package cc.littlelove

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/**
 * @author kevin
 * @date 2022/12/28
 */
open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BaseActivity", javaClass.simpleName + " onCreate...")
        ActivityCollector.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BaseActivity", javaClass.simpleName + " onDestroy...")
        ActivityCollector.removeActivity(this)
    }
}