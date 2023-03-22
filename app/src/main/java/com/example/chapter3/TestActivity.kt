package com.example.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.Intent
import android.net.Uri
import com.example.chapter3.databinding.ActivityTestBinding

private const val TAG = "Activity_2"
class TestActivity : AppCompatActivity() {

    lateinit var binding : ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate")

        binding.btn2Next.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.binaracademy.com")
            startActivity(intent)
        }

        binding.btnActionSend.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,"halo deppp")
            intent.type = "text/plain"
            startActivity(intent)
        }

        binding.btnBundle.setOnClickListener {
            val intent = Intent(this, ActivityTiga::class.java)
            val bundle = Bundle()
            bundle.putString("nama", "depp")
            intent.putExtras(bundle)
            startActivity(intent)
        }

        binding.btnSerializable.setOnClickListener {
            val intent = Intent(this, ActivityTiga::class.java)
            val person = Person("depp", "depp@depp.com")
            intent.putExtra("dataPerson", person)
            startActivity(intent)
        }

        binding.btnParcelable.setOnClickListener {
            val intent = Intent(this, ActivityTiga::class.java)
            val orangParcelable = OrangParcelable("cecepp",23 )
            intent.putExtra("dataOrang", orangParcelable)
            startActivity(intent)
        }

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }



}