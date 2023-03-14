package com.example.triviol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class resultyoutubequiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultyoutubequiz)

        val textname:TextView = findViewById(R.id.usernam);
        val scoring :TextView = findViewById(R.id.scoring);
        val btnfinish: Button = findViewById(R.id.btnfinish);

        textname.text = intent.getStringExtra(ob.USER_NAME);
        val totalquestions = intent.getIntExtra(ob.TOTAL_QUESTIONS,0);
        val correctans = intent.getIntExtra(ob.TOTAL_SCORE,0);

        scoring.text ="Your score is $correctans from $totalquestions";
        btnfinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java));
            finish()
        }

    }
}