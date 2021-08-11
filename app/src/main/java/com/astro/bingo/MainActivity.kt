package com.astro.bingo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Setting up view")
        setViewElements()
    }


    private fun setViewElements() {
    val buttons= arrayOf(button00, button01, button02, button03, button04,
                            button10, button11, button12, button13, button14,
                            button20, button21, button22, button23, button24,
                            button30, button31, button32, button33, button34,
                            button40, button41, button42, button43, button44)

        val tempArray: Vector<Int> = Vector()
        for (i in 0..24) {
            tempArray.add(i)
            println("Setting vector")
        }
        var count = 0
        while (tempArray.size != 1) {
            val rand = Random.nextInt(24-count)
            println("Setting vector $rand at &count")
            buttons[count].text = (tempArray[rand] + 1).toString()
            tempArray.removeAt(rand)
            count++
        }
        buttons[24].text = tempArray[0].toString()
    }

}