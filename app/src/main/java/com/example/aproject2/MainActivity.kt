package com.example.aproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonSubmit. setOnClickListener {
            var username = editTextUsername.text.toString()
            Toast.makeText(this,"username is $username ",Toast.LENGTH_LONG).show()

            textViewUsername.text = username

                var i = Intent(this,SecondActivity::class.java)
            i.putExtra("key1",username)
            startActivity(i)
        }

    }
}