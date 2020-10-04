package br.com.saraalves.digitalhouseandroid.aula16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.saraalves.digitalhouseandroid.R
import kotlinx.android.synthetic.main.activity_meu_nome.*

class MeuNomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meu_nome)

        btnExibir.setOnClickListener {
            val nome = edtMeuNome.text

            txtNomeDigitado.text = nome

        }
    }



}
