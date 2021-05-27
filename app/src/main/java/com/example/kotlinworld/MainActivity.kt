package com.example.kotlinworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number1 = findViewById<EditText>(R.id.etnumber1)
        var number2 = findViewById<EditText>(R.id.etNumber2)
        var add = findViewById<Button>(R.id.btnAdd)
        var subtract = findViewById<Button>(R.id.btnSubtract)
        var multiply = findViewById<Button>(R.id.btnMultiply)
        var modulus = findViewById<Button>(R.id.btnModulus)
        var etresult = findViewById<TextView>(R.id.tvResult)

        add.setOnClickListener {
            var number1 = number1.text.toString().toInt()
            var number2 = number2.text.toString().toInt()
            var result = number1 + number2

            etresult.text = "Result:$result"
        }

        subtract.setOnClickListener {
            var number1 = number1.text.toString().toInt()
            var number2 = number2.text.toString().toInt()
            var result = number1 - number2

            etresult.text = "Result:$result"
        }
        multiply.setOnClickListener {
            var number1 = number1.text.toString().toInt()
            var number2 = number2.text.toString().toInt()
            var result = number1 * number2

            etresult.text = "Result:$result"

        }
        modulus.setOnClickListener {
            var number1 = number1.text.toString().toInt()
            var number2 = number2.text.toString().toInt()
            var result = number1 / number2

            etresult.text = "Result:$result"
        }
    }
}

