package com.example.triviol

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import java.awt.font.TextAttribute

class menu_home : AppCompatActivity() {
    private var quiz1: CardView? = null;
    private var quiz2: CardView?= null;
    private var quiz3: CardView? = null;
    private var quiz4: CardView? = null;
    private var quiz5: CardView? = null;
    private var user: TextView? = null;
    private var value1:Int = 1;
    private var value2:Int = 2;
    private var value3:Int = 3;
    private var value4:Int = 4;
    private var value5:Int = 5;


    private var users_name:String? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_home)
        users_name = intent.getStringExtra(ob.USER_NAME);

        quiz1= findViewById(R.id.quiz_1_card)
        quiz2= findViewById(R.id.Quiz_2_card)
        quiz3= findViewById(R.id.Quiz_3_card)
        quiz4= findViewById(R.id.Quiz_4_card)
        quiz5= findViewById(R.id.Quiz_5_card)
        user = findViewById(R.id.name_home)
        val dialogBox = layoutInflater.inflate(R.layout.activity_dialog_box_for_starting,null);
        val myDialogoverview = Dialog(this)
        myDialogoverview.setContentView(dialogBox);
        myDialogoverview.setCancelable(true);
        myDialogoverview.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        myDialogoverview.show();






        user?.text = users_name;

        quiz1?.setOnClickListener{


                var intent = Intent(this,questionsofyoutube::class.java);
                intent.putExtra(ob.USER_NAME,user?.text.toString())
                intent.putExtra(ob.QUIZ_NUMBER,value1);
                startActivity(intent)
                finish()




        }
        quiz2?.setOnClickListener{
            var intent = Intent(this,questionsofyoutube::class.java);
            intent.putExtra(ob.USER_NAME,user?.text.toString())
            intent.putExtra(ob.QUIZ_NUMBER,value2);
            startActivity(intent)
            finish()
        }
        quiz3?.setOnClickListener{
            var intent = Intent(this,questionsofyoutube::class.java);
            intent.putExtra(ob.USER_NAME,user?.text.toString())
            intent.putExtra(ob.QUIZ_NUMBER,value3);
            startActivity(intent)
            finish()
        }
        quiz4?.setOnClickListener{
            var intent = Intent(this,questionsofyoutube::class.java);
            intent.putExtra(ob.USER_NAME,user?.text.toString())
            intent.putExtra(ob.QUIZ_NUMBER,value4);
            startActivity(intent)
            finish()
        }
        quiz5?.setOnClickListener{
            var intent = Intent(this,questionsofyoutube::class.java);
            intent.putExtra(ob.USER_NAME,user?.text.toString())
            intent.putExtra(ob.QUIZ_NUMBER,value5);
            startActivity(intent)
            finish()
        }




    }
}

