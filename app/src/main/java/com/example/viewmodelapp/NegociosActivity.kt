package com.example.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class NegociosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_negocios)
    }

    fun selectedButton(view: View) {
        if( view.id == R.id.servicios_button){
            Toast.makeText(this, "Button Service", Toast.LENGTH_LONG).show()
        } else if ( view.id == R.id.portafolio_button) {
            Toast.makeText(this, "Button Portafolio", Toast.LENGTH_LONG).show()
        }
    }
}