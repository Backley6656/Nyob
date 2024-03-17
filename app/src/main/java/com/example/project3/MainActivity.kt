package com.example.project3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project3.ui.theme.Project3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                GreetingText(
                    message = "Happy Graduation Anne",
                    hope = "Good luck on your new beginnings!",
                    from = "From Ray",
                    modifier = Modifier.padding(8.dp))

                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String,hope: String, from: String, modifier: Modifier = Modifier) {
    Column (verticalArrangement = Arrangement.Center,
    modifier = Modifier.padding(8.dp)){

        Text(
            text = message,
            fontSize = 50.sp,
            lineHeight = 50.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = hope,
            fontSize = 20.sp,
            modifier = modifier
                .padding(2.dp)
                .align(alignment = Alignment.CenterHorizontally)

        )
        Text(
            text = from,
            fontSize = 28.sp,
            modifier= modifier
                .padding(10.dp)
                .align(alignment = Alignment.End)
        )
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Project3Theme {
        GreetingText(
            message = "Happy Graduation Anne",
            from = "From Ray",
            hope = "Good luck on your new beginnings!"
        )
    }
}