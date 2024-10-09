package com.example.bankapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.bankapp.ui.data.FinanceCard
import com.example.bankapp.ui.theme.OrangeEnd
import com.example.bankapp.ui.theme.OrangeStart
import com.example.bankapp.ui.theme.PurpleGrey40
import com.example.bankapp.ui.theme.PurpleGrey80

val financeItems = listOf(
    FinanceCard(
        cardName = "Business",
        cardDescription = "My Business",
        color = GradientCard(PurpleGrey40, PurpleGrey80)
    ),
    FinanceCard(
        cardName = "Wallet",
        cardDescription = "My Wallet",
        color = GradientCard(PurpleGrey40, PurpleGrey80)
    ),
    FinanceCard(
        cardName = "Analysis",
        cardDescription = "Finance Analysis",
        color = GradientCard(PurpleGrey40, PurpleGrey80)
    )
)

@Preview
@Composable
fun FinanceSession(){

    Column {
        Text("Finance",
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Row (
            modifier = Modifier
                .background(MaterialTheme.colorScheme.onBackground),
            horizontalArrangement = Arrangement.SpaceAround
        ){
        }

    }

}