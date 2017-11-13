package com.developers.databinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.developers.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding=DataBindingUtil
                .setContentView(this,R.layout.activity_main)
        val user=User("Amanjeet Singh",21,"amanjeetsingh150@gmail.com")
        binding.setVariable(BR.user, user)
    }
}
