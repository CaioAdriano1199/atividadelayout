package telas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment

@Composable
fun tela2(){
    Column(){
        Row(horizontalArrangement = Arrangement.SpaceBetween,verticalAlignment = Alignment.CenterVertically, modifier = Modifier.background(color = Color.Blue)
            .fillMaxWidth()
            .padding(top = 15.dp)) {
            Text("Modern Art UI", color = Color.White)
            Icon(
                imageVector = Icons.Filled.MoreVert,
                contentDescription = "Opções",
                tint = Color.White
            )
        }
        Row(
            modifier = Modifier.fillMaxSize()
        ) {

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color.Cyan)
                        .border(4.dp, Color.Black)
                )

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color.Magenta)
                        .border(4.dp, Color.Black)
                )
            }

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color.Red)
                        .border(4.dp, Color.Black)
                )

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color.White)
                        .border(4.dp, Color.Black)
                )

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color.Blue)
                        .border(4.dp, Color.Black)
                )
            }
        }
    }
}