package com.example.userinput

import android.R.attr.text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
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
        OutlinedTextField(
            value= TextNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = modifier.width(250.dp),
            label = {Text(text = "Nama Lengkap")},
            onValueChange = {TextNama = it}
        )
    }
    Row {
        gender.forEach { item ->
            Row(modifier = Modifier.selectable(
                selected = TextJK == item,
                onClick = {TextJK = item}
            ), verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = TextJK == item,
                    onClick = {TextJK = item
                    }
                )
                Text(item)
            }
        }
    }
    OutlinedTextField(
        value = TextAlamat,
        singleLine = true,
        modifier = Modifier.width(250.dp),
        label = {Text("Alamat")},
        onValueChange = {
            TextAlamat = it
        }
    )
    HorizontalDivider(
        modifier = Modifier.padding(
            bottom =
                dimensionResource(R.dimen.padding_medium),
                top = dimensionResource(
                    id = R.dimen.padding_medium
                )
        ),
        thickness = dimensionResource(R.dimen.divider_tipis),
        color = Color.DarkGray
    )
    Button(
        modifier = Modifier.fillMaxWidth(1f),
        enabled = TextAlamat.isNotEmpty(),
        onClick = {
            nama=TextNama
            jenis=TextJK
            alamat=TextAlamat
        }
    ) {

    }
}