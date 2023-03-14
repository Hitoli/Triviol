package com.example.triviol

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputBinding
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.triviol.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import java.net.PasswordAuthentication

class MainActivity : AppCompatActivity() {
    //binding
    private lateinit var binding: ActivityMainBinding;
    //firebase AUTHENTICATION
    private lateinit var User: FirebaseAuth;
    // variables
    private lateinit var password:String;
    private lateinit var NameField:String;
    private lateinit var NameButton:Button;
    private lateinit var register:Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //firebase Auth
     //   User = FirebaseAuth.getInstance();
        NameButton.setOnClickListener {
            val userID = User.currentUser?.uid;
            //names and fields
            NameField = binding.EnterEmail.text.toString();
            NameButton = binding.ButtonName;
            password = binding.EnterPassword.text.toString();
            register = binding.Registerwithus;

            User.signInWithEmailAndPassword(NameField!!, password!!)
                .addOnCompleteListener { mTask ->
                    if (mTask.isSuccessful) {
                        //   val nameofpersonlogin = binding.Usernameperson.text.toString();
                        //val UserLocationLogin = binding.LocationofuserLogin.text.toString();
                        //  Log.e("nameofpersonlogin", nameofpersonlogin.toString());

                        // Log.e("nameofpersonlogin", userID.toString());

                        // val nameitis = hashMapOf(
                        //    "username" to nameofpersonlogin,
                        //   "ID" to userID,
                        //   "locationofUserLogin" to UserLocationLogin
                        //   )
                        // val storee = fstore.collection("Identity").document(userID!!).set(nameitis)
                        //  Log.e("STOREE",storee.toString());
                        //    fstore.collection("Identity").add(nameitis).addOnSuccessListener {
                        //      Toast.makeText(this, "SUCCESS", Toast.LENGTH_SHORT).show()
                        //  }.addOnFailureListener{
                        //    Toast.makeText(this, "FAILED", Toast.LENGTH_SHORT).show()
                        //  }

                        val intent = Intent(this, menu_home::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(this, mTask.exception!!.message, Toast.LENGTH_SHORT)
                            .show()
                    }
                }
        }


        register.setOnClickListener {
            Log.e("REGISTER","REDIRECTING TO REGISTER PAGE")
            val intent =Intent(this, registerwithus::class.java);
            startActivity(intent)
            finish();
        }



        //Firebase if user is already logged in
       // if(user.currentUser!=null) {
       //     startActivity(Intent(this, menu_home::class.java))
       //     finish();
      //  }

        // Entering Auth
        NameButton.setOnClickListener{
         //  OnNameButtonPress()
        }
    }


}