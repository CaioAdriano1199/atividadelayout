package telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun tela4(){
    Column() {
        Column(modifier = Modifier.fillMaxWidth()
                            .padding(top = 15.dp)
            ,horizontalAlignment = Alignment.CenterHorizontally) {
            Box(modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .background(Color.Green),
                contentAlignment = Alignment.Center){
                Icon(
                    imageVector = Icons.Filled.Create,
                    contentDescription = "Opções",
                    tint = Color.White,
                    modifier = Modifier.size(60.dp))
            }
            Text("Chatt", fontSize = 30.sp, color = Color.Green)
            Text("Simple mobile chat and notes", color = Color.Green)
        }
        Row() {
            Button(onClick = {}) {
                Text("Sign in with")
            }
            Button(onClick = {}) {
                Text("Sign in with")
            }

        }
        Text("or")
    }
}