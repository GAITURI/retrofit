package com.example.retrofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView


class IntentSharingA : AppCompatActivity() {
    lateinit var imageLogo: ImageView
    lateinit var textView:TextView
     lateinit var textSample1:String
     lateinit var editText: EditText
     lateinit var textEdit:String
     lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_sharing)



        imageLogo =findViewById(R.id.image)
        textView= findViewById(R.id.textSample)
        editText= findViewById(R.id.edit)
        btn= findViewById(R.id.btnClick)




        //fetch text

        textSample1= textView.text as String

            //set the onClick for transition
        btn.setOnClickListener {
            textEdit = editText.text.toString()
            Log.d("shareData", "text from Textview" + textSample1 +"text from EditText" + textEdit ) //logging info
            val intentSharingB = Intent(this@IntentSharingA,IntentSharingB::class.java)
            //sharing data
            //image
            intentSharingB.putExtra("image",R.drawable.marvel)
            intentSharingB.putExtra("textFromTextView,",textSample1)
            intentSharingB.putExtra("textFromEditText,",textEdit)


            startActivity(intentSharingB)
        }



    }
}