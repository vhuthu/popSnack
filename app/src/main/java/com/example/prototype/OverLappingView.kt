package com.example.prototype

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prototype.ui.theme.BackGround
import com.example.prototype.ui.theme.PrimaryGreen

@Preview(showBackground = true)
@Composable
fun OverlappingSurfaces() {
    Box(modifier = Modifier.fillMaxSize()) {
        // First surface (will be at the bottom)
        Surface(color = BackGround, modifier = Modifier.fillMaxSize()) {
            // content for the first surface
        }

        // Second surface (will overlap the first surface)
        Surface(
            color = PrimaryGreen,
            modifier = Modifier
                .fillMaxWidth()
                .height(318.dp)
                .clip(shape = RoundedCornerShape(0.dp, 0.dp, 55.dp, 55.dp))
        ) {
            // content for the second surface
        }

        CenteredThreeCards()
    }
}


@Composable
fun CenteredThreeCards() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(0.dp,60.dp,0.dp,0.dp)
        ) {
            Text(modifier = Modifier
                .padding(13.dp, 2.dp, 13.dp, 0.dp)
                .clickable { },
                text = "Get Funding Tailored For Your \n                   Business " ,
                color = Color.White ,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.ExtraBold
            )
            Spacer(modifier = Modifier.height(37.dp))
            MyCard1()
            MyCard2()
            MyCard3()
        }
    }
}


@Composable
fun MyCard1() {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(170.dp)
            .clickable { context.startActivity(Intent(context,MainActivity4::class.java)) }
            .shadow(elevation = 15.dp),
        shape = RoundedCornerShape(20.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White) , horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.makeitrain),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)

            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = "Black-owned agriculture business funding",
                style = MaterialTheme.typography.bodyLarge ,
                fontWeight = FontWeight.ExtraBold
            )
        }
    }
}





@Composable
fun MyCard2() {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(170.dp)
            .clickable { context.startActivity(Intent(context,MainActivity4::class.java)) }
            .shadow(elevation = 15.dp),
        shape = RoundedCornerShape(20.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White) , horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.growth),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = "Business Revolving Funding",
                style = MaterialTheme.typography.bodyLarge ,
                fontWeight = FontWeight.Bold
            )
        }
    }
}



@Composable
fun MyCard3() {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(170.dp)
            .clickable { context.startActivity(Intent(context,MainActivity4::class.java)) }
            .shadow(elevation = 15.dp),
        shape = RoundedCornerShape(20.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White) ,  horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.managementtime),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = "Business Term Funding",
                style = MaterialTheme.typography.bodyLarge ,
                fontWeight = FontWeight.Bold
            )
        }
    }
}