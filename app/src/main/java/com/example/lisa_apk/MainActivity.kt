package com.example.lisa_apk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click_Botoon()
        click_botoonArma()
        click_botoonCatalogo()
    }
    fun click_Botoon() {
        btnIntroduccion.setOnClickListener(){
            val Introduccion: Intent = Intent(applicationContext, introduccion::class.java)
            startActivity(Introduccion)
        }
    }
    fun click_botoonArma() {
        btnArmaTuPc.setOnClickListener(){
            val ArmaTuPc: Intent = Intent(applicationContext, arma_tu_pc::class.java)
            startActivity(ArmaTuPc)
        }
    }
    fun click_botoonCatalogo() {
        btnCatalogo.setOnClickListener(){
            val Catalogo: Intent = Intent(applicationContext, catalogo::class.java)
            startActivity(Catalogo)
        }
    }
}

