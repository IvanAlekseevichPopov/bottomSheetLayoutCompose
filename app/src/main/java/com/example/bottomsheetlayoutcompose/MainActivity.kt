package com.example.bottomsheetlayoutcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bottomsheetlayoutcompose.ui.theme.BottomSheetLayoutComposeTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomSheetLayoutComposeTheme {
                val state = rememberModalBottomSheetState(
                    initialValue = ModalBottomSheetValue.Expanded,
                    skipHalfExpanded = true
                )
                // A surface container using the 'background' color from the theme
                BottomSheetLayoutView(
                    modifier = Modifier.fillMaxSize(),
                    sheetContent = {
                        LazyColumn {
                            items(5) {
                                ListItem(
                                    text = { Text("Item $it") },
                                    icon = {
                                        Icon(
                                            Icons.Default.Favorite,
                                            contentDescription = "Localized description"
                                        )
                                    }
                                )
                            }
                        }
                    },
                    sheetState = state,
                ) {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        Greeting("Android")
                    }
//                    Greeting("Android")
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BottomSheetLayoutComposeTheme {
        Greeting("Android")
    }
}