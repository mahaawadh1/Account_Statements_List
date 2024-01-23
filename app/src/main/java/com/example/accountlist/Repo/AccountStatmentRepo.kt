package com.example.accountlist.Repo

import com.example.accountlist.AccountStatment
import com.example.accountlist.TransactionType

class AccountStatmentRepo {


    companion object {
        var dummyStatmentList = listOf(
            AccountStatment("Maha Account ", 30000.8, " 1-3-2024", TransactionType.Deposite, " KWD")

        )
    }
}
