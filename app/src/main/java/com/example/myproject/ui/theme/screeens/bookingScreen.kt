package com.example.myproject.ui.theme.screeens

import android.annotation.SuppressLint
import android.widget.NumberPicker
import android.widget.NumberPicker.OnValueChangeListener
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DatePicker
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
//import com.google.ai.client.generativeai.type.content
//import com.google.firebase.vertexai.type.content
import java.time.LocalDate

data class BookingScreen(
    val checkAdmissionDate : LocalDate?,
    val checkDateOut : LocalDate?,
    val numStudents : Int,
    val cardNumber: String,
    val cardExpiry: String,

)



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookingScreen(onBook:NavHostController){
    var checkAdmissionDate by remember { mutableStateOf<LocalDate?>(null)}
    var checkDateOut by remember{ mutableStateOf<LocalDate?>(null)}
    var numStudents by remember{ mutableStateOf(1)}
    var cardNumber by remember { mutableStateOf("")}
    var cardExpiry by remember { mutableStateOf("")}


    Scaffold {
        TopAppBar(title = { Text(text = "booking")})
    }
    var content = @Composable {
        Column {
            var modifier = Modifier.fillMaxSize().padding(16.dp)

        }
    }


}

