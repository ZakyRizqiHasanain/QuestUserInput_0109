package com.example.userinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun formDataDiri (modifier: Modifier) {
    var TextNama by remember {mutableStateOf("")}
    var TextAlamat by remember {mutableStateOf("")}
    var TextJK by remember {mutableStateOf("")}
    val gender:List<String> =listOf("Laki-Laki","Perempuan")

}