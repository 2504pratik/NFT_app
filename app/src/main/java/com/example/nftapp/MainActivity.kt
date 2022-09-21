package com.example.nftapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.nftapp.ui.theme.NftAppTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NftAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AddImage(
                        s1 = stringResource(id = R.string.s1),
                        s2 = stringResource(id = R.string.s2),
                        s3 = stringResource(id = R.string.s3)
                    )
                }
            }
        }
    }
}

@Composable
fun AddImage(s1: String, s2: String, s3: String) {
    val image = painterResource(id = R.drawable.javier_miranda_mrwocgkfvdg_unsplash_1)
    Image(
        painter = image, contentDescription = null,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
    HomePage(s1 = s1, s2 = s2, s3 = s3)
}

@Composable
fun HomePage(s1: String, s2: String, s3: String) {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = s1,
            color = Color.White,
            fontSize = 54.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(start = 30.dp, top = 40.dp)
        )
        Spacer(modifier = Modifier.height(200.dp))
        Text(
            text = s2,
            color = Color.White,
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
        )
        Text(
            text = s3,
            color = Color.White,
            fontSize = 15.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        )
        Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(top = 24.dp)) {
            Text(text = stringResource(id = R.string.Get_started_now))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddImagePreview() {
    NftAppTheme {
        AddImage(
            s1 = stringResource(id = R.string.s1),
            s2 = stringResource(id = R.string.s2),
            s3 = stringResource(id = R.string.s3)
        )
    }
}