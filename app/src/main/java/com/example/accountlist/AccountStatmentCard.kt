package com.example.accountlist
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Composable
fun AccountStatementCard(
    name: String,
    amount: Double,
    date: String,
    transactionType: TransactionType,
    currency: String
){
    Card (modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .padding(8.dp))  {
        
        
        Row(
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text= stringResource(R.string.statmentaccount, name))
            Text(text="$name                     $transactionType ")
            Text(text="$amount $currency")
            Text(text= stringResource(R.string.statmentdate, date))
        }

    }

}

@Preview(showBackground =true)
@Composable
fun AccountStatmentPreview() {
    AccountStatementCard(
        name = "maha", amount=3000.0, transactionType = TransactionType.Withdraw, date="1-2-2024", currency = "KWD")


}
