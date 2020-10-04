package br.com.saraalves.digitalhouseandroid.aula16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.saraalves.digitalhouseandroid.R
import kotlinx.android.synthetic.main.activity_calculo_salario.*

class CalculoSalarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo_salario)

        btnCalcular.setOnClickListener {
            val horasTrabalhadas = edtHorasTrabalhadas.text.toString().toDouble()
            val valorDaHora = edtValorDaHora.text.toString().toDouble()

            val result = calcularSalario(valorDaHora, horasTrabalhadas)

            txtResult.text = result.toString()
        }
    }

    fun calcularSalario(horasTrab: Double, valorDaHora: Double): Double {
        return valorDaHora * horasTrab
    }
}