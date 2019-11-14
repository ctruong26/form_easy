package com.parrot.ctruong.myform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun addNewPerson(view: View) {

        val namePerson = name.text.toString()
        val agePerson = age.text.toString().toInt()

        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra("name", namePerson)
            putExtra("age", agePerson)
        }
        startActivity(intent)
    }
}
