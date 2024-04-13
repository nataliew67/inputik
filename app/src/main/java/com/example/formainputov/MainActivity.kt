package com.example.formainputov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    private lateinit var zpradioButton2: RadioButton
    private lateinit var zpsumEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        zpradioButton2 = findViewById(R.id.zpradioButton2)
        zpsumEditText = findViewById(R.id.zpsumEditText)

        zpradioButton2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                zpsumEditText.visibility = View.VISIBLE
            } else {
                zpsumEditText.visibility = View.GONE
            }

        }
    }
}





