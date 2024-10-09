package com.example.bankapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankapp.ui.data.Card
import com.example.bankapp.ui.theme.BlueEnd
import com.example.bankapp.ui.theme.BlueStart
import com.example.bankapp.ui.theme.GreenEnd
import com.example.bankapp.ui.theme.GreenStart
import com.example.bankapp.ui.theme.OrangeEnd
import com.example.bankapp.ui.theme.OrangeStart
import com.example.bankapp.ui.theme.PurpleEnd
import com.example.bankapp.ui.theme.PurpleStart


val cards = listOf(
    Card(
        cardType = "VISA",
        cardNumber = "3665 4585 4511 6897",
        cardName = "Business",
        balance = 46.468,
        color = GradientCard(OrangeStart, OrangeEnd)
    ),
    Card(
        cardType = "MASTER CARD",
        cardNumber = "6732 4123 4532 6317",
        cardName = "Savings",
        balance = 70.589,
        color = GradientCard(BlueStart, BlueEnd)
    ),
    Card(
        cardType = "VISA",
        cardNumber = "4532 6317 3424 5551",
        cardName = "School",
        balance = 46.468,
        color = GradientCard(GreenStart, GreenEnd)
    ),
    Card(
        cardType = "MASTER CARD",
        cardNumber = "1908 1441 3424 5598",
        cardName = "Personal",
        balance = 2.448,
        color = GradientCard(PurpleStart, PurpleEnd)
    )

)

fun GradientCard(
    startColor: Color,
    endColor: Color
    ): Brush
{
    return Brush.horizontalGradient(
        colors = listOf(startColor, endColor)
    )
}

@Preview
@Composable
fun CardSession(){
    LazyRow {
        items(cards.size){ index ->
            CardItem(index)
        }
    }
}

@Composable
fun CardItem(
    index: Int
){
    val card = cards[index]
    var lastItemPaddingEnd = 0.dp
    if (index == cards.size -1){
        lastItemPaddingEnd = 16.dp
    }

    var image = painterResource(id = R.drawable.ic_visa)
    if (card.cardName == "MASTER CARD")
    {
        image = painterResource(id = R.drawable.ic_mastercard)
    }
    Box(modifier = Modifier
        .padding(start = 16.dp, end = lastItemPaddingEnd)
    ){
        Column(modifier = Modifier
            .clip(RoundedCornerShape(25.dp))
            .background(card.color)
            .width(250.dp)
            .height(160.dp)
            .clickable {  }
            .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = image,
                contentDescription = card.cardType,
                modifier = Modifier.width(60.dp)
            )
            Spacer(Modifier.height(10.dp))
            Text(card.cardName,
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )
           Text("$ ${card.balance}",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
           Text(card.cardNumber,
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

        }

    }
}








