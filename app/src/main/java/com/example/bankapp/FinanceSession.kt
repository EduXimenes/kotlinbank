package com.example.bankapp

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Box(
        modifier = Modifier.padding(16.dp)
    ){

        Column(
            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.onSecondaryContainer)
                .clip(RoundedCornerShape(25.dp))
                .width(125.dp)
                .height(80.dp)
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween

        ) {
            Text(
                "Finance",
                fontWeight = FontWeight.Bold
            )
            Row(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.onBackground),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                financeItems.forEachIndexed{ index, financeCard ->
                    FinanceCardItem(financeCard)
            }

            }
        }
    }

}

@Composable
fun FinanceCardItem(financeCard: FinanceCard) {
    // Exemplo de criação do Card com ícone e texto
    FinanceCard(
        modifier = Modifier
            .padding(8.dp)
            .size(120.dp), // Tamanho do Card
        shape = RoundedCornerShape(16.dp),
        elevation = 4.dp,
        backgroundColor = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(brush = Brush.verticalGradient(financeCard.color.colors)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Exibindo o ícone (se houver) - Aqui você pode trocar por Image/Icon
            Icon(
                imageVector = Icons.Default.AccountCircle, // Substitua com o ícone apropriado
                contentDescription = null,
                modifier = Modifier.size(40.dp),
                tint = Color.Gray
            )
            // Exibindo o nome do card
            Text(
                text = financeCard.cardName,
                style = MaterialTheme.typography.body1,
                color = Color.White
            )
            // Exibindo a descrição do card
            Text(
                text = financeCard.cardDescription,
                style = MaterialTheme.typography.body2,
                color = Color.White
            )
        }
    }
}