package com.example.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.google.firebase.auth.PhoneAuthOptions
import com.google.firebase.auth.PhoneAuthProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val branch: Spinner = findViewById(R.id.branch)
        val year: Spinner = findViewById(R.id.year)

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

    fun onRadioButtonClicked(view: android.view.View) {}
}