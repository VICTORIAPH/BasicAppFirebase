package com.example.appfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Firebase.database
        val myRef  = database.reference

        myRef.child("carta" ).child("1").setValue(Card("1", "rosa", "diamantes"))
         myRef.child("carta" ).child("2").setValue(Card("2", "negro", "corazones"))
        myRef.child("carta" ).child("3").setValue(Card("3", "rojo", "diamantes"))





    }
}