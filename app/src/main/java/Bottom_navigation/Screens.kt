package Bottom_navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.example.contacts.ui.theme.Jock



@Composable
fun Screens1() {
Jock()
}



@Composable
fun Screens2() {
    Text(modifier = Modifier
        .fillMaxSize()
        .wrapContentHeight(),
        text = "Screen 2",
        textAlign = TextAlign.Center
    )
}
@Composable
fun Screens3() {
    Text(modifier = Modifier
        .fillMaxSize()
        .wrapContentHeight(),
        text = "Screen 3",
        textAlign = TextAlign.Center
    )
}
