package com.example.afanasiy.user_input

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var quantity:Int = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()
        val coffeeAmount:TextView = findViewById(R.id.textView2)
        coffeeAmount.text = quantity.toString()
    }

    fun display(){
        val amountTextView:TextView = findViewById(R.id.textView2)
        amountTextView.text = quantity.toString()
    }

    fun displayPrice(){
        val amountTextView:TextView = findViewById(R.id.textView4)
        amountTextView.text = (quantity*2).toString()
    }

    fun onClick(view: View){
        when(view.id){
            R.id.button->{
                display()
                displayPrice()
            }
            R.id.decCoffeeAmount->{
                --quantity
                display()
            }
            R.id.incCoffeeAmount->{
                ++quantity
                display()
            }
        }
    }
}


