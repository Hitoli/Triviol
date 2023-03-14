package com.example.triviol

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import org.w3c.dom.Text

class questionsofyoutube : AppCompatActivity(), OnClickListener {
    private lateinit var timer: CountDownTimer;
    private var progressBar:ProgressBar?=null;
    private var textprogress: TextView?= null;

    private var questionstext:TextView?=null;

    private var imagery:ImageView? = null;

    private var optionone:TextView? = null;
    private var optiontwo:TextView?= null;
    private var optionthree:TextView? = null;
    private var optionfour: TextView? = null;

    private var btnsubmit:Button? = null;

    private var mQuestionslist:ArrayList<Questionsweneed>? = null;
    private var currentposition: Int =1;
    private var mselectedoption: Int =0;
    private var correctans: Int =0;
    private var timeforquestions:Long = 5000;
    private var timetogo:Long = 10;
    private var username:String?=null;
    private var question_number:Int? = null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionsofyoutube)
        username = intent.getStringExtra(ob.USER_NAME);
        question_number = intent.getIntExtra(ob.QUIZ_NUMBER,0);

        var timers: TextView = findViewById(R.id.timerforquestions);


        progressBar = findViewById(R.id.Progressyoutubebar);
        textprogress = findViewById(R.id.progresstext);
        questionstext= findViewById(R.id.questionstext);
        optionone = findViewById(R.id.optionone);
        optiontwo = findViewById(R.id.optiontwo);
        optionthree = findViewById(R.id.optionthree);
        optionfour = findViewById(R.id.optionfour);
        btnsubmit = findViewById(R.id.ButtonSubmit);
        optionone?.setOnClickListener(this);
        optiontwo?.setOnClickListener(this);
        optionthree?.setOnClickListener(this);
        optionfour?.setOnClickListener(this);
        btnsubmit?.setOnClickListener(this);

        when(question_number){
            1->{
                mQuestionslist=ob.youtubeQuestions();
                Questionsmaking();
            }
            2->{
                mQuestionslist=ob.quizofbowlers();
                Questionsmaking();
            }
            3->{
                mQuestionslist=ob.youtubeQuestions();
                Questionsmaking();
            }
            4->{
                mQuestionslist=ob.quizofbowlers();
                Questionsmaking();
            }
            5->{
                mQuestionslist=ob.youtubeQuestions();
                Questionsmaking();
            }
        }






        timer = object :CountDownTimer(timeforquestions,  timetogo){
            override fun onTick(remaining: Long) {
                timers.text =(remaining/1000).toString();

            }

            override fun onFinish() {

                timer.cancel();
                timer.start();
                currentposition++;
                btnsubmit?.setBackgroundColor(Color.parseColor("#F8C3D3"))
                if(currentposition<=mQuestionslist!!.size){
                    Questionsmaking();
                }else{
                    timers.text="Done!"
                    val intent =Intent(this@questionsofyoutube,resultyoutubequiz::class.java);
                    startActivity(intent);
                    finish()
                    timer.cancel()

                }
            }
        }
    }
    override fun onStart(){
        super.onStart()
        timer.start();
    }



    private fun Questionsmaking(){
        defaultoption()
        val questions: Questionsweneed = mQuestionslist!![currentposition-1];
        progressBar?.progress = currentposition;
        textprogress?.text="$currentposition/${mQuestionslist!!.size}"
        questionstext?.text = questions.questions;
        optionone?.text = questions.optone;
        optiontwo?.text = questions.opttwo;
        optionthree?.text = questions.optthree;
        optionfour?.text = questions.optfour;
        if(currentposition==mQuestionslist!!.size){
            btnsubmit?.text="Finish";
        }

    }
    private fun defaultoption(){
        val options =ArrayList<TextView>();
        optionone?.let{
            options.add(0,it);
        }
        optiontwo?.let{
            options.add(1,it);
        }
        optionthree?.let{
            options.add(2,it);
        }
        optionfour?.let{
            options.add(3,it);
        }
        for(option in options) {
            option.setTextColor(Color.parseColor("#36454F"));
            option.typeface = Typeface.DEFAULT;
            option.background = ContextCompat.getDrawable(this,R.drawable.buttonborder);
        }
    }
    private fun selectedOptionView(textView: TextView,selectionoptionnum:Int){
        defaultoption();
        mselectedoption = selectionoptionnum;
        textView.setTextColor(Color.parseColor("#36454F"))
        textView.setTypeface(textView.typeface,Typeface.BOLD);
        textView.background = ContextCompat.getDrawable(this,R.drawable.buttonborder);
    }

    override fun onClick( view: View) {
        when(view.id){
            R.id.optionone->{
                optionone?.let{
                    selectedOptionView(it,1);
                    btnsubmit?.isEnabled = true;
                    btnsubmit?.setBackgroundColor(Color.parseColor("#4F91CD"))

                }
            }
            R.id.optiontwo->{
                optiontwo?.let{
                    selectedOptionView(it,2);
                    btnsubmit?.isEnabled = true;
                    btnsubmit?.setBackgroundColor(Color.parseColor("#4F91CD"))

                }
            }
            R.id.optionthree->{
                optionthree?.let{
                    selectedOptionView(it,3);
                    btnsubmit?.isEnabled = true;
                    btnsubmit?.setBackgroundColor(Color.parseColor("#4F91CD"))

                }
            }
            R.id.optionfour->{
                optionfour?.let{
                    selectedOptionView(it,4);
                    btnsubmit?.isEnabled = true;
                    btnsubmit?.setBackgroundColor(Color.parseColor("#4F91CD"))

                }

            }
            R.id.ButtonSubmit->{
                timer.cancel();
                timer.start();
                optionone?.setOnClickListener(null)
                optiontwo?.setOnClickListener(null)
                optionthree?.setOnClickListener(null)
                optionfour?.setOnClickListener(null)

                if(mselectedoption==0){
                    currentposition++;
                    optionone?.setOnClickListener(this);
                    optiontwo?.setOnClickListener(this);
                    optionthree?.setOnClickListener(this);
                    optionfour?.setOnClickListener(this);
                    btnsubmit?.setBackgroundColor(Color.parseColor("#F8C3D3"))

                    when{
                        currentposition<=mQuestionslist!!.size->{
                            Questionsmaking();
                            btnsubmit?.isEnabled = false;

                        }else->{
                            val intent =Intent(this,resultyoutubequiz::class.java);
                        intent.putExtra(ob.USER_NAME,username);
                        intent.putExtra(ob.TOTAL_QUESTIONS,mQuestionslist!!.size);
                        intent.putExtra(ob.TOTAL_SCORE,correctans);
                        startActivity(intent);
                        finish();
                    }

                    }
                }else{
                    val question = mQuestionslist?.get(currentposition-1);
                    if(question!!.correctans!= mselectedoption){
                        answerview(mselectedoption,R.drawable.wrongans);
                    }else{
                        correctans++;
                    }
                    answerview(question.correctans,R.drawable.correctans);
                    mselectedoption=0;
                }
            }
        }
    }
    private fun answerview(answer:Int, drawableView: Int)
    {
        when(answer){
            1->{
                optionone?.background= ContextCompat.getDrawable(this,drawableView);
            }
            2->{
                optiontwo?.background= ContextCompat.getDrawable(this,drawableView);
            }
            3->{
                optionthree?.background= ContextCompat.getDrawable(this,drawableView);
            }
            4->{
                optionfour?.background= ContextCompat.getDrawable(this,drawableView);
            }
        }
    }


}




