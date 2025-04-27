package com.example.kotlincourses.degiskenler

//fun main(){
//    println("pamuk")
//}

fun main(){
    var id = 1
    var ad = "Mont"
    var resim = "mont.jpg"
    var puan = 4.7
    var fiyat = 4588
    var stokDurum = true

    println("Id : $id")
    println("Ad : $ad")
    println("Resim : $resim")
    println("Puan : $puan")
    println("Fiyat : $fiyat")
    println("Stok durum : $stokDurum")

    //Sabitler - Constant
    var sayi = 30
    sayi = 100
    println(sayi)

    val numara = 50
    println(numara)

    //Tür Dönüşümü
    // 1 - Sayısaldan sayısala dönüşüm
    val d = 89.56
    val i = 34
    val sonuc1 = d.toInt()
    val sonuc2 = i.toDouble()
    println(sonuc1)
    println(sonuc2)

    //2 - Sayısaldan metine dönüşüm
    var x = 85
    val sonuc3 = x.toString()//"85"
    println(sonuc3)


    //3 - Metinden sayısala dönüşüm
    val yazi = "48yy"
    val sonuc4 = yazi.toIntOrNull()
//    println(sonuc4)

    if (sonuc4 != null) {
        println(sonuc4)
    }else{
        println("Sonuç nulldur")
    }
}