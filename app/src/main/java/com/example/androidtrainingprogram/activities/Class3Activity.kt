package com.example.androidtrainingprogram.activities

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.androidtrainingprogram.R
import com.example.androidtrainingprogram.ui.theme.AndroidTrainingProgramTheme
import com.example.androidtrainingprogram.utils.randomSampleImageUrl

class Class3Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AndroidTrainingProgramTheme {
                Class3Screen(randomSizedPhotos)
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Class3Screen(data: List<String>) {
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
                backgroundColor = Color(0xFF9470CE),
            )
        },
    ) {
        ConstraintLayout(
            modifier = Modifier.fillMaxSize()
        ) {
            val (button, image) = createRefs()

            AsyncImage(
                "https://propakistani.pk/wp-content/uploads/2022/10/Rawalpindi-skyline.jpg",
                contentDescription = "",
                modifier = Modifier
                    .constrainAs(image) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        width = Dimension.fillToConstraints
                        height = Dimension.wrapContent
                    },
            )

            Button(
                modifier = Modifier.constrainAs(button) {
                    top.linkTo(image.top)
                    bottom.linkTo(image.bottom)
                    start.linkTo(image.end)
                    end.linkTo(parent.end)
                },
                onClick = { /*TODO*/ },
            ) {
                Text(text = "Click Here")
            }

            createHorizontalChain(image, button, chainStyle = ChainStyle.Spread)
        }
        /*Column(
            modifier = Modifier.padding(it)
        ) {
            *//*LazyColumn(
                modifier = Modifier
                    .padding(it)
                    .fillMaxWidth()
                    .weight(1f),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(data.size) { index ->
//                    AsyncImage(
//                        data[index],
//                        contentDescription = "",
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(128.dp),
//                        contentScale = ContentScale.Crop
//                    )
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(data[index])
                            .crossfade(true)
                            .build(),
                        placeholder = painterResource(R.drawable.ic_launcher_foreground),
                        contentDescription = stringResource(R.string.app_name),
                        contentScale = ContentScale.FillBounds,
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            LazyRow(
                modifier = Modifier
                    .padding(it)
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                itemsIndexed(data) { index, item ->
                    AsyncImage(
                        item,
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(128.dp)
                    )
                }
            }*//*

            *//*LazyVerticalStaggeredGrid(
                columns = StaggeredGridCells.Fixed(3),
                verticalItemSpacing = 4.dp,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                content = {
                    items(data.size) { index ->
                        AsyncImage(
                            data[index],
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight(),
                            contentScale = ContentScale.Crop
                        )
                    }
                },
            )*//*

            *//*LazyVerticalStaggeredGrid(
                columns = StaggeredGridCells.Adaptive(120.dp),
                verticalItemSpacing = 4.dp,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                content = {
                    items(data.size) { index ->
                        AsyncImage(
                            data[index],
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight(),
                            contentScale = ContentScale.Crop
                        )
                    }
                },
            )*//*
        }*/
    }
}

@Preview
@Composable
fun Class3ScreenPreview() {
//    val data = arrayListOf<String>()
//    data.add("https://images.pexels.com/photos/268533/pexels-photo-268533.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500")
//    data.add("https://images.pexels.com/photos/268533/pexels-photo-268533.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500")
//    data.add("https://images.pexels.com/photos/268533/pexels-photo-268533.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500")
//    data.add("https://images.pexels.com/photos/268533/pexels-photo-268533.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500")

//    AndroidTrainingProgramTheme {
//        Class3Screen(data)
//    }
}


private val randomSizedPhotos = listOf(
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 900, height = 1600),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 300, height = 400),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 900, height = 1600),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 300, height = 400),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 900, height = 1600),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 300, height = 400),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 300, height = 400),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 900, height = 1600),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 300, height = 400),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 500, height = 500),
)