package com.example.restaurantappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.restaurantappcompose.ui.theme.RestaurantAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RestaurantAppComposeTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally, // yatay olarak ortala
                        modifier = Modifier.fillMaxSize() //ekranı doldurabildiğin kadar doldur
                            .padding(16.dp)
                    ) {

                        Spacer(modifier =  Modifier.height(32.dp))

                        //ILLUSTRATOR IMAGE
                        Image(
                            painter = painterResource(id = R.drawable.illustration),
                            contentDescription = "Sign Up Illustration",
                            modifier = Modifier.fillMaxWidth() //genişleyebildiği kadar genişlesin
                                .height(250.dp)
                        )

                        Spacer(modifier =  Modifier.height(32.dp))

                        //SIGN UP TEXT
                        Text(
                            "Sign Up",
                            style = TextStyle(
                                fontSize = 40.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color.Black
                            ),
                            modifier = Modifier.fillMaxWidth().padding(8.dp),
                            textAlign = TextAlign.Start
                        )

                    }
                }

            }
        }
    }
}