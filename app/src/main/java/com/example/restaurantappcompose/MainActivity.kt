package com.example.restaurantappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
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
                                .height(200.dp)
                        )

                        Spacer(modifier =  Modifier.height(32.dp))

                        //SIGN UP TEXT
                        Text(
                            "Sign Up",
                            style = TextStyle(
                                fontSize = 30.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color.Black
                            ),
                            modifier = Modifier.fillMaxWidth().padding(8.dp),
                            textAlign = TextAlign.Start
                        )

                        Spacer(modifier =  Modifier.height(8.dp))

                        //EMAIL TEXTVIEW
                        val email = remember { mutableStateOf("") }

                        TextField(
                            value = email.value,
                            onValueChange = {
                                email.value = it;
                            },
                            label = {Text("Email")}, //hint tarzı bir şey
                            modifier = Modifier.fillMaxWidth(),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email), //textviewın içindeki input email olacak
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color.Transparent,
                                focusedContainerColor = Color.Transparent
                            ),
                            leadingIcon = {
                                Image(painter = painterResource(R.drawable.work),
                                    contentDescription = "Sign Up Illustration",
                                    modifier =  Modifier.size(20.dp)
                                    )

                            }
                        )

                        Spacer(modifier =  Modifier.height(16.dp))

                        //NAME TEXTVIEW
                        val fullName = remember { mutableStateOf("") }

                        TextField(
                            value = fullName.value,
                            onValueChange = {
                                fullName.value = it;
                            },
                            label = {Text("Full Name")}, //hint tarzı bir şey
                            modifier = Modifier.fillMaxWidth(),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //textviewın içindeki input email olacak
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color.Transparent,
                                focusedContainerColor = Color.Transparent
                            ),
                            leadingIcon = {
                                Image(painter = painterResource(R.drawable.profile),
                                    contentDescription = "Enter Full Name",
                                    modifier =  Modifier.size(20.dp)
                                )

                            }
                        )

                        Spacer(modifier =  Modifier.height(16.dp))

                        //MOBILE TEXTVIEW
                        val mobile = remember { mutableStateOf("") }

                        TextField(
                            value = mobile.value,
                            onValueChange = {
                                mobile.value = it;
                            },
                            label = {Text("Mobile")}, //hint tarzı bir şey
                            modifier = Modifier.fillMaxWidth(),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone), //textviewın içindeki input email olacak
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color.Transparent,
                                focusedContainerColor = Color.Transparent
                            ),
                            leadingIcon = {
                                Image(painter = painterResource(R.drawable.calling),
                                    contentDescription = "Enter your phone number",
                                    modifier =  Modifier.size(20.dp)
                                )

                            }
                        )

                        Spacer(modifier =  Modifier.height(16.dp))

                        //PASSWORD TEXTVIEW
                        val password = remember { mutableStateOf("") }

                        TextField(
                            value = password.value,
                            onValueChange = {
                                password.value = it;
                            },
                            label = {Text("Password")}, //hint tarzı bir şey
                            modifier = Modifier.fillMaxWidth(),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password), //textviewın içindeki input email olacak
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color.Transparent,
                                focusedContainerColor = Color.Transparent
                            ),
                            leadingIcon = {
                                Image(painter = painterResource(R.drawable.password),
                                    contentDescription = "Enter your password",
                                    modifier =  Modifier.size(20.dp)
                                )

                            }
                        )

                        // TEXT
                        Spacer(modifier= Modifier.height(5.dp))

                        Text(text = "By Signing up, you're agree to our Term & Conditions and Privacy Policy",
                            fontSize = 14.sp,
                            color = Color.Black,
                            modifier = Modifier.fillMaxWidth().padding(20.dp)
                        )

                        //BUTTON
                        Button(onClick = {},
                            modifier = Modifier.fillMaxWidth()
                                .height(48.dp),
                            colors = ButtonDefaults.buttonColors(Color(red = 100, green = 252, blue = 217))
                        ) {
                            Text("Continue", color = Color.Black, fontSize = 16.sp)
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ){
                            Text("Joined before?", color = Color.Black, fontSize = 14.sp)
                            TextButton(onClick = {
                                //navigation (login ekranına git)
                            }) {
                                Text("Login", color = Color.Black, fontSize = 14.sp)
                            }

                        }

                    }
                }

            }
        }
    }
}