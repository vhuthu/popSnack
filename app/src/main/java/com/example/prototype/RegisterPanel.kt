package com.example.prototype

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ImageOnSurfaceExample() {
    Surface(
         // Set the background color of the surface// Set the elevation for the surface
        modifier = Modifier
            .fillMaxSize() // Occupy the entire available space
            .shadow(elevation = 4.dp,) // Add some padding around the surface
    ) {
        Image(
            painter = painterResource(id = R.drawable.agriculture), // Provide the image resource
            contentDescription = "Image content description", // Add a content description for accessibility
            contentScale = ContentScale.Crop, // Scale the image to fill the surface bounds
            modifier = Modifier.fillMaxSize() // Occupy the entire surface area
        )
    }

CenteredVerticalCards()
}


@Composable
fun CenteredVerticalCards() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp,0.dp,12.dp,0.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Create three vertical cards

        Card(
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(100.dp)
        ) {
            // Card content here
        }

        Box(modifier = Modifier
            .background(color = Color.White.copy(alpha = 0.8f))
            .fillMaxWidth()
            .shadow(elevation = 2.dp)
            .height(540.dp)
        ) {



        }

        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier
            .background(color = Color.White.copy(alpha = 0.8f))
            .fillMaxWidth()

            .height(100.dp) ) {



        }
    }
}
