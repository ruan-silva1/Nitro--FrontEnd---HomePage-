import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.R

@Composable
fun Logo(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.nitro_logo_bgt),
        contentDescription = "Nitro Logo",
        modifier = Modifier
    )
}

@Preview
@Composable
private fun LogoPreview() {
    Logo()
}
