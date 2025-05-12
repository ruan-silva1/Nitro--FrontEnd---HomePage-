import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TituloContainer(leftText:String,rightText:String) {
    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()){
        Text(
            text = leftText, fontSize = 24.sp, color = Color.White
        )
        Text(
            text = rightText, fontSize = 20.sp, color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TituloContainerPreview() {
    TituloContainer("talvez você conheça","ver mais")
}