package telas

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun tela5() {
    var presses by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.background,
                ),
                title = {
                    Text("My Application")
                }
            )
        }

    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
           Row() {
               Text("Time", color = Color.Gray)
               Spacer(modifier = Modifier.width(40.dp))
               Text("1:07 AM")
           }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("First Name", color = Color.Gray)
                TextField(value = "", onValueChange = {  },  colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Gray,
                    unfocusedIndicatorColor = Color.Gray,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent
                ))
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Last Name", color = Color.Gray)
                TextField(value = "", onValueChange = {  },  colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Gray,
                    unfocusedIndicatorColor = Color.Gray,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent
                ))
            }
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "Opções",
                    tint = Color.LightGray,
                    modifier = Modifier.size(53.dp)

                )
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "Opções",
                    tint = Color.LightGray,
                    modifier = Modifier.size(53.dp)

                )
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "Opções",
                    tint = Color.LightGray,
                    modifier = Modifier.size(53.dp)

                )
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "Opções",
                    tint = Color.LightGray,
                    modifier = Modifier.size(53.dp)

                )
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "Opções",
                    tint = Color.LightGray,
                    modifier = Modifier.size(53.dp)

                )
            }
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.weight(0.75f))
            Button(onClick = {},shape = RoundedCornerShape(0.dp),colors = ButtonDefaults.buttonColors(
                containerColor = Color.LightGray ), modifier = Modifier.weight(3f)
                .fillMaxWidth()) {
                Text("SUBMIT", color = Color.Black)
            }
                Spacer(modifier = Modifier.weight(0.5f))
            }
        }
    }
}