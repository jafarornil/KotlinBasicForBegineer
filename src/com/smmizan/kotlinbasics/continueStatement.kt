package com.smmizan.kotlinbasics

fun main(args :Array<String>){

//continue statement

    for(i in 1..10)
    {
        if (i in 4..6)
            continue
        println(" i = $i")
    }
}