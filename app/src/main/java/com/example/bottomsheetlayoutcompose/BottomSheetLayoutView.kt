package com.example.bottomsheetlayoutcompose

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//import com.octafx.uikit.style.toplarge

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheetLayoutView(
    modifier: Modifier = Modifier,
    sheetContent: @Composable ColumnScope.() -> Unit,
    sheetState: ModalBottomSheetState,
    content: @Composable () -> Unit
) {
    ModalBottomSheetLayout(
        modifier = modifier,
        sheetContent = sheetContent,
        sheetState = sheetState,
//        sheetShape = MaterialTheme.shapes.toplarge,
        content = content,
    )
}

//@OptIn(ExperimentalMaterialApi::class)
//@Preview(name = "Light Theme")
//@Preview(name = "Dark Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
//@Composable
//fun PreviewBottomSheetLayoutView() {
//    var skipHalfExpanded by remember { mutableStateOf(false) }
//    val state = rememberModalBottomSheetState(
//        initialValue = ModalBottomSheetValue.Hidden,
//        skipHalfExpanded = skipHalfExpanded
//    )
//    val scope = rememberCoroutineScope()
//    AppMaterialTheme {
//        BottomSheetLayoutView(
//            sheetState = state,
//            sheetContent = {
//                LazyColumn {
//                    items(5) {
//                        ListItem(
//                            text = { Text("Item $it") },
//                            icon = {
//                                Icon(
//                                    Icons.Default.Favorite,
//                                    contentDescription = "Localized description"
//                                )
//                            }
//                        )
//                    }
//                }
//            }
//        ) {
//            Column(
//                modifier = Modifier.fillMaxSize().padding(16.dp).background(MaterialTheme.colors.surface),
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Row(
//                    Modifier.toggleable(
//                        value = skipHalfExpanded,
//                        role = Role.Checkbox,
//                        onValueChange = { checked -> skipHalfExpanded = checked }
//                    )
//                ) {
//                    Checkbox(checked = skipHalfExpanded, onCheckedChange = null)
//                    Spacer(Modifier.width(16.dp))
//                    Text("Skip Half Expanded State")
//                }
//                Spacer(Modifier.height(20.dp))
//                Button(onClick = { scope.launch { state.show() } }) {
//                    Text("Click to show sheet")
//                }
//            }
//        }
//    }
//}
