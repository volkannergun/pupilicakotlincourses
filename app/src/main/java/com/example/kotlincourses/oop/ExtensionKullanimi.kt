package com.example.kotlincourses.oop

//
//fun main(){
//    val sonuc = 5.carp(2)
//    println(sonuc)
//}
//
//
//fun Int.carp(sayi:Int) : Int{
//    return this * sayi //this(Int) dışarıdan gelecek değer
//    //this yerine 5 , sayi yerine 2 , sonuc 10
//}


fun main(){
    val sonuc = 5 carp 2 //5.carp(2)
    println(sonuc)
}


infix fun Int.carp(sayi:Int) : Int{
    return this * sayi //this(Int) dışarıdan gelecek değer
    //this yerine 5 , sayi yerine 2 , sonuc 10
}