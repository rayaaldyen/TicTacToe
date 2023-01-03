package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var player="p1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener{
            buttonClick(btn1)
        }
        btn2.setOnClickListener{
            buttonClick(btn2)
        }
        btn3.setOnClickListener{
            buttonClick(btn3)
        }
        btn4.setOnClickListener{
            buttonClick(btn4)
        }
        btn5.setOnClickListener{
            buttonClick(btn5)
        }
        btn6.setOnClickListener{
            buttonClick(btn6)
        }
        btn7.setOnClickListener{
            buttonClick(btn7)
        }
        btn8.setOnClickListener{
            buttonClick(btn8)
        }
        btn9.setOnClickListener{
            buttonClick(btn9)
        }
        btnReset.setOnClickListener {
            reset()
        }



    }
    fun buttonClick(btn:Button){

            if(btn.text=="" ){
                if(player=="p1"){
                    player="p2"
                    btn.text="X"
                }else{
                    player="p1"
                    btn.text="O"
                }
            }
        win()
        }
    fun win(){
        if(btn1.text=="X" && btn2.text=="X" && btn3.text=="X"
            || (btn4.text=="X" && btn5.text=="X" && btn6.text=="X")
            || (btn7.text=="X" && btn8.text=="X" && btn9.text=="X")
            || (btn3.text=="X" && btn5.text=="X" && btn7.text=="X")
            || (btn1.text=="X" && btn5.text=="X" && btn9.text=="X")
            || (btn1.text=="X" && btn4.text=="X" && btn7.text=="X")
            || (btn2.text=="X" && btn5.text=="X" && btn8.text=="X")
            || (btn3.text=="X" && btn6.text=="X" && btn9.text=="X")
        ){
//            toast("X Won This Game")
            textResult.text="X Won This Game"
            matikanTombol()
        }
        else if(btn1.text=="O" && btn2.text=="O" && btn3.text=="O"
            || (btn4.text=="O" && btn5.text=="O" && btn6.text=="O")
            || (btn7.text=="O" && btn8.text=="O" && btn9.text=="O")
            || (btn3.text=="O" && btn5.text=="O" && btn7.text=="O")
            || (btn1.text=="O" && btn5.text=="O" && btn9.text=="O")
            || (btn1.text=="O" && btn4.text=="O" && btn7.text=="O")
            || (btn2.text=="O" && btn5.text=="O" && btn8.text=="O")
            || (btn3.text=="O" && btn6.text=="O" && btn9.text=="O")
        ){
//            toast("O Won This Game")
            textResult.text="O Won This Game"
            matikanTombol()
        }else{
            if(btn1.text != "" && btn2.text != "" && btn3.text != "" && btn4.text != "" &&
                btn5.text != "" && btn6.text != "" && btn7.text != "" && btn8.text != "" && btn9.text != "") {
//                toast("Tie Game")
                textResult.text="Match Draw"
            }
        }

    }
    fun toast(msg:String){
        Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
    }
    fun reset(){
        btn1.text=""
        btn2.text=""
        btn3.text=""
        btn4.text=""
        btn5.text=""
        btn6.text=""
        btn7.text=""
        btn8.text=""
        btn9.text=""
        btn1.isEnabled=true
        btn2.isEnabled=true
        btn3.isEnabled=true
        btn4.isEnabled=true
        btn5.isEnabled=true
        btn6.isEnabled=true
        btn7.isEnabled=true
        btn8.isEnabled=true
        btn9.isEnabled=true
        textResult.text=""
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", "Method Called" )
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart", "Method Called")
    }
    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart", "Method Called")
    }
    override fun onResume() {
        super.onResume()
        Log.e("onResume", "Method Called")
    }
    override fun onPause() {
        super.onPause()
        Log.e("onPause", "Method Called")
    }
    override fun onStop() {
        super.onStop()
        Log.e("onStop", "Method Called")
    }
    fun matikanTombol(){
        btn1.isEnabled=false
        btn2.isEnabled=false
        btn3.isEnabled=false
        btn4.isEnabled=false
        btn5.isEnabled=false
        btn6.isEnabled=false
        btn7.isEnabled=false
        btn8.isEnabled=false
        btn9.isEnabled=false

    }
    }
