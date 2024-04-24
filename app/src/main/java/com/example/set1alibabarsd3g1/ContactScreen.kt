package com.example.set1alibabarsd3g1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun contactScreen(
    modifier: Modifier = Modifier,
    onNextButtonClicked: () -> Unit,
    onCancelButtonClicked: () -> Unit)
{
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){

        Spacer(modifier = Modifier.height(30.dp))

        Row(verticalAlignment = Alignment.Top){
            Text(
                text =  "Contact Us"
            )

        }


    }
}





@Preview(showBackground = true)
@Composable
fun contactPreview(){
    contactScreen(
        modifier = Modifier,
    onNextButtonClicked = {},
    onCancelButtonClicked = {}
    )
}