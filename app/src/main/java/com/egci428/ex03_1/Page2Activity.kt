package com.egci428.ex03_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_page2.*

class Page2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        val bundle = intent.extras
        val result: String = "Result"
        val mytext: String
        val username: String
        val password: String
        //result = "Result"

            if (bundle != null)
            {
                username = bundle.getString("username")
                password = bundle.getString("password")
                    if(username == "lalita" && password == "1234")
                    {
                        usernameText.setText("Username: $username")
                        passwordText.setText("Password: $password")
                    }
                    else
                    {
                        finish()

                    }

            }

        backBtn.setOnClickListener {
            finish()
        }
    }
}
