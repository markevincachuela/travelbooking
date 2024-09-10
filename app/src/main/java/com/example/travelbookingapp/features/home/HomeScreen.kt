package com.example.travelbookingapp.features.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.travelbookingapp.R
import com.example.travelbookingapp.components.images.BeachItem
import com.example.travelbookingapp.components.images.RoundedImage
import com.example.travelbookingapp.features.useraccount.builder.PersonBuilder
import com.example.travelbookingapp.utils.Screen

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navController: NavController,
    listOfImages: List<BeachItem>
) {


    val pagerState = rememberPagerState(pageCount = { listOfImages.size })

    val test = PersonBuilder.Builder()
        .setFirstname("Mark kevin")
        .setLastname("Cachuela")
        .setAge(1)
        .type("Student")
        .build()

    test.personModel.let {

    }
    val scrollState = rememberScrollState()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(scrollState)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            RoundedImage(
                image = painterResource(R.drawable.login_background),
                cornerRadius = 50.dp
            )
            Text(text = "World")

            Text(text = "test")

        }

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .padding(10.dp)
                .clip(RoundedCornerShape(10.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.home_beach_screen),
                contentDescription = "Login Background",
                modifier = Modifier.matchParentSize(),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomEnd)
                    .padding(5.dp)
                    .clip(RoundedCornerShape(10.dp))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(text = "Name place")
                    Text(text = "What to do")
                }
                Spacer(modifier = Modifier.height(250.dp))
                Text(
                    text = "Dasda",
                    color = Color.White
                )
                Text(
                    text = "description asdasdasdasdas dasdas dasdas dasddas dasd das d sad sa asd as dasd as asd asd asd as dasd a",
                    color = Color.White,
                    overflow = TextOverflow.Clip
                )
            }
        }

        Box(
            modifier = Modifier
                .padding(10.dp)
                .clip(RoundedCornerShape(10.dp))
                .fillMaxSize()

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.height(5.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Categories")
                    Text(
                        modifier = Modifier.clickable {
                            navController.navigate(Screen.DetailsOverviewScreen.route)
                        },
                        text = "See all",
                    )
                }
                HorizontalPager(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    pageSize = PageSize.Fixed(100.dp),
                    state = pagerState,
                    pageSpacing = 10.dp
                ) { page ->
                    listOfImages.getOrNull(
                        index = page % (listOfImages.size)
                    )?.let { beachItem ->
                        BeachListScreen(
                            beachItem = beachItem,
                            navController = navController
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun BeachListScreen(
    beachItem: BeachItem,
    navController: NavController
) {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .clickable {
                //TODO must be MODAL
            }

    ) {
        Image(
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .size(120.dp),
            painter = painterResource(id = beachItem.images),
            contentDescription = "Beach Image",
            contentScale = ContentScale.FillHeight
        )
        Text(
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.CenterHorizontally),
            text = beachItem.title,
            fontSize = 15.sp
        )
    }

}

