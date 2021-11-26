package com.nepplus.androidtest_20211126

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.nepplus.androidtest_20211126.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding
    var mRandomLottoNumArr = ArrayList<Int>()
    var mMyLottoNumArr = ArrayList<TextView>()
    lateinit var mHandler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        binding.btnBuyLotto.setOnClickListener {

            makeLottoNum()

        }
    }

    fun makeLottoNum() {

        mRandomLottoNumArr.clear()

        for (i in 0 until 6) {
            while (true) {
                var randomNum = (Math.random() * 45 + 1).toInt()
                var isDupOk = mRandomLottoNumArr.contains(randomNum)
                if (isDupOk) {
                    mRandomLottoNumArr.add(randomNum)
                    break

                }
            }
        }

    }

    override fun setValues() {

        mHandler = Handler(Looper.getMainLooper())

        mMyLottoNumArr = arrayListOf(
            binding.myNum1,
            binding.myNum2,
            binding.myNum3,
            binding.myNum4,
            binding.myNum5,
            binding.myNum6)


    }
}