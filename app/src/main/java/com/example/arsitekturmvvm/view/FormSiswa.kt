package com.example.arsitekturmvvm.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.arsitekturmvvm.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormSiswa(
    pilihanJK: List<String>,
    onSubmitButtonClicked: (MutableList<String>)-> Unit,
    modifier: Modifier = Modifier
) {
    var txtNama by rememberSaveable { mutableStateOf(value = "") }
    var txtAlamat by rememberSaveable { mutableStateOf(value = "") }
    var txtGender by rememberSaveable { mutableStateOf(value = "") }
    val listData: MutableList<String> = mutableListOf(txtNama, txtGender, txtAlamat)

    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(R.string.form), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(R.color.purple_200))
            )
        }
    ){ isiRuang ->
        Column(
            modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            OutlinedTextField(
                value = txtNama,
                singleLine = true,
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier.width(250.dp).padding(top = 20.dp),
                label = { Text(text = "Nama Lengkap")},
                onValueChange = {
                    txtNama = it
                }
            )
        }
    }
}