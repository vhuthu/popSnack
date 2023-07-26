package com.example.prototype

import android.content.Intent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.resolveDefaults
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.prototype.ui.theme.DarkGreen
import com.example.prototype.ui.theme.Green300
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState

import com.google.accompanist.pager.rememberPagerState



@Preview(showBackground = true)
@Composable
fun PreviewFunction() {
    Surface(modifier = Modifier.fillMaxSize()) {
        MainFuction()
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainFuction() {

    val items = ArrayList<OnBoardingData>()

    val color: Color


    items.add(
        OnBoardingData(
            R.raw.corn ,
            "Let us help you grow your respective businesses",
            " Grow with AgriFund, Get Funding tailored For Your business"
        )
    )

    items.add(
        OnBoardingData(
            R.raw.reg,
            "Fill out one simple application and track your outcome ",
            "Complete the application and remember to upload the required documents."
        )
    )


    items.add(
        OnBoardingData(
            R.raw.notification,
            "Get notified when your funds are due.",
            " Grow with AgriFund, Get Funding tailored For Your business"

        )
    )

    val pagerState = rememberPagerState(
        pageCount = items.size,
        infiniteLoop = false,
        initialPage = 0
    )

    OnBoardingPager(
        item = items ,
        pagerState = pagerState,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)


    )

}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnBoardingPager(item: ArrayList<OnBoardingData>, pagerState: PagerState, modifier: Modifier) {

    Box(modifier = modifier) {

        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            HorizontalPager(state = pagerState) { page ->

                Column(modifier = Modifier
                    .padding(60.dp)
                    .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    LoaderIntro(modifier = Modifier
                        .size(250.dp)
                        .fillMaxWidth()
                        .align(alignment = Alignment.CenterHorizontally),item[page].image)
                    PagerIndicator(item.size , pagerState.currentPage)
                    Text(
                        text = item[page].title,
                        modifier = Modifier.padding(10.dp),
                        color = Color.Black,
                        style = MaterialTheme.typography.headlineSmall
                    )

                    Text(
                        text = item[page].desc,
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp , end = 20.dp),
                        color = Color.Black,
                        style = MaterialTheme.typography.bodyMedium,
                        textAlign = TextAlign.Center

                    )

                }
            }


        }
        Box(modifier = Modifier.align(Alignment.BottomCenter)) {
            BottomSection(pagerState.currentPage)
        }
    }
}

@Composable
fun PagerIndicator(size: Int, currentPage: Int) {
    Row( horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.padding(top = 30.dp, bottom = 30.dp)) {
        repeat(size){
            Indicator(isSelected = it == currentPage)
        }
    }
}

@Composable
fun Indicator(isSelected:Boolean) {
    val width = animateDpAsState(targetValue = if (isSelected) 25.dp else 10.dp)

    Box(modifier = Modifier
        .padding(1.dp)
        .height(10.dp)
        .width(width.value)
        .clip(CircleShape)
        .background(if (isSelected) DarkGreen else Color.Gray.copy(alpha = 0.5f))) {

    }
}

@Composable
fun BottomSection(currentPager: Int) {
    val context = LocalContext.current
    Row(
        modifier = Modifier

            .padding(start = 20.dp, end = 20.dp, bottom = 50.dp)
            .fillMaxWidth(),
        horizontalArrangement = if (currentPager != 2) Arrangement.SpaceBetween else Arrangement.Center
    ) {
        if (currentPager == 2){
            val context = LocalContext.current
            OutlinedButton(modifier = Modifier.background( color = Green300, shape = RoundedCornerShape(45.dp)), onClick = { context.startActivity(Intent(context,MainActivity3::class.java))}, shape = RoundedCornerShape(50.dp) ) {
                Text(
                    text = "GET STARTED",
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 40.dp),
                    color = Color.White
                )
            }
        }else {
            SkipNextButton(
                text = "Skip",
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
                    .clickable { context.startActivity(Intent(context, MainActivity3::class.java)) },
                        color = DarkGreen
            ) //padding for the skip text
// val context = LocalContext.current
            OutlinedButton(modifier = Modifier.background( color = Green300, shape = RoundedCornerShape(45.dp)  ),
                onClick = {  },

                //context.startActivity(Intent(context,MainActivity3::class.java)
                shape = RoundedCornerShape(50.dp)  ) {

                SkipNextButton(
                    text = "Next",
                    color = Color.White,
                    modifier = Modifier.padding(start = 20.dp, end = 20.dp)


                )//padding for the next text
            }
        }

    }
}

@Composable
fun SkipNextButton(text: String,modifier: Modifier, color: Color) {

    Text(
        color=color,
        text = text,
        modifier = modifier,
        fontSize = 18.sp,
        style = MaterialTheme.typography.bodyLarge,
        fontWeight = FontWeight.Medium
    )
}

