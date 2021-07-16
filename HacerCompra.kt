package com.example.aplicacionfct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplicacionfct.databinding.ActivityHacerCompraBinding

class HacerCompra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind=ActivityHacerCompraBinding.inflate(layoutInflater)
        setContentView(bind.root)
    }
}