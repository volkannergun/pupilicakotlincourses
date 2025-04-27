package com.example.kotlincourses.standart_programlama

fun main(){
    val yas = 19
    println (yas==13)
    if (yas>= 18){
        println("Resitsiniz.")
    }else{
        println("Resit degilsiniz.")
    }

    val ka = "admin"
    val s = 123456
    val sayi = 10

    if(ka == "admin" && s == 123456){
        println("Hos geldiniz")
    }else{
        println("Hatalı giris")
    }

    if(sayi == 9 || sayi == 10){
        println("Sayı 9 veya 10'dur.")
    }else{
        println("Sayı 9 veya 10 değildir.")
    }

    //When, diğer dillerde Switch
    val number = 1

    when(number){
        1 -> println("Sayı 1'dir")
        2 -> println("Sayı 2'dir")
        else -> println("Tanımlanamayan sayı")

    }





}