package telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.ShoppingCart
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun tela7(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF333333),
                    titleContentColor = MaterialTheme.colorScheme.background,
                ),
                title = {
                    Text("BoaViagem", fontSize = 25.sp, fontWeight = FontWeight.Bold )
                }
            )
        }

    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Blue)
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier.weight(1f)
                    .fillMaxSize()
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(Color.Blue),
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
                        Text("Novo Gasto", fontSize = 24.sp, color = Color.White)
                    }
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(Color.Blue),
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
                        Text("Minhas Viagens", fontSize = 24.sp, color = Color.White)
                    }
                }
        }
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(Color.Blue),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Filled.DateRange,
                            contentDescription = "Opções",
                            tint = Color.White,
                            modifier = Modifier.size(80.dp)
                        )
                        Text("Nova Viagem", fontSize = 24.sp, color = Color.White)
                    }
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(Color.Blue),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Build,
                            contentDescription = "Opções",
                            tint = Color.White,
                            modifier = Modifier.size(80.dp)
                        )
                        Text("Configurações", fontSize = 24.sp, color = Color.White)
                    }
                }
            }}
        }
    }
}