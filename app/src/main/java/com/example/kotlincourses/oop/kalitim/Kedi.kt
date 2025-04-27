package com.example.kotlincourses.oop.kalitim

class Kedi : Memeli() {
    override fun sesCikar() {
        println("Miyav Miyav")
        //super.sesCikar() -> super : kalıtım ile üst sınıfı temsil eder
    }
}