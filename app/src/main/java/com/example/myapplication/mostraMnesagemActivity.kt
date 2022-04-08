package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MostraMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_mensagem)
        val mensagem = intent.getStringExtra(MainActivity.INFO_EXTRA_MENSAGEM)
        val textViewMensagem = findViewById<TextView>(R.id.textViewMensagem)
        textViewMensagem.text = mensagem
    }
}