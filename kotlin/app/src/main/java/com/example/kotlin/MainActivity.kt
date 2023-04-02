package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText;
    private lateinit var sayHelloButton: Button;
    private lateinit var sayHelloTextView: TextView;
    private lateinit var imageView: ImageView;

    private fun initComponents(){

     nameEditText=findViewById(R.id.nameEditText);
  sayHelloButton=findViewById(R.id.sayHelloButton);
      sayHelloTextView=findViewById(R.id.sayHellotextView);
        imageView=findViewById(R.id.imageView);
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tabel)

        initComponents()

        sayHelloTextView.text=resources.getString(R.string.app_name)

        sayHelloButton.setOnClickListener{



            val raw=resources.openRawResource(R.raw.sample)
                .bufferedReader()
                .use { it.readText() }

            Log.i("RAW",raw)

            val assets=assets.open("sample.json")
                .bufferedReader()
                .use { it.readText() }

            Log.i("ASSESTS",assets)


            Log.d("PZN","Is Debug")
         Log.i("PZN","Is Info")
            Log.w("PZN","Is Warn")
            Log.e("PZN","Is Error")

            Log.i("valueResources",resources.getInteger(R.integer.maxPage).toString())
            Log.i("valueResources",resources.getBoolean(R.bool.ismylove).toString())
            Log.i("valueResources",resources.getIntArray(R.array.ayyub).joinToString (","))
            Log.i("valueResources",resources.getColor(R.color.background,theme).toString())

            sayHelloButton.setBackgroundColor(resources.getColor(R.color.teal_700,theme))

            val name=nameEditText.text.toString();
            sayHelloTextView.text=resources.getString(R.string.sayHelloTextView,name)
        }
    }
}