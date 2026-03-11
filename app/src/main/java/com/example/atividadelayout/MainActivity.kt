package com.example.atividadelayout

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.atividadelayout.ui.theme.AtividadelayoutTheme
import telas.tela1
import telas.tela2
import telas.tela3
import telas.tela4
import telas.tela5
import telas.tela7

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AtividadelayoutTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    meuapp(

                    )
                }
            }
        }
    }
}

@Composable
fun meuapp() {
    tela7()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AtividadelayoutTheme {
        meuapp()
    }
}