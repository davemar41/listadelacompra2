package com.example.aplicacionfct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.aplicacionfct.databinding.ActivityDondecomproBinding

class Dondecompro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind=ActivityDondecomproBinding.inflate(layoutInflater)
        setContentView(bind.root)
        var seleccion= arrayListOf<String>()
        var seleccion2:String=""
        val productosmercadona=arrayListOf("galletas", "jamon","batido","lechuga","cerveza")

        bind.mercadona.setOnClickListener {
            seleccion2="Voy a comprar en Mercadona, acceso a sus productos"
            seleccion=productosmercadona


        }
        bind.miseleccion.setOnClickListener {
            val builder=AlertDialog.Builder(this)
            builder.setTitle(seleccion2)
            builder.setMessage(seleccion.toString())
            builder.setPositiveButton("ok"){
                dialog,wich -> Toast.makeText(applicationContext,"ok", Toast.LENGTH_LONG).show()
            }
            builder.show()
        }
    }
}