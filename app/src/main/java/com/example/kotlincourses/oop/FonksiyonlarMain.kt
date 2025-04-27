package com.example.kotlincourses.oop

fun main() {
    val f = Fonksiyonlar()

    //void - unit
    f.selamla1()

    //return
    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")

    //parametre
    f.selamla3("Zeynep")

    f.topla(23,32,"Batu")


}