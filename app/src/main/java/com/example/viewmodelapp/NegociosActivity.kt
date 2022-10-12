package com.example.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NegociosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_negocios)

        val restApiAdapter = RestApiAdapter()
        val endPoint = restApiAdapter.connectionApi()

        val bookResponseCall = endPoint.getAllPost()
        bookResponseCall.enqueue( object : Callback<List<Post>> {
            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                t?.printStackTrace()
            }

            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                Log.d("", Gson().toJson(response.body()))
                val posts = response?.body()
                Log.d("RESP POST", Gson().toJson(posts))
                posts?.forEach {
                    Log.d("RESP POST", it.body)
                }

            }
        })
    }

    fun selectedButton(view: View) {
        if( view.id == R.id.servicios_button){
            Toast.makeText(this, "Button Service", Toast.LENGTH_LONG).show()
        } else if ( view.id == R.id.portafolio_button) {
            Toast.makeText(this, "Button Portafolio", Toast.LENGTH_LONG).show()
        }
    }
}