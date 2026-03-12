package telas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atividadelayout.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun tela6(){
    Scaffold(
        topBar = {
            TopAppBar(

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Cyan,
                    titleContentColor = MaterialTheme.colorScheme.background,
                ),
                title = {
                    Text("")
                }
            )
        }
    )
    {innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
        Column(modifier = Modifier.fillMaxHeight(),verticalArrangement = Arrangement.SpaceBetween) {
            Row(modifier = Modifier.padding(top=16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.alanwake),
                contentDescription = "Minha imagem",
                modifier = Modifier.size(170.dp)
            )
            Column(modifier = Modifier.weight(1f)) {
                Text("Alan Wake", fontSize = 25.sp)
                Text("Rick Burroughs")
                Text("1 maio 2010")
            }


                    Button(onClick = {}, modifier = Modifier
                        .padding(top = 120.dp)
                        .padding(horizontal = 10.dp),shape = RoundedCornerShape(4.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Cyan
                        )) {
                        Text("Ler", modifier = Modifier.padding(horizontal = 10.dp), color = Color.Gray, fontSize = 18.sp, fontWeight = FontWeight.Bold

                        )
                    }


            }
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Cyan
                    ),
                    shape = CircleShape,
                    modifier = Modifier.size(60.dp),
                    contentPadding = PaddingValues(0.dp),
                    border = BorderStroke(2.dp, Color.Gray) ) { Text("4.0", fontSize = 30.sp)}
                    Text("nota")
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Button(onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Blue
                        ),
                        shape = CircleShape,
                        modifier = Modifier.size(60.dp),
                        contentPadding = PaddingValues(0.dp) ) {         Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Opções",
                        tint = Color.White,
                        modifier = Modifier.size(30.dp)
                    )}
                    Text("texto")
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Button(onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Green
                        ),
                        shape = CircleShape,
                        modifier = Modifier.size(60.dp),
                        contentPadding = PaddingValues(0.dp) ) {         Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Opções",
                        tint = Color.White,
                        modifier = Modifier.size(30.dp)
                    )}
                    Text("Texto")
                }
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("O livro Alan Wake, escrito por Rick Burroughs, é uma novelização do jogo de 2010. A história acompanha o famoso autor de thrillers, Alan Wake, que viaja com sua esposa Alice para a pacata cidade de Bright Falls para curar um bloqueio criativo. Após Alice desaparecer misteriosamente")
                Text("Saiba Mais", color = Color.Cyan, modifier = Modifier.padding(top=15.dp))
            }
        }
        }
    }
}