package com.example.undergroundstartup.hello.presentation

import com.example.undergroundstartup.util.BasePresenter

class helloPresenter : BasePresenter<HelloActivity>() {
    fun nextScreen(){
        view?.nextScreen()
    }
}