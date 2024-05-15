package com.example.calc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var numero1EditText: EditText? = null
    var numero2EditText: EditText? = null

    var adicaoButton: Button? = null
    var subtracaoButton: Button? = null
    var multiplicacaoButton: Button? = null
    var divisaoButton: Button? = null

    var resultadoTextView: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        vincularComponentes();

    

    private void vincularComponentes() {

        numero1EditText = findViewById(R.id.numero1EditText);
        numero2EditText = findViewById(R.id.numero2EditText);

        adicaoButton = findViewById(R.id.adicaoButton);
        subtracaoButton = findViewById(R.id.subtracaoButton);
        multiplicacaoButton = findViewById(R.id.multiplicacaoButton);
        divisaoButton = findViewById(R.id.divisaoButton);

        resultadoTextView = findViewById(R.id.resultadoTextView);

    }
}