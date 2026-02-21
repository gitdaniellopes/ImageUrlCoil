package com.br.imageurlcoil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.br.imageurlcoil.ui.ImageUrl
import com.br.imageurlcoil.ui.theme.ImageUrlCoilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImageUrlCoilTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CoilExamples(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CoilExamples(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "1. Uso basico",
            style = MaterialTheme.typography.titleMedium
        )

        AsyncImage(
            model = "https://picsum.photos/seed/coil1/600/300",
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )

        HorizontalDivider()

        Text(
            text = "2. ContentScale.Crop",
            style = MaterialTheme.typography.titleMedium
        )

        AsyncImage(
            model = "https://picsum.photos/seed/coil2/600/300",
            contentScale = ContentScale.Crop,
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )

        HorizontalDivider()

        Text(
            text = "3. Componente reutilizável",
            style = MaterialTheme.typography.titleMedium
        )

        ImageUrl(
            url = "https://picsum.photos/seed/coil3/600/300",
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )

        HorizontalDivider()

        Text(
            text = "4. Componente reutilizável - Estado de erro",
            style = MaterialTheme.typography.titleMedium
        )

        ImageUrl(
            url = "https://essa-pagina-nao-existe",
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )
    }
}