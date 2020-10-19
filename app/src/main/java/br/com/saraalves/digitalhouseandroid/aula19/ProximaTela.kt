package br.com.saraalves.digitalhouseandroid.aula19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.saraalves.digitalhouseandroid.R
import kotlinx.android.synthetic.main.activity_proxima_tela.*

class ProximaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proxima_tela)

        val nome = intent.getStringExtra("NAME")
        val idade = intent.getIntExtra("IDADE", 0)

        textView.text = nome + idade

    }
}