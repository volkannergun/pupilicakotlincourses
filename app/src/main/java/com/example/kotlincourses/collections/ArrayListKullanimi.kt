package com.example.kotlincourses.collections

fun main() {
    //Tanımlama
    val meyveler = ArrayList<String>()


    //Veri Ekleme
    meyveler.add("Elma")//0
    meyveler.add("Muz")//1
    meyveler.add("Kiraz")//2
    println(meyveler)

    //Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    //Insert : istediğimiz bir indexe
    meyveler.add(1,"Portakal")
    println(meyveler)

    println("--------")

    //Okuma
    val m = (meyveler.get(3))
    println(m)
    println(meyveler.get(3))
    println(meyveler[3])

    println("Boyut : ${meyveler.size}")

    println("--------")

    meyveler.reverse()
    println(meyveler)

    println("--------")

    for(meyve in meyveler){
        println("Sonuç : $meyve")
    }

    println("--------")


    for((indeks,meyve) in meyveler.withIndex()){//Swift : enumarated()
        println("$indeks. -> $meyve")
    }

    println("--------")

    meyveler.removeAt(1)
    println(meyveler)

    println("--------")

    meyveler.clear()
    println(meyveler)

}