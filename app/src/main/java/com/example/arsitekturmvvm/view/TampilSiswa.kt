package com.example.arsitekturmvvm.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.core.util.Pair
import com.example.arsitekturmvvm.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    statusUiSiswa: siswa,
    onBackButtonClicked:() ->Unit,
){
    val items = listOf(
        Pair(first = stringResource(R.string.nama_lengkap), second = statusUiSiswa.nama),
        Pair(first = stringResource(R.string.gender), second = statusUiSiswa.gender),
        Pair(first = stringResource(R.string.alamat), second = statusUiSiswa.alamat),
    )

    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(R.string.detail), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(R.color.purple_200)),
            )
        }) {  }
}