package com.practise.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.IntRange
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var Dishes = arrayListOf("Biriyani","Mughlai Paratha","Mixed Fried Rice","Mixed Chowmein")
    var initial_index=0
    var index=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Decide_btn.setOnClickListener(){
            var n=Dishes.size-1
            while (true){
                initial_index=index
                index=(0..n).shuffled().first()
                if(index!=initial_index){
                    break
                }
                println("Visited")
            }
            var food=Dishes[index]
            Display.text=food

        }

        Add_btn.setOnClickListener(){
            var new_item=Add_item.text.toString()
            if(new_item!=""){
                Dishes.add(new_item)
                Add_item.setText("")
            }
        }
    }

}
