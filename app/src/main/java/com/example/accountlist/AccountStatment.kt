package com.example.accountlist

data class AccountStatment(

    var name: String,
var amount: Double,
var date: String,
var transactionType: TransactionType,
var currency: String)
