package com.example.bankaccountproject

fun main()
{
    val chirayusacoount = BankAccount("Chirayu", 120000.56)

    chirayusacoount.deposit(20000.0)
    chirayusacoount.displayTransactionHistory()
    chirayusacoount.withdraw(10000.0)
    chirayusacoount.withdraw(100000000.0)
    chirayusacoount.displayTransactionHistory()
    chirayusacoount.showbalance()

    val sarahaccount = BankAccount("Sarah", 0.0)
    sarahaccount.deposit(100.0)
    sarahaccount.withdraw(10.0)
    sarahaccount.deposit(300.0)
    sarahaccount.displayTransactionHistory()
    sarahaccount.showbalance()
}