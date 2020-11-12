package jp.techacademy.kai.yasuda

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("太郎", 20, "サッカー")
        val human2 = Human("次郎", 10, "野球")

        human1.think()
        human1.say()
        human2.think()
        human2.say()

    }
}
