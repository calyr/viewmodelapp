package com.example.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
//    private val myTextView: TextView get() = findViewById(R.id.myTextView)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val myViewModel: MyViewModel by viewModels()
//
//        myViewModel.myLiveData.observe(this) {
//            text -> myTextView.text = text
//        }




//        val myViewModel: MyViewModel by viewModels {
//            object: ViewModelProvider.Factory {
//                override fun <T : ViewModel> create(modelClass: Class<T>): T {
//                    return super.create(modelClass)
//                }
//            }
//        }
    }
}