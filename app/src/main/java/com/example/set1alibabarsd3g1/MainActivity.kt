package com.example.set1alibabarsd3g1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.set1alibabarsd3g1.ui.theme.Set1AliBabaRSD3G1Theme

enum class userInterface(){
    Start,
    Contact
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Set1AliBabaRSD3G1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UserInterface()
                }
            }
        }
    }
}

@Composable
fun UserInterface() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var username by remember { mutableStateOf("") }
        var studentID by remember { mutableStateOf("")}
        var courseCode by remember { mutableStateOf("")}
        var score by remember { mutableStateOf(0)}
        var newScore = 0

        TextField(
            value = username ,
            onValueChange = {username = it},
            label =  {
                Text(text = "Username")
            })

        Spacer(modifier = Modifier.height(12.dp))

        Row {
            TextField(
                value = studentID,
                onValueChange = {studentID = it},
                label =  {
                    Text(text = "Student ID")
                })
        }

        Spacer(modifier = Modifier.height(12.dp))

        Row {
            TextField(
                value = courseCode,
                onValueChange = {courseCode = it},
                label =  {
                    Text(text = "Course Code")
                })
        }

        Spacer(modifier = Modifier.height(12.dp))

        Row {
            TextField(
                value = score.toString(),  // Convert score to String for TextField
                onValueChange = { newText: String ->
                    val newScore = newText.toIntOrNull() ?: 0  // Parse String to Int (handle null or invalid input)
                    score = newScore  // Update score with the parsed integer
                },
                label =  {
                    Text(text = "Score")
                })
        }

        Spacer(modifier = Modifier.height(12.dp))

        Row {
            Button(onClick = {}) {
                Text(text = "Submit")
            }
        }
        Row {
            Text(
                text = String.format("Results:\nUsername: %s\nStudent ID: %s\nCourse Code: %s\nScore: %s\nGrade: %s", username, studentID, courseCode, score, gradeCalculator(score)),
                )
        }
    }

}

@Preview
@Composable
fun userInterfacePreview(){
    UserInterface()
}


fun gradeCalculator(score: Int): String{
    var grade = ""
    if (score < 100){
        grade = "A"
    }
    else if (score < 80){
        grade = "A-"
    }
    else if (score < 75){
        grade = "B+"
    }
    else if (score < 70){
        grade = "B"
    }
    else if (score < 65){
        grade = "B-"
    }
    else if (score < 60){
        grade = "C+"
    }
    else if (score < 55){
        grade = "C"
    }
    else{
        grade = "D"
    }
    return grade
}
