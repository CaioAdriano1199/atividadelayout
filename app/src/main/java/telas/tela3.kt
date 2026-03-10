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
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun tela3(){
    Column() {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
            .background(Color(0xFF7AA7A5))
            .fillMaxWidth()
            .padding(top = 15.dp)
            .padding(horizontal = 5.dp)) {
            Icon(
                imageVector = Icons.Filled.Home,
                contentDescription = "Opções",
                tint = Color.White


            )
            Text("Modern Art UI", color = Color.White, modifier = Modifier.padding(5.dp), fontSize = 17.sp, fontWeight = FontWeight.Bold)
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
                        .background(Color(0xFF8FA9A8)),
                        contentAlignment = Alignment.Center
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Face,
                            contentDescription = "Opções",
                            tint = Color.White,
                            modifier = Modifier.size(80.dp)
                        )
                        Text("Woman", fontSize = 30.sp, color = Color.White)
                    }
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color(0xFF6E8F93)),
                    contentAlignment = Alignment.Center
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Face,
                            contentDescription = "Opções",
                            tint = Color.White,
                            modifier = Modifier.size(80.dp)
                        )
                        Text("Baby", fontSize = 30.sp, color = Color.White)
                    }
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color(0xFF4F757C)),
                    contentAlignment = Alignment.Center
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Build,
                            contentDescription = "Opções",
                            tint = Color.White,
                            modifier = Modifier.size(80.dp)
                        )
                        Text("Tech", fontSize = 30.sp, color = Color.White)
                    }
                }
                Box(
                    modifier = Modifier
                        .weight(0.10f)
                        .fillMaxWidth()
                        .background(Color(0xFF406770))
                )
            }
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color(0xFF7F9E9C)),
                    contentAlignment = Alignment.Center
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Face,
                            contentDescription = "Opções",
                            tint = Color.White,
                            modifier = Modifier.size(80.dp)
                        )
                        Text("Man", fontSize = 30.sp, color = Color.White)
                    }
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color(0xFF5F848A)),
                    contentAlignment = Alignment.Center
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Place,
                            contentDescription = "Opções",
                            tint = Color.White,
                            modifier = Modifier.size(80.dp)
                        )
                        Text("Travel", fontSize = 30.sp, color = Color.White)
                    }
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color(0xFF406770)),
                    contentAlignment = Alignment.Center
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ShoppingCart,

                            contentDescription = "Opções",
                            tint = Color.White,
                            modifier = Modifier.size(80.dp)
                        )
                        Text("Food&Drink", fontSize = 30.sp, color = Color.White)
                    }
                }
                Box(
                    modifier = Modifier
                        .weight(0.10f)
                        .fillMaxWidth()
                        .background(Color(0xFF4F757C))
                )
            }
        }
    }
}