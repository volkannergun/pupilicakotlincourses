package com.example.kotlincourses

fun main () {
    //1. Compile Error : Kodlama yaparken oluşur.
    //val sayi = 100
    //sayi = 500

    //Runtime Error ( Exceptions )
    val x = 10
    val y = 0


    try{
        println("Sonuç : ${x/y}")
        println("İşlem Tamamlandı")
    }catch (e:Exception){
        println("İkinci sayı sıfır olamaz.")

    }


}