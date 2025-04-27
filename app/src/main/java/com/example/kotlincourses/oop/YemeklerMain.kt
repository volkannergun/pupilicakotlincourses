package com.example.kotlincourses.oop

fun main() {
    //Nesne oluşturma
    val y1 = Yemekler(100, "Kofte", 249)
    //Değer okuma
    y1.bilgiAl()
    //Değer atama/değiştirmek
    y1.fiyat = 350
    y1.bilgiAl()


    val y2 = Yemekler(200, "Baklava", 300)
    y2.bilgiAl()
    y2.ad = "Soğuk Bakava"
    y2.bilgiAl()

}