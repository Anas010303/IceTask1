package com.example.ice1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HelloWorldActivity : AppCompatActivity() {

    private lateinit var helloText: TextView
    private lateinit var languageEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)

        helloText = findViewById(R.id.helloTextView)
        languageEditText = findViewById(R.id.languageEditText)

        setLanguageButtons()
    }

    private fun setLanguageButtons() {
        val englishButton = findViewById<Button>(R.id.English)
        val italianButton = findViewById<Button>(R.id.Italian)
        val frenchButton = findViewById<Button>(R.id.French)
        val spanishButton = findViewById<Button>(R.id.Spanish)
        val afrikaansButton = findViewById<Button>(R.id.Afrikaans)

        englishButton.setOnClickListener {
            displayText("Hello World")
        }

        italianButton.setOnClickListener {
            displayText("Ciao Mondo")
        }

        frenchButton.setOnClickListener {
            displayText("Bonjour le Monde")
        }

        spanishButton.setOnClickListener {
            displayText("Hola Mundo")
        }

        afrikaansButton.setOnClickListener {
            displayText("Hallo Wêreld")
        }
    }

    private fun displayText(text: String) {
        helloText.text = text
    }
}




