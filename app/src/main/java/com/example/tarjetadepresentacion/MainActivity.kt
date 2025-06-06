package com.example.tarjetadepresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetadepresentacion.ui.theme.TarjetaDePresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentacionTheme {
                TarjetaDePresentacionApp()
            }
        }
    }
}

@Composable
fun TarjetaDePresentacionApp(){
    Box(
        Modifier.fillMaxSize().background(Color.Blue.copy(alpha = 0.5f))
    ) {
        Box(Modifier.align(Alignment.Center)) {
            PersonalDetails(name = "Cecilia", job = "Tec. de Distribucion", modifier = Modifier.align(Alignment.Center))
        }
        Box(Modifier.align(Alignment.BottomCenter).padding(bottom = 40.dp)) {
            MoreDetails(modifier = Modifier.align(Alignment.BottomCenter))
        }
    }

}

@Composable
fun PersonalDetails(name: String, job: String, modifier: Modifier){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
        ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(R.drawable.button),
            contentDescription = null,
            modifier = Modifier
                .background(Color(0xFF0F1159))
                .size(150.dp)
        )
        Text(
            text = name,
            fontSize = 50.sp
        )
        Text(
            text = job,
            color = Color(0xFF1B5E09)
        )
    }
}

@Composable
fun Details(detail: String, paint: Painter){
    Row {
        Image(
            painter = paint,
            contentDescription = null,
            modifier = Modifier
                .size(30.dp)
                .padding(end = 10.dp),
            colorFilter = ColorFilter.tint(Color.White)
        )
        Text(
            text = detail
        )
    }
}

@Composable
fun MoreDetails(modifier: Modifier){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 60.dp, top = 10.dp, bottom = 10.dp)
    ){
        Details(detail = "983 336 381", painterResource(R.drawable.phone))
        Details(detail = "cecib7card@gmail.com", painterResource(R.drawable.email))

    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaDePresentacionTheme {
        TarjetaDePresentacionApp()
    }
}