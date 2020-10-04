package br.com.saraalves.digitalhouseandroid.aula16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.saraalves.digitalhouseandroid.R
import kotlinx.android.synthetic.main.activity_conversor.*

class ConversorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor)

        btnConverter.setOnClickListener {
            val temperaturaC = edtTemperatura.text.toString().toDouble()

            val temperaturaF = conversorTemperaturaF(temperaturaC)

            txtTemperaturaConvertida.text = temperaturaF.toString()
        }
    }

    fun conversorTemperaturaF(num: Double): Double {
        return ((num * 9) / 5) + 32

    }
}
