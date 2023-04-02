package com.example.wiget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText;
  private lateinit var judul: TextView;
    private lateinit var btn:Button

    private fun initComponents(){
        editText=findViewById(R.id.editText);
        judul = findViewById(R.id.judul);
        btn=findViewById(R.id.button)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

initComponents()

        btn.setOnClickListener {
            val editt=editText.text.toString()
            judul.text=" "
            judul.text=editt
            editText.setText("")
        }

    }
}