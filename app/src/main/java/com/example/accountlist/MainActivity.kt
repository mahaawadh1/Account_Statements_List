package com.example.accountlist
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.accountlist.Repo.AccountStatmentRepo
import com.example.accountlist.ui.theme.AccountlistTheme

class MainActivity : ComponentActivity() {
    var statmentList = AccountStatmentRepo.dummyStatmentList
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccountlistTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    StatmentListScreen(statmentList)
                    }
                }
            }
        }
    }

@Composable
fun StatmentListScreen(statmentList: List<AccountStatment>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(statmentList) { statments ->
            AccountStatementCard(
                name = statments.name,
                amount = statments.amount,
                date = statments.date,
                transactionType = statments.transactionType,
                currency = statments.currency
            )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AccountlistTheme {
        StatmentListScreen(AccountStatmentRepo.dummyStatmentList)
    }
}