package com.example.signup

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val branch: Spinner = findViewById(R.id.branch)
        val year: Spinner = findViewById(R.id.year)

        signUp.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val phoneNumber = phone.editableText.toString()
                val emailAddress = email.editableText.toString()
                val intent = Intent(this@MainActivity, PhoneOTPverification::class.java)
                intent.putExtra(PhoneOTPverification.key,phoneNumber)
                sendVerificationCode()
                startActivity(intent)
            }

        })

        ArrayAdapter.createFromResource(
            this,
            R.array.branch,
            android.R.layout.simple_spinner_item,
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            branch.adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.year,
            android.R.layout.simple_spinner_item,
        ).also{adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            year.adapter = adapter
        }

    }

    fun sendVerificationCode(){

    }
    fun onRadioButtonClicked(view: android.view.View) {}
}