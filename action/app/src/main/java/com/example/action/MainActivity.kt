package com.example.action

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var edittext:EditText
    private lateinit var radiogrup:RadioGroup
    private lateinit var merah:RadioButton
    private lateinit var biru:RadioButton
    private lateinit var hijau:RadioButton
    private lateinit var checkbox: CheckBox
    private lateinit var btnok:Button
    private lateinit var btncancel:Button
    private lateinit var texttampil:TextView

    fun initcomponents(){
        edittext=findViewById(R.id.edittext)
        radiogrup=findViewById(R.id.idgrup)
        merah=findViewById(R.id.radioButtonmerah)
        biru=findViewById(R.id.radioButtonbiru)
        hijau=findViewById(R.id.radioButtonhijau)
        checkbox=findViewById(R.id.checkBox)
        btnok=findViewById(R.id.ok)
        btncancel=findViewById(R.id.cancel)
        texttampil=findViewById(R.id.textViewtampil)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initcomponents()

        btnok.setOnClickListener {
        val simpanteks=edittext.text.toString()

            val warna=findViewById<RadioButton>(radiogrup.checkedRadioButtonId)
            if (warna==merah){
                texttampil.setTextColor(Color.parseColor("#ff0000"))
            }else  if (warna==biru){
                texttampil.setTextColor(Color.parseColor("#0000ff"))
            }else if (warna==merah){
                texttampil.setTextColor(Color.parseColor("#008000"))
            }

            val cb=if (checkbox.isChecked)"CheckBox dicentang" else "CheckBox tidak dicentang"

            texttampil.text=simpanteks +"\n"+cb
        }

        btncancel.setOnClickListener {
            edittext.setText("")
            radiogrup.clearCheck()
            checkbox.isChecked=false
            texttampil.text=""
        }
    }
}