package com.example.aplicacionfct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplicacionfct.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.compra.setOnClickListener {
            val intent=Intent(this,HacerCompra::class.java)
            startActivity(intent)
        }
        bind.horario.setOnClickListener {
            val intent=Intent(this, Horario::class.java)
            startActivity(intent)
        }
        bind.calculadora.setOnClickListener {
            val intent=Intent(this,Calculadora::class.java)
            startActivity(intent)
        }
        bind.establecimientos.setOnClickListener {
            val intent=Intent(this,Dondecompro::class.java)
            startActivity(intent)
        }
    }
}