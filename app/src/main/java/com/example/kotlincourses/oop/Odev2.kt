package com.example.kotlincourses.oop

fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

fun rectanglePerimeter(side1: Double, side2: Double): Double {
    if (side1 < 0 || side2 < 0) {
        println("Warning: Side lengths should be non-negative for a real rectangle.")
    }
    return 2 * (side1 + side2)
}

fun factorial(number: Int): Long {
    if (number < 0) {
        throw IllegalArgumentException("Factorial is not defined for negative numbers")
    }
    if (number == 0) {
        return 1L
    }

    var result: Long = 1
    for (i in 1..number) {
        result *= i
    }
    return result
}

fun countA(word: String): Int {
    var count = 0
    for (char in word) {
        if (char.lowercaseChar() == 'a') {
            count++
        }
    }
    return count
}

fun sumOfInteriorAngles(numberOfSides: Int): Double {
    if (numberOfSides < 3) {
        println("Warning: A polygon must have at least 3 sides.")
        return 0.0
    }
    return (numberOfSides - 2) * 180.0
}

fun calculateSalary(numberOfDays: Int): Double {
    val totalHours = numberOfDays * 8
    val standardHours = 160

    var baseSalary: Double = 0.0
    var overtimePay: Double = 0.0

    if (totalHours <= standardHours) {
        baseSalary = totalHours * 10.0
    } else {
        baseSalary = standardHours * 10.0
        val overtimeHours = totalHours - standardHours
        overtimePay = overtimeHours * 20.0
    }

    return baseSalary + overtimePay
}

fun calculateInternetFee(dataUsageGB: Double): Double {
    val baseQuota = 50.0
    val baseFee = 100.0
    val extraFeePerGB = 4.0

    if (dataUsageGB <= baseQuota) {
        return baseFee
    } else {
        val extraUsage = dataUsageGB - baseQuota
        val extraFee = extraUsage * extraFeePerGB
        return baseFee + extraFee
    }
}