package com.example.myapplication.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CompanySection() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxWidth()
    ) {
        // 会社名
        Text(
            text = "Android株式会社",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(10.dp))
        // 部署・グループ名
        Text(
            text = "テクノロジーグループ 開発チーム",
            color = Color.Gray,
            fontSize = 16.sp,
        )
        Spacer(modifier = Modifier.height(10.dp))

        // Email
        Label(icon = Icons.Default.Email, text = "Email")
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "example@gmail.com",
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(5.dp))
        Divider(
            thickness = 2.dp,
            modifier = Modifier.clip(RoundedCornerShape(1000.dp))
        )
    }
}