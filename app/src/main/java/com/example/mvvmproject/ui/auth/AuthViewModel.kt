package com.example.mvvmproject.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {
    var email:String? =null
    var password:String? =null
    var authListener :AuthListener?=null

    fun onLoginButtonClicked(view: View){
        authListener?.onStarted()
        if (email.isNullOrEmpty()||password.isNullOrEmpty()) {
        //show Error
            authListener?.onFailure("email or password is empty")
            return
        }
        authListener?.onSuccess()
        //succseed

    }
}