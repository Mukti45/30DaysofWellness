package com.example.a30daysofwellness.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun WellnessTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(),
        typography = Typography,
        content = content
    )
}