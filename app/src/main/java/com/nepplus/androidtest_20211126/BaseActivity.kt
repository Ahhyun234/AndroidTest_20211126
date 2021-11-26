package com.nepplus.androidtest_20211126

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity :AppCompatActivity() {


    abstract fun setupEvents()
    abstract fun setValues()
}