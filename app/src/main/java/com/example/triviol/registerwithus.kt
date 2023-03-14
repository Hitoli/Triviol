package com.example.triviol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triviol.databinding.ActivityMainBinding
import com.example.triviol.databinding.ActivityRegisterwithusBinding
import com.google.firebase.auth.FirebaseAuth

class registerwithus : AppCompatActivity() {
    //binding
    private lateinit var binding: ActivityRegisterwithusBinding;
    //firebase AUTHENTICATION
    private lateinit var user: FirebaseAuth;
    // variables
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterwithusBinding.inflate(layoutInflater);
        setContentView(binding.root)
    }
}