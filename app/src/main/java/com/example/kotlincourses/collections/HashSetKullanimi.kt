package com.example.kotlincourses.collections

fun main() {
    //HASHSET
    //Tanımlama
    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    println(meyveler)

    meyveler.add("Elma") //Eklemez, aynısı var
    println(meyveler)

    meyveler.add("Amasya Elma")
    println(meyveler)

    val y = meyveler.elementAt(2)
    println(y)

    println("Boyut : ${meyveler.size}")

    for((indeks,meyve) in meyveler.withIndex()){//Swift : enumarated()
        println("$indeks. -> $meyve")
    }

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)



}