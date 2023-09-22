package com.example.androidtrainingprogram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.AlertDialog
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.androidtrainingprogram.ui.theme.AndroidTrainingProgramTheme
import com.example.androidtrainingprogram.ui.theme.Purple40
import com.example.androidtrainingprogram.ui.theme.Purple80
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidTrainingProgramTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    var isDialogVisible by remember {
        mutableStateOf(false)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Android Training Program",
                        style = MaterialTheme.typography.body1
                    )
                },
                actions = {
                    IconButton(onClick = {
                        isDialogVisible = true
                    }) {
                        Icon(
                            Icons.Filled.Favorite,
                            contentDescription = "Localized description"
                        )
                    }
                }
            )
        },
    ) {
        val state = rememberScrollState()

        if (isDialogVisible) {
            /*AlertDialogSample(
                onDismissDialog = {
                    isDialogVisible = false
                },
                onPressedCancel = {

                },
                onPressedYes = {

                },
            )*/
            CustomDialogSample(description = "This is some description.") {
                isDialogVisible = false
            }
        }

        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(state)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(96.dp),
            ) {
                Icon(
                    modifier = Modifier.size(96.dp),
                    painter = rememberVectorPainter(image = Icons.Filled.Info),
                    contentDescription = ""
                )
                Text(
                    modifier = Modifier.fillMaxSize(),
                    overflow = TextOverflow.Ellipsis,
                    text = "This is dummy text. This is dummy text. This is dummy text. This is dummy text.This is dummy text. This is dummy text.This is dummy text. This is dummy text."
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            var text by remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = text,
                onValueChange = {
                    text = it
                },
            )

            if(text.isNotEmpty()) {
                Text(text)
            }

            /*Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(Color.Blue),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Hello World 1")
                Text("Hello World 2")
            }

            Image(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .clip(RoundedCornerShape(8.dp)),
                painter = painterResource(id = R.drawable.dummy),
                contentScale = ContentScale.Crop,
                contentDescription = ""
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(Color.Green)
            ) {
                Surface(
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp),
                    color = Color.Red
                ) {

                }

                Surface(
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .align(Alignment.BottomCenter),
                    color = Color.Yellow
                ) {

                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                backgroundColor = Color.Magenta,
                shape = RoundedCornerShape(16.dp)
            ) {
                Row() {
                    Image(
                        modifier = Modifier
                            .width(96.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        painter = painterResource(id = R.drawable.dummy),
                        contentScale = ContentScale.Crop,
                        contentDescription = ""
                    )
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceAround
                    ) {
                        Text(
                            "Hello World 1",
                            style = MaterialTheme.typography.body1.copy(color = Color.White)
                        )
                        Spacer(modifier = Modifier.height(30.dp))
                        Text(
                            "Hello World 1",
                            style = MaterialTheme.typography.body1.copy(color = Color.White)
                        )
                    }
                }
            }*/
        }
    }
}

@Composable
fun AlertDialogSample(
    onDismissDialog: () -> Unit,
    onPressedYes: () -> Unit,
    onPressedCancel: () -> Unit,
) {
    AlertDialog(
        title = {
            Text(text = "Title")
        },
        text = {
            Text(text = "This is dialog description.")
        },
        onDismissRequest = {
            onDismissDialog.invoke()
        },
        buttons = {
            TextButton(onClick = {
                onPressedYes.invoke()
            }) {
                Text(text = "Yes")
            }
            TextButton(onClick = {
                onPressedCancel.invoke()
            }) {
                Text(text = "No")
            }
        },
    )
}

@Composable
fun CustomDialogSample(
    description: String,
    onDismissDialog: () -> Unit,
) {
    Dialog(
        content = {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                backgroundColor = Color.White,
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Error")
                    Text(text = description)
                    TextButton(onClick = {
                        onDismissDialog.invoke()
                    }) {
                        Text(text = "Okay")
                    }
                }
            }
        },
        onDismissRequest = {
            onDismissDialog.invoke()
        },
    )
}

@Composable
fun Class1UI() {
    val state = rememberScrollState()

    Column(
        modifier = Modifier
            /*.padding(it)*/
            .verticalScroll(state)
    ) {
        val annotatedString = buildAnnotatedString {
            val string = "Click on link to open web view."
            val mStartIndex = string.indexOf("link")
            val mEndIndex = mStartIndex + 4

            withStyle(
                SpanStyle(
                    color = Color.Red
                ),
            ) {
                append(string)
            }
            addStyle(
                SpanStyle(
                    textDecoration = TextDecoration.Underline,
                    color = Color.Green,
                    fontWeight = FontWeight.Bold
                ),
                start = mStartIndex,
                end = mEndIndex
            )
            addStringAnnotation(
                tag = "URL",
                annotation = "www.google.com",
                start = mStartIndex,
                end = mEndIndex
            )
        }
        ClickableText(
            text = annotatedString,
            style = MaterialTheme.typography.body1.copy(
                color = if (isSystemInDarkTheme()) Purple40 else Purple80
            ),
            onClick = {
                annotatedString.getStringAnnotations("URL", it, it)
                    .firstOrNull()?.let { stringAnnotation ->
                        println(stringAnnotation.item)
                    }
            }
        )

        Text(
            modifier = Modifier
                .padding(8.dp)
                .background(Color.Black, shape = RoundedCornerShape(8.dp))
                .border(color = Color.Red, width = 1.dp, shape = RoundedCornerShape(8.dp))
                .padding(8.dp)
                .clickable {
                },
            text = "Click Here",
            style = MaterialTheme.typography.body1.copy(
                color = Color.White
            )
        )
    }
}


@Composable
fun WelcomeUser(name: String) {
    Box(
        modifier = Modifier.background(Purple40)
    ) {
        Text(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .background(Color.Black)
                .padding(8.dp),
            text = "Hello $name!",
            textDecoration = TextDecoration.LineThrough,
            style = MaterialTheme.typography.body1.copy(
                color = Color.White
            )
        )
    }
}

@Composable
fun WelcomeUserPreview() {
    WelcomeUser(name = "Hasnain")
}


@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    AndroidTrainingProgramTheme {
        MainScreen()
    }
}