package com.example.userinput

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun formDataDiri (modifier: Modifier) {
    var TextNama by remember {mutableStateOf("")}
    var TextAlamat by remember {mutableStateOf("")}
    var TextJK by remember {mutableStateOf("")}
    val gender:List<String> =listOf("Laki-Laki","Perempuan")

    var nama by remember {mutableStateOf("")}
    var alamat by remember {mutableStateOf("")}
    var jenis by remember {mutableStateOf("")}

    Column(modifier = Modifier.padding(top=50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally){

    }
}