package com.example.kotlincourses.oop

fun main(){
    val a = ClassA()

//
//    //Standart nesne tabanlı erişim
//    println(a.x)
//    a.metot()
//
//    //Sanal nesne - Virtual Object - Nameless(İsimsiz) Object
//    println(ClassA().x) //1. Nesne
//    ClassA().metot() //2. Nesne


    //Static kulanımı
    println(ClassA.x)
    ClassA.metot()

}