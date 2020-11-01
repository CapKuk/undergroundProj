package com.example.undergroundstartup.util

open class BasePresenter <View : ViewContract> {
    var view: View? = null
    fun attachView(view : View){
        this.view = view
        onViewAttached()
    }
    open fun onViewAttached(){}
    fun detachView(){
        view = null
    }
}