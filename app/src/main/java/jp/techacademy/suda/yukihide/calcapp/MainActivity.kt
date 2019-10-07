package jp.techacademy.suda.yukihide.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

//class MainActivity : AppCompatActivity(), View.OnClickListener {
class MainActivity : AppCompatActivity() {


    //var i1 : Double = num1.toDouble()
    //var num2 = editText2.text.toString()
    //var i2 : Double = num2.toDouble()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            var num1 : String = editText1.text.toString()
            var i1 : Double = num1.toDouble()
            textView.text = i1
        }

/*
        button2.setOnClickListener{
            resultNum = num1 - num2
        }
        button3.setOnClickListener{
            resultNum = num1 * num2
        }
        button4.setOnClickListener{
            resultNum = num1 / num2
        }
*/
    }
/*
    override fun onClick(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE1", resultNum)
        startActivity(intent)

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE1", 10)
        intent.putExtra("VALUE2", 20)
        startActivity(intent)
    }
*/
}
