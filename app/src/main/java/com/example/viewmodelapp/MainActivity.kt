package com.example.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val myTextView: TextView get() = findViewById(R.id.myTextView)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myViewModel: MyViewModel by viewModels()

        myViewModel.myLiveData.observe(this) {
            text -> myTextView.text = text
        }
        val restApiAdapter = RestApiAdapter()
        val endPoint = restApiAdapter.connectionApi()

        val bookResponseCall = endPoint.getAllPost()
        bookResponseCall.enqueue( object : Callback<List<Post>> {
            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                t?.printStackTrace()
            }

            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                Log.d("",Gson().toJson(response.body()))
            }
        })



//        val myViewModel: MyViewModel by viewModels {
//            object: ViewModelProvider.Factory {
//                override fun <T : ViewModel> create(modelClass: Class<T>): T {
//                    return super.create(modelClass)
//                }
//            }
//        }
    }
}