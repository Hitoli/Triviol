package com.example.triviol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class Dialog_box_for_starting : AppCompatActivity() {

    val builder = AlertDialog.Builder(this);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_box_for_starting)
    }
}