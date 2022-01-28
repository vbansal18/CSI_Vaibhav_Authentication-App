package com.example.signup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthProvider

class PhoneOTPverification : AppCompatActivity() {
    companion object{
        const val key = "phoneNumber"
    }

    private lateinit var auth: FirebaseAuth

    private var storeVerificationId : String? =""
    private lateinit var resendToken : PhoneAuthProvider.ForceResendingToken
    private lateinit var callbacks : PhoneAuthProvider.OnVerificationStateChangedCallbacks

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_otpverification)

        FirebaseApp.initializeApp(this)


        val phone = intent.getStringExtra(key)
//        val options = PhoneAuthOptions.newBuilder(auth)
//            .setPhoneNumber(phone.toString())       // Phone number to verify
//            .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
//            .setActivity(this)                 // Activity (for callback binding)
//            .setCallbacks(callbacks)          // OnVerificationStateChangedCallbacks
//            .build()
//        PhoneAuthProvider.verifyPhoneNumber(options)
//        auth.setLanguageCode("en")



    }
}