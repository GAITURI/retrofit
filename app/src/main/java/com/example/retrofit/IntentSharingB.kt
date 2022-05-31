package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent_sharing_b.*

class IntentSharingB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_sharing_b)
    val bundle: Bundle? =intent.extras
        val imgPicked:Int = bundle!!.getInt("image")
        Log.d("shareData", "image name" + imgPicked.toString())
        image2.setImageResource(imgPicked)

        val sharedText:String? =intent.getStringExtra("textFromTextView")
        val sharedTextEt:String? =intent.getStringExtra("textFromEditText")

        textSample2.append("Text from TV:" + sharedText + ""  + "Text from ET:" + sharedTextEt + "")








    }
}