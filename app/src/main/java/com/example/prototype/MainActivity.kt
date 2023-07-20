package com.example.prototype

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prototype.ui.theme.BackGround
import com.example.prototype.ui.theme.ButtonGreen
import com.example.prototype.ui.theme.PrimaryGreen
import com.example.prototype.ui.theme.PrototypeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrototypeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()

                    ) {
                        Image(painter = painterResource(id = R.drawable.ic_android_black_24dp), contentDescription = null , modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp) )
                        Spacer(modifier = Modifier.height(15.dp))
                        Button(onClick = {
                            val navigate = Intent(this@MainActivity, MainActivity2::class.java)
                            startActivity(navigate)
                        })
                        {

                            Spacer(modifier = Modifier.height(15.dp))
                            Text(text = "Get Started", fontSize = 18.sp)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LandingPages() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        // First surface (will be at the bottom)
        Surface(color = PrimaryGreen, modifier = Modifier.fillMaxSize()) {
            // content for the first surface
        }

        // Second surface (will overlap the first surface)
        Surface(

            modifier = Modifier
                .fillMaxWidth()
                .height(335.dp)
                .clip(shape = RoundedCornerShape(0.dp, 0.dp, 55.dp, 55.dp))

        ) {
           Image(painter = painterResource(id = R.drawable.agriculture), contentDescription = null, contentScale = ContentScale.Crop)
        }



    }

    Box(
        modifier = Modifier
            .background(color = Color.Blue.copy(alpha = 0.9f))
            .width(165.dp)
            .height(165.dp)
            .clip(shape = CircleShape)
    ) {

    }
}