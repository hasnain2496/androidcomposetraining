package com.example.androidtrainingprogram.activities

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.androidtrainingprogram.R
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

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Profile",
                        style = MaterialTheme.typography.body1,
                        textAlign = TextAlign.Center
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {

                    }) {
                        Icon(Icons.Rounded.KeyboardArrowLeft, "")
                    }
                },
                backgroundColor = Color(0xFF9470CE),
                actions = {
                    IconButton(onClick = {
                    }) {
                        Icon(
                            Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                }
            )
        },
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(0xFFCCC2DC))
            ) {

                Spacer(modifier = Modifier.height(100.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    backgroundColor = Color.White,
                    elevation = 6.dp,
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Spacer(modifier = Modifier.height(50.dp))
                        Text(
                            "Saad Khan",
                            style = MaterialTheme.typography.h4.copy(
                                color = Color.Black,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(
                            "Johar Town",
                            style = MaterialTheme.typography.body1.copy(
                                color = Color.White,
                                fontSize = 12.sp,
                            ),
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Button(
                            modifier = Modifier
                                .height(40.dp)
                                .width(150.dp),
                            onClick = {},
                            enabled = true,
                            shape = RoundedCornerShape(50.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)

                        ) {
                            Text(
                                text = "FOLLOW",
                                style = MaterialTheme.typography.body1.copy(color = Color.White)
                            )
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                    }

                }
                Spacer(modifier = Modifier.height(28.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    elevation = 6.dp,
                    backgroundColor = Color.White,
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(70.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .weight(1f),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                "224",
                                style = MaterialTheme.typography.h4.copy(
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                            Text(
                                "Following",
                                style = MaterialTheme.typography.body1.copy(
                                    color = Color.White,
                                    fontSize = 12.sp,
                                ),
                                color = Color.Gray
                            )
                        }
                        Divider(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(1.dp)
                                .padding(vertical = 16.dp),
                            color = Color.Gray,
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .weight(1f),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                "48.6 K",
                                style = MaterialTheme.typography.h4.copy(
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                            Text(
                                "Followers",
                                style = MaterialTheme.typography.body1.copy(
                                    color = Color.White,
                                    fontSize = 12.sp,
                                ),
                                color = Color.Gray
                            )
                        }
                        Divider(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(1.dp)
                                .padding(vertical = 16.dp),
                            color = Color.Gray,
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .weight(1f),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                "3.2 M",
                                style = MaterialTheme.typography.h4.copy(
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                            Text(
                                "Like",
                                style = MaterialTheme.typography.body1.copy(
                                    color = Color.White,
                                    fontSize = 12.sp,
                                ),
                                color = Color.Gray
                            )
                        }
                    }

                }
                Spacer(modifier = Modifier.height(28.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    elevation = 6.dp,
                    backgroundColor = Color.White,
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 16.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                "Friends",
                                style = MaterialTheme.typography.body1.copy(
                                    color = Color.Black,
                                    fontSize = 12.sp,
                                )
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            Text(
                                "SEE ALL",
                                style = MaterialTheme.typography.body1.copy(
                                    color = Color.White,
                                    fontSize = 12.sp,
                                ),
                                color = Color.Gray
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(70.dp)
                        ) {
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.ic_launcher_foreground),
                                    contentDescription = "avatar",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                        .border(
                                            1.dp,
                                            Color.Gray,
                                            CircleShape
                                        )
                                )
                                Text(
                                    "Saad",
                                    style = MaterialTheme.typography.body1.copy(
                                        color = Color.White,
                                        fontSize = 12.sp,
                                    ),
                                    color = Color.Gray
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.ic_launcher_foreground),
                                    contentDescription = "avatar",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                        .border(
                                            1.dp,
                                            Color.Gray,
                                            CircleShape
                                        )
                                )
                                Text(
                                    "Saad",
                                    style = MaterialTheme.typography.body1.copy(
                                        color = Color.White,
                                        fontSize = 12.sp,
                                    ),
                                    color = Color.Gray
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.ic_launcher_foreground),
                                    contentDescription = "avatar",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                        .border(
                                            1.dp,
                                            Color.Gray,
                                            CircleShape
                                        )
                                )
                                Text(
                                    "Saad",
                                    style = MaterialTheme.typography.body1.copy(
                                        color = Color.White,
                                        fontSize = 12.sp,
                                    ),
                                    color = Color.Gray
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.ic_launcher_foreground),
                                    contentDescription = "avatar",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                        .border(
                                            1.dp,
                                            Color.Gray,
                                            CircleShape
                                        )
                                )
                                Text(
                                    "Saad",
                                    style = MaterialTheme.typography.body1.copy(
                                        color = Color.White,
                                        fontSize = 12.sp,
                                    ),
                                    color = Color.Gray
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.ic_launcher_foreground),
                                    contentDescription = "avatar",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                        .border(
                                            1.dp,
                                            Color.Gray,
                                            CircleShape
                                        )
                                )
                                Text(
                                    "Saad",
                                    style = MaterialTheme.typography.body1.copy(
                                        color = Color.White,
                                        fontSize = 12.sp,
                                    ),
                                    color = Color.Gray
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                        }
                    }

                }
            }

            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(top = 60.dp)
                    .align(Alignment.TopCenter)
                    .size(70.dp)
                    .clip(CircleShape)
                    .border(
                        1.dp,
                        Color.Gray,
                        CircleShape
                    )
            )
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