package com.example.wealthtracker

class WealthManager {

    fun calculateSavings(income: Double, expenses: Double, k: Double): Double {
        return (income - expenses) * k
    }
}