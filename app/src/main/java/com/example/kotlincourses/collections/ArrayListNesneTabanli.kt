package com.example.kotlincourses.collections

fun main() {
    val f1 = Filmler(1,"Avengers",50)
    val f2 = Filmler(1,"Dune",80)
    val f3 = Filmler(1,"Interstellar",65)
    val f4 = Filmler(1,"Iron Man",20)

    val filmlerListesi = ArrayList<Filmler>()
    filmlerListesi.add(f1)
    filmlerListesi.add(f2)
    filmlerListesi.add(f3)
    filmlerListesi.add(f4)

    for(film in filmlerListesi) {
        println("--------------")
        println("${film.id} : ${film.ad} ${film.fiyat} TL")
    }

    //Sıralama - Sorting
    println("----Fiyata Artan----")
    val siralama1 = filmlerListesi.sortedWith(compareBy{it.fiyat})
    for (film in siralama1){
        println("${film.id} : ${film.ad} ${film.fiyat} Tl")
    }

    // DESC
    println("----Fiyata Azalan----")
    val siralama2 = filmlerListesi.sortedWith(compareByDescending{it.fiyat})
    for (film in siralama2){
        println("${film.id} : ${film.ad} ${film.fiyat} Tl")
    }

    //Filtreleme
    println("-----Filtreleme 1-----")
    val filtreleme1 = filmlerListesi.filter { it.fiyat > 40 }
    for (film in filtreleme1){
        println("${film.id} : ${film.ad} ${film.fiyat} Tl")
    }

    println("-----Filtreleme 2-----")
    val filtreleme2 = filmlerListesi.filter { it.ad.contains("ro") }
    for (film in filtreleme2){
        println("${film.id} : ${film.ad} ${film.fiyat} Tl")
    }




}