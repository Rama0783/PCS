package com.appaja0783.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.appaja0783.R
import com.appaja0783.data.model.AuthUser
import com.appaja0783.databinding.ActivityAuthBinding
import com.appaja0783.ui.home.MainActivity

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
    }

    fun onSuccess( User: AuthUser? ) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

    }
}