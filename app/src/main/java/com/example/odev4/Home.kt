package com.example.odev4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(modifier: Modifier = Modifier, navController: NavController) {
    Scaffold (topBar = { CenterAlignedTopAppBar(title ={ Text(text = "Home") })}) {
            paddingValues ->

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Anasayfa")
            Button(onClick = { navController.navigate("PageA") }) {
                Text(text = "Go to A")
            }
            Button(onClick = { navController.navigate("PageX") }) {
                Text(text = "Go to X")
            }
        }

    }
}