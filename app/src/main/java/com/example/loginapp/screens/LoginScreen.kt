package com.example.loginapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginapp.R
import com.example.loginapp.components.InputComponent
import com.example.loginapp.components.PwInputComponent

@Composable
fun LoginScreen() {
    var text by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            painter = painterResource(R.drawable.background_img_top),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.Transparent),
                contentAlignment = Alignment.Center
            ){
                Box(
                    modifier = Modifier
                        .width(125.dp)
                        .height(125.dp)
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(
                                topStart = 35.dp,
                                topEnd = 0.dp,
                                bottomStart = 35.dp,
                                bottomEnd = 35.dp
                            )
                        ),
                    contentAlignment = Alignment.Center
                ){
                    Box (
                        modifier = Modifier
                            .width(60.dp)
                            .height(60.dp)
                            .background(
                                color = Color.Black,
                                shape = RoundedCornerShape(
                                    topStart = 35.dp,
                                    topEnd = 40.dp,
                                    bottomStart = 0.dp,
                                    bottomEnd = 40.dp
                                )
                            )
                    ){}
                }
            }
            Box (
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth()
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(
                            topStart = 60.dp,
                            topEnd = 0.dp,
                            bottomStart = 0.dp,
                            bottomEnd = 0.dp
                        )
                    ),
                contentAlignment = Alignment.Center
            ){
                Text(
                    "Login"
                )
                Column {
                    InputComponent("Email", "Example17@gmail.com")
                    Spacer(modifier = Modifier
                        .height(30.dp))
                    PwInputComponent("Password")
                    Spacer(modifier = Modifier
                        .height(30.dp))
                    Button(
                        onClick = {}
                    ) {
                        Text(
                            "Login"
                        )
                    }
                    Text(
                        "Don't have an account? Sign up"
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun LoginPreview(){
    LoginScreen()
}