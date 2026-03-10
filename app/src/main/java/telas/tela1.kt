package telas

import android.widget.RadioGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun tela1() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxHeight()
            .background(color = Color.Black)
    ) {
        Column() {
        Row(modifier = Modifier.padding(vertical =15.dp)) {
            Icon(
                imageVector = Icons.Filled.AccountBox,
                contentDescription = "Favorito"

            )
            Text("UILabs", color = Color.White,fontSize = 20.sp , modifier = Modifier.padding(horizontal = 5.dp))

        }
        Divider(
            color = Color.Cyan,
            thickness = 2.dp
        )
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Text("Title", color = Color.White,fontSize = 24.sp)
            TextField(value = "", onValueChange = {  }, modifier = Modifier.fillMaxWidth(),  colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Cyan,
                unfocusedIndicatorColor = Color.Cyan,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent
            ))
        }
Column() {
    Text("Status", color = Color.White,fontSize = 24.sp)
    Row() {
        RadioButton(

            selected = false,
            onClick = { }
        )
        Text("Done", color = Color.White)

        RadioButton(
            selected = true,
            onClick = { }
        )
        Text("Not Done", color = Color.White)
    }
}
Column() {
    Text("Priority:", color = Color.White,fontSize = 24.sp)
    Row() {
        RadioButton(
            selected = false,
            onClick = { }
        )
        Text("Low", color = Color.White)

        RadioButton(
            selected = true,
            onClick = { }
        )
        Text("Medium", color = Color.White)

        RadioButton(
            selected = false,
            onClick = { }
        )
        Text("High", color = Color.White)
    }
}

        Text("Time and Date", color = Color.White,fontSize = 24.sp)
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column() {
                Text("2014-02-13", color = Color.White)
                Button(onClick = {},shape = RoundedCornerShape(0.dp,
                      ),colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray ),
                    contentPadding = PaddingValues(8.dp))
                {Text("Choose Date", color = Color.White,fontSize = 20.sp) }
            }
            Column() {
                Text("17:52:00", color = Color.White)
                Button(onClick = {},shape = RoundedCornerShape(0.dp),colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray ),
                    contentPadding = PaddingValues(8.dp) ) {Text("Choose Time", color = Color.White,fontSize = 20.sp) }
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(onClick = {},shape = RoundedCornerShape(0.dp),colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray ),
                contentPadding = PaddingValues(8.dp)) {Text("Cancel",fontSize = 20.sp) }
            Button(onClick = {},shape = RoundedCornerShape(0.dp),colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray ),
                contentPadding = PaddingValues(8.dp)) {Text("Reset",fontSize = 20.sp) }
            Button(onClick = {},shape = RoundedCornerShape(0.dp),colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray ),
                contentPadding = PaddingValues(8.dp)) {Text("Submit",fontSize = 20.sp) }
        }

    }
}