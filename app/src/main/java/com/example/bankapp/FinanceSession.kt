package com.example.bankapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.StarHalf
import androidx.compose.material.icons.rounded.MonetizationOn
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankapp.ui.data.FinanceCard
import com.example.bankapp.ui.theme.BlueStart
import com.example.bankapp.ui.theme.OrangeEnd
import com.example.bankapp.ui.theme.OrangeStart
import com.example.bankapp.ui.theme.PurpleGrey40
import com.example.bankapp.ui.theme.PurpleGrey80
import com.example.bankapp.ui.theme.PurpleStart

val financeItems = listOf(
    FinanceCard(
        icon = Icons.AutoMirrored.Rounded.StarHalf,
        cardName = "Business",
        cardDescription = "My\nBusiness",
        iconBackground = OrangeStart
    ),
    FinanceCard(
        icon = Icons.Rounded.Wallet,
        cardName = "Wallet",
        cardDescription = "My\nWallet",
        iconBackground = BlueStart
    ),
    FinanceCard(
        icon = Icons.AutoMirrored.Rounded.StarHalf,
        cardName = "Analysis",
        cardDescription = "Finance\nAnalysis",
        iconBackground = PurpleStart
    ),
    FinanceCard(
        icon = Icons.Rounded.MonetizationOn,
        cardName = "Transactions",
        cardDescription = "My\nTransactions",
        iconBackground = PurpleStart
    )
)

@Preview
@Composable
fun FinanceSession() {
    Column() {
        Text(
            text = "FinanceSession",
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        LazyRow {
            items(financeItems.size) { index ->
                FinanceCardItem(index)
            }
        }
    }
}

@Composable
fun FinanceCardItem(
    index: Int
) {
    val card = financeItems[index]
    var lastItemPaddingEnd = 0.dp
    if (index == financeItems.size - 1) {
        lastItemPaddingEnd = 16.dp
    }
    Box(modifier = Modifier.padding(start = 16.dp, end = lastItemPaddingEnd)) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(MaterialTheme.colorScheme.secondaryContainer)
                .size(120.dp)
                .clickable {}
                .padding(13.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(card.iconBackground)
                    .padding(6.dp)
            ) {
                Icon(
                    imageVector = card.icon,
                    contentDescription = card.cardDescription,
                    tint = Color.White
                )
            }

            Text(
                text = card.cardName,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                fontWeight = FontWeight.SemiBold,
                fontSize = 15.sp
            )

        }
    }
}













