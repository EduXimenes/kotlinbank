package com.example.bankapp.ui.data

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class FinanceCard(
    val icon: ImageVector,
    val cardName: String,
    val cardDescription: String,
    val iconBackground: Color
)
