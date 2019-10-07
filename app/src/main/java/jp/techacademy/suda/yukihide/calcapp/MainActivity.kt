package jp.techacademy.suda.yukihide.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

        val num1 : String = editText1.text.toString()
        val i1: Double = num1.toDouble()
        val num2 = editText2.text.toString()
        val i2: Double = num2.toDouble()
        //val resultNum : Double = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            //resultNum = i1 + i2
            //textView.text = Integer.toString(resultNum)
        }

        /*
        button2.setOnClickListener{
            var resultNum : Double = i1 - i2
            textView.text = Integer.toString(resultNum)
        }
        button3.setOnClickListener{
            var resultNum : Double = i1 * i2
            textView.text = Integer.toString(resultNum)
        }
        button4.setOnClickListener{
            var resultNum : Double = i1 / i2
            textView.text = Integer.toString(resultNum)
        }
        */
    }

    override fun onClick(v: View?) {
        //val intent = Intent(this, SecondActivity::class.java)
        //intent.putExtra("VALUE1", resultNum)
        //startActivity(intent)
    }
}
