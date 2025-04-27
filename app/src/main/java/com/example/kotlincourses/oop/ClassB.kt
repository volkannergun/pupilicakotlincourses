package com.example.kotlincourses.oop

class ClassB : MyInterface {
    override var degisken: Int = 100

    override fun metod1() {
        println("Metot 1 çalıştı")
    }

    override fun metod2(): String {
        return "Metot 2 çalıştı"
    }
}