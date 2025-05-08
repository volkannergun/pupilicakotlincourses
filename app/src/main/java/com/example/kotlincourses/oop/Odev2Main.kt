package com.example.kotlincourses.oop

fun main() {

    println("--- Testing Celsius to Fahrenheit ---")
    val celsiusTemp1 = 25.0
    val fahrenheitTemp1 = celsiusToFahrenheit(celsiusTemp1)
    println("$celsiusTemp1 Celsius is equal to $fahrenheitTemp1 Fahrenheit.")

    val celsiusTemp2 = 0.0
    val fahrenheitTemp2 = celsiusToFahrenheit(celsiusTemp2)
    println("$celsiusTemp2 Celsius is equal to $fahrenheitTemp2 Fahrenheit.")
    println()

    println("--- Testing Rectangle Perimeter ---")
    val rectSideA = 5.0
    val rectSideB = 10.0
    val perimeter1 = rectanglePerimeter(rectSideA, rectSideB)
    println("The perimeter of a rectangle with sides $rectSideA and $rectSideB is $perimeter1.")

    val rectSideC = 3.5
    val rectSideD = 7.2
    val perimeter2 = rectanglePerimeter(rectSideC, rectSideD)
    println("The perimeter of a rectangle with sides $rectSideC and $rectSideD is $perimeter2.")
    println()


    println("--- Testing Factorial ---")
    val factNum1 = 5
    try {
        val factResult1 = factorial(factNum1)
        println("The factorial of $factNum1 is $factResult1.")
    } catch (e: IllegalArgumentException) {
        println("Error calculating factorial: ${e.message}")
    }

    val factNum2 = 0
    try {
        val factResult2 = factorial(factNum2)
        println("The factorial of $factNum2 is $factResult2.")
    } catch (e: IllegalArgumentException) {
        println("Error calculating factorial: ${e.message}")
    }

    val factNum3 = -3
    try {
        val factResult3 = factorial(factNum3)
        println("The factorial of $factNum3 is $factResult3.")
    } catch (e: IllegalArgumentException) {
        println("Error calculating factorial: ${e.message}")
    }
    println()


    println("--- Testing Count 'a' ---")
    val wordToCount1 = "banana"
    val aCountResult1 = countA(wordToCount1)
    println("The word \"$wordToCount1\" contains $aCountResult1 'a' characters (case-insensitive).")

    val wordToCount2 = "Apple"
    val aCountResult2 = countA(wordToCount2)
    println("The word \"$wordToCount2\" contains $aCountResult2 'a' characters (case-insensitive).")

    val wordToCount3 = "Kotlin"
    val aCountResult3 = countA(wordToCount3)
    println("The word \"$wordToCount3\" contains $aCountResult3 'a' characters (case-insensitive).")
    println()


    println("--- Testing Sum of Interior Angles ---")
    val sides1 = 4
    val anglesSum1 = sumOfInteriorAngles(sides1)
    println("The sum of interior angles for a polygon with $sides1 sides is $anglesSum1 degrees.")

    val sides2 = 3
    val anglesSum2 = sumOfInteriorAngles(sides2)
    println("The sum of interior angles for a polygon with $sides2 sides is $anglesSum2 degrees.")

    val sides3 = 6
    val anglesSum3 = sumOfInteriorAngles(sides3)
    println("The sum of interior angles for a polygon with $sides3 sides is $anglesSum3 degrees.")

    val sides4 = 2
    val anglesSum4 = sumOfInteriorAngles(sides4)
    println("The sum of interior angles for a polygon with $sides4 sides is $anglesSum4 degrees.")
    println()


    println("--- Testing Salary Calculation ---")
    val workDays1 = 20
    val salary1 = calculateSalary(workDays1)
    println("Salary for $workDays1 working days: $salary1 TL.")

    val workDays2 = 25
    val salary2 = calculateSalary(workDays2)
    println("Salary for $workDays2 working days: $salary2 TL.")
    println()


    println("--- Testing Internet Fee Calculation ---")
    val dataUsage1 = 40.0
    val internetFee1 = calculateInternetFee(dataUsage1)
    println("Internet fee for $dataUsage1 GB: $internetFee1 TL.")

    val dataUsage2 = 50.0
    val internetFee2 = calculateInternetFee(dataUsage2)
    println("Internet fee for $dataUsage2 GB: $internetFee2 TL.")

    val dataUsage3 = 60.0
    val internetFee3 = calculateInternetFee(dataUsage3)
    println("Internet fee for $dataUsage3 GB: $internetFee3 TL.")

    val dataUsage4 = 55.5
    val internetFee4 = calculateInternetFee(dataUsage4)
    println("Internet fee for $dataUsage4 GB: $internetFee4 TL.")
    println()
}