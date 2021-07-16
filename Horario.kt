package com.example.aplicacionfct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.aplicacionfct.databinding.ActivityHorarioBinding

class Horario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind=ActivityHorarioBinding.inflate(layoutInflater)
        setContentView(bind.root)
        val spinner=bind.spinner
        val lista= listOf("mañana","tarde","noche")
        val adaptador=ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner.adapter=adaptador

        val listadehoras=bind.mishoras
        val mishoras= listOf("9:00 a 12:00","12:00 a 14:00","14:00 a 16:00","16:00 a 18:00","18:00 a 20:00","20:00 a 22:00")

         val adaptador2=ArrayAdapter(this,android.R.layout.simple_list_item_1,mishoras)
        listadehoras.adapter=adaptador2
    }
}