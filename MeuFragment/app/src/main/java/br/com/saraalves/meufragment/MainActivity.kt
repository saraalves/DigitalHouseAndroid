package br.com.saraalves.meufragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var manager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manager = supportFragmentManager

        val meuPrimeiroFragment = MeuPrimeiroFragment()
        val meuSegundoFragment = MeuSegundoFragment()

        btn1.setOnClickListener {
            val transaction =  manager.beginTransaction()
            transaction.replace(R.id.fragmentContainer, meuPrimeiroFragment)
            transaction.commit()
        }
        btn2.setOnClickListener{
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.fragmentContainer, meuSegundoFragment)
            transaction.commit()
        }
    }
}