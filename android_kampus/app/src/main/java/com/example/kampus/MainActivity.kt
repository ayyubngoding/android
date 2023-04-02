package com.example.kampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText;
    private lateinit var sayHelloButton: Button;
    private lateinit var button: Button;
    private lateinit var sayHelloTextView: TextView;
    private lateinit var editText: EditText;
    private lateinit var judul:TextView;
    private lateinit var btn:Button;

    private fun initComponents(){

        nameEditText=findViewById(R.id.idEditTextTextPersonName);
        sayHelloButton=findViewById(R.id.idButton2);
        sayHelloTextView=findViewById(R.id.textSayhello);
        button=findViewById(R.id.idButton);
        editText=findViewById(R.id.editText);
        judul = findViewById(R.id.judul);
        btn=findViewById(R.id.button)
    }





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.widget)


        initComponents()
        sayHelloButton.setOnClickListener{
            sayHelloButton.setTextColor(resources.getColor(R.color.white))
            sayHelloButton.setBackgroundColor(resources.getColor(R.color.teal_700,theme))
            val name=nameEditText.text.toString();
            sayHelloTextView.text="Hello "+ name
        }


        button.setOnClickListener {
          nameEditText.setText("")
           sayHelloTextView.text=" "

        }

        btn.setOnClickListener {
            val editt=editText.text.toString()
            judul.text=" "
            judul.text=editt
        }
    }
}