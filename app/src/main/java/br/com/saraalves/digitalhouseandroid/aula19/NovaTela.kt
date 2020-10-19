package br.com.saraalves.digitalhouseandroid.aula19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.saraalves.digitalhouseandroid.R
import kotlinx.android.synthetic.main.activity_nova_tela.*

class NovaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova_tela)

//        button.setOnClickListener {
//            val intent = Intent(this, ProximaTela::class.java)
//            intent.putExtra("NAME", "Sara ")
//            intent.putExtra("IDADE", 0)
//            startActivity(intent)
//        }
        
        button.setOnClickListener {
            Toast.makeText(this, "Testando o toast", Toast.LENGTH_SHORT).show()
        }

//        checkboxVoceDeseja.setOnCheckedChangeListener {
//
//        }
    }
}