package telas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun tela4(){
    Column(modifier = Modifier.fillMaxSize()
        .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween) {
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



        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {
                Button(onClick = {}, colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue ),shape = RoundedCornerShape(5.dp)) {
                    Text("Sign in with", fontSize =18.sp, modifier = Modifier.padding(vertical =10.dp) )
                    Icon(
                        imageVector = Icons.Filled.MailOutline,
                        contentDescription = "facebook",
                        tint = Color.White,
                        modifier = Modifier.size(33.dp)
                    )
                }
                Button(onClick = {}, colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Cyan ),shape = RoundedCornerShape(5.dp)) {
                    Text("Sign in with", fontSize =18.sp, modifier = Modifier.padding(vertical =10.dp))
                    Icon(
                        imageVector = Icons.Filled.MailOutline,
                        contentDescription = "facebook",
                        tint = Color.White,
                        modifier = Modifier.size(33.dp)
                    )
                }

            }
            Spacer(modifier = Modifier.padding(vertical = 15.dp))
            Text("or")
            Spacer(modifier = Modifier.padding(vertical = 15.dp))
            OutlinedTextField(value = "", modifier = Modifier.fillMaxWidth(), colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ), onValueChange = {},label = {
                Row() {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "email",
                        tint = Color.Gray)
                    Text("Email") }})
            OutlinedTextField(value = "", modifier = Modifier.fillMaxWidth(), colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ), onValueChange = {},label = {
                Row(modifier = Modifier.background(color = Color.Transparent)) {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "password",
                        tint = Color.Gray)
                    Text("Password") }})
        }
        Button(onClick = {}, modifier = Modifier.fillMaxWidth()
            .padding(vertical = 10.dp)
            ,colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green ), shape = RoundedCornerShape(5.dp)) {
            Text("Register", fontSize = 18.sp,
                modifier = Modifier.padding(vertical = 10.dp))
        }
        Column(modifier = Modifier.fillMaxWidth()
            , horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Log in", fontSize = 21.sp, color = Color.Green, fontWeight = FontWeight.Bold )
            Text("I've forgotten my password?")
        }
    }
}