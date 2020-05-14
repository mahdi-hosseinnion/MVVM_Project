package com.example.mvvmproject.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmproject.R
import com.example.mvvmproject.databinding.ActivityLoginBinding
import com.example.mvvmproject.util.toast

class LoginActivity : AppCompatActivity() ,
AuthListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    val binding:ActivityLoginBinding =DataBindingUtil.setContentView(this,R.layout.activity_login)
    val viewModel=ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewModel=viewModel
        viewModel.authListener=this

    }

    override fun onStarted() {
        toast("login started")
    }

    override fun onSuccess() {
        toast("login success")
    }

    override fun onFailure(message: String) {
        toast("login failed")
    }
}
