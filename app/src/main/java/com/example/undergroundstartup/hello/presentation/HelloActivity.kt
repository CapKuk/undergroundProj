package com.example.undergroundstartup.hello.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.undergroundstartup.R
import com.example.undergroundstartup.login.presentation.loginActivity
import com.example.undergroundstartup.util.ViewContract
import kotlinx.android.synthetic.main.activity_main.*

class HelloActivity : AppCompatActivity(), ViewContract {

    private val presenter = helloPresenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.attachView(this)

        continue_button.setOnClickListener{
            presenter.nextScreen()
        }
    }

    fun nextScreen(){
        val intent = Intent(this, loginActivity::class.java)
        startActivity(intent)
    }
}
