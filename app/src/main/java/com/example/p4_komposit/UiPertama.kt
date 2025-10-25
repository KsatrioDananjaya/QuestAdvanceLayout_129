package com.example.p4_komposit

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier){
    Column(modifier = Modifier
        .padding(start = 24.dp, end = 24.dp, top = 60.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        val profil = painterResource(id = R.drawable.profil)
        val steam = painterResource(id = R.drawable.steam)
        val disc = painterResource(id = R.drawable.discord)
        val git = painterResource(id = R.drawable.github)
        Image(
            painter = profil,
            null,
            contentScale = ContentScale.Crop,
            alignment = Alignment.CenterEnd,
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
                .border(2.dp, Color.White, CircleShape)
        )
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(height = 25.dp))

        Card(
            modifier = Modifier
                .height(height = 160.dp)
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(all = 10.dp)
            ) {
                val gambar = painterResource(id = R.drawable.umy)
                Image(
                    painter = gambar,
                    null,
                    modifier = Modifier
                        .size(size = 100.dp)
                        .padding(all = 5.dp)
                )

                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        stringResource(R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        stringResource(R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
        ){
            Text(
                stringResource(R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}