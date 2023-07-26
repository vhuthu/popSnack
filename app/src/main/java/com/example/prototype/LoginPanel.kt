package com.example.prototype


import android.content.Intent
import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.prototype.ui.theme.BrownText
import com.example.prototype.ui.theme.Green300

@Preview(showBackground = true)
@Composable
fun ImageOnSurfaceExamples() {
    Surface(
        // Set the background color of the surface// Set the elevation for the surface
        modifier = Modifier
            .fillMaxSize() // Occupy the entire available space
            .shadow(elevation = 4.dp) // Add some padding around the surface
    ) {
        Image(
            painter = painterResource(id = R.drawable.sunny), // Provide the image resource
            contentDescription = "Image content description", // Add a content description for accessibility
            contentScale = ContentScale.Crop, // Scale the image to fill the surface bounds
            modifier = Modifier.fillMaxSize() // Occupy the entire surface area
        )
    }

    CenteredVerticalCardss()
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CenteredVerticalCardss() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp, 0.dp, 12.dp, 1.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Create three vertical cards

        Card(
            colors = CardDefaults.cardColors(containerColor = Color.Transparent),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .height(120.dp)
        ) {
            // Card content here
            Column() {

            }
        }
        //content must go here
        Card(shape = RoundedCornerShape(30.dp),
            modifier = Modifier

                .fillMaxWidth()
                .height(400.dp).padding(0.dp,120.dp,0.dp,0.dp)
            , colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.8f))
        ) {
            var text by remember { mutableStateOf(TextFieldValue()) }
            var text2 by remember { mutableStateOf(TextFieldValue()) }
            var text3 by remember { mutableStateOf(TextFieldValue()) }
            var text4 by remember { mutableStateOf(TextFieldValue()) }
            var text5 by remember { mutableStateOf(TextFieldValue()) }

            TextField(value = text,
                onValueChange = {text = it},
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(elevation = 15.dp,shape = CircleShape)
                    .border(0.dp, Transparent)
                    .padding(15.dp), shape = RoundedCornerShape(15.dp), colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    containerColor = Color.White),
                label = { Text("                       CELL NUMBER" , fontWeight = FontWeight.Bold, color = BrownText)}
            )
            //-------------------

            //----------------------

            //--------------------

            //-----------------------
            TextField(value = text5,
                onValueChange = {text5 = it},
                modifier = Modifier
                    .fillMaxWidth().shadow(elevation = 15.dp,shape = CircleShape )
                    .padding(15.dp), shape = RoundedCornerShape(15.dp), colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    containerColor = Color.White), trailingIcon = { Image(
                    painter = painterResource(id = R.drawable.baseline_remove_red_eye_24),
                    contentDescription = null
                )},
                label = { Text("                       PASSWORD" , fontWeight = FontWeight.Bold, color = BrownText)}
            )

        }

        Spacer(modifier = Modifier.height(20.dp))
        //content must go here

        Card(shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .fillMaxWidth()

                .size(130.dp), colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.8f))
        ){

            Box(modifier = Modifier.padding(80.dp,10.dp,0.dp,0.dp)) {
                Column() {
                    val context = LocalContext.current
                    Button(onClick = {}, colors = ButtonDefaults.buttonColors(Green300), modifier = Modifier.size(190.dp,57.dp)) {
                        Text(text = "LOGIN")
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "Already have Account? LOGIN", fontWeight = FontWeight.ExtraBold)
                }
            }

        }

    }
}

//
//@Composable
//fun BottomShadow(alpha: Float = 0.1f, height: Dp = 8.dp) {
//    Box(modifier = Modifier
//        .fillMaxWidth()
//        .height(height)
//        .background(
//            brush = Brush.verticalGradient(
//                colors = listOf(
//                    Color.Black.copy(alpha = alpha),
//                    Color.Transparent,
//                )
//            )
//        )
//    )
//}
