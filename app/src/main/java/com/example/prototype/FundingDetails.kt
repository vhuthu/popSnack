package com.example.prototype
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.prototype.ui.theme.BackGround
import com.example.prototype.ui.theme.PrimaryGreen

@Preview(showBackground = true)
@Composable
fun FundingDetails() {
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

        CenteredThreeCardsFunding()
    }
}


@Composable
fun CenteredThreeCardsFunding() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 80.dp, 0.dp, 0.dp),
        contentAlignment = Alignment.Center
    ) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(0.dp,0.dp,0.dp,0.dp)
        ) {
            Text(modifier = Modifier.padding(13.dp,0.dp,13.dp,0.dp),
                text = "Black-owned agriculture business  \n   funding" ,
                color = Color.White ,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.ExtraBold
            )
            Spacer(modifier = Modifier.height(37.dp))
            Card1()
            Card2()
            Card3()
            Card4()
        }
    }
}


@Composable
fun Card1() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(140.dp)
            .clickable { }
            .shadow(elevation = 15.dp),
        shape = RoundedCornerShape(20.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White) , horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Text(modifier = Modifier.padding(22.dp),
                text = "Black-owned small, medium business operating in South Africa can apply for Agriculture BEE Finance of up to R15 million.",
                style = MaterialTheme.typography.labelLarge ,
                fontWeight = FontWeight.Bold,
                fontSize = 21.sp
            )
        }
    }
}





@Composable
fun Card2() {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()

            .shadow(elevation = 15.dp),
        shape = RoundedCornerShape(20.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
                .background(color = Color.White) , horizontalAlignment = Alignment.CenterHorizontally , verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "KEY FEATURES",
                style = MaterialTheme.typography.bodyLarge ,
                fontWeight = FontWeight.ExtraBold
            )
        }
    }
}



@Composable
fun Card3() {
    Card(
        modifier = Modifier
            .padding(14.dp)
            .fillMaxWidth()
            .height(170.dp)
            .shadow(elevation = 15.dp),
        shape = RoundedCornerShape(20.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White) ,  horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Text(
                text = " Flexible Terms",
                style = MaterialTheme.typography.bodyLarge ,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = "Maximum repayment term is 10 years",
                style = MaterialTheme.typography.bodyLarge ,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(0.dp))
            Text(
                text = "Flexi reserve facility to keep additional funds in excess of the instalment",
                style = MaterialTheme.typography.bodyLarge ,
                fontWeight = FontWeight.Bold, modifier = Modifier.padding(27.dp)
            )
        }
    }
}





@Composable
fun Card4() {
    Card(
        modifier = Modifier
            .padding(14.dp)
            .fillMaxWidth()
            .height(170.dp)
            .shadow(elevation = 15.dp),
        shape = RoundedCornerShape(20.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White) ,  horizontalAlignment = Alignment.CenterHorizontally
        ) {




            Text(
                text = "Flexi reserve facility to keep additional funds in excess of the instalment",
                style = MaterialTheme.typography.bodyLarge ,
                fontWeight = FontWeight.Bold, modifier = Modifier.padding(27.dp)
            )
            Spacer(modifier = Modifier.height(0.dp))

            Button(onClick = { } , modifier = Modifier.size(220.dp,50.dp)) {
                Text(text = "REGISTER")
            }
        }
    }
}