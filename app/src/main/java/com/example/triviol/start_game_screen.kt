package com.example.triviol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class start_game_screen : AppCompatActivity() {
    private var username:String?=null;
    private var namehi:TextView?=null;
    private var buttonstartgame:Button?=null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_game_screen)
        username = intent.getStringExtra(ob.USER_NAME);
        namehi = findViewById(R.id.hiname);
        buttonstartgame = findViewById(R.id.buttonstart_game)
        namehi?.text="Hi,${username}";
        buttonstartgame?.setOnClickListener{
            var intent= Intent(this,menu_home::class.java)
            intent.putExtra(ob.USER_NAME,username)
            startActivity(intent);
            finish();
        }



    }
}