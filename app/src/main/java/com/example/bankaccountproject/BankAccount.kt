package com.example.bankaccountproject

class BankAccount(var accountHolderName: String, var balance: Double) {
    //Defining a list of transaction history to store the transactions and use it later
    //Adding PRIVATE before deifining a variable, will not be accessible to everyone.
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount:Double){
        balance += amount
        transactionHistory.add("$accountHolderName deposited $$amount")
    }
    fun withdraw(amount:Double){
        if(amount <= balance){
            balance -= amount
            transactionHistory.add("$accountHolderName withdrew $$amount")
        }
        else{
            println("Insufficient Balance")
        }
    }
    fun displayTransactionHistory(){
        println("Transaction History for $accountHolderName is as follows: ")
        for(history in transactionHistory){
            println(history)
        }
    }
    fun showbalance(){
        println("The balance is $balance")
    }
}