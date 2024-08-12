package com.gps.gyment.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gps.gyment.ui.theme.GymentTheme

@Composable
fun HistoryScreen() {
    Scaffold { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            Text(text = "Histórico")
        }
    }
}

@Preview
@Composable
fun HistoryScreenPreview(){
    GymentTheme {
        HistoryScreen()
    }
}