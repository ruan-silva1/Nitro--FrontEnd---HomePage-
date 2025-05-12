import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BotoesFiltro(modifier: Modifier = Modifier,text:String) {
    Text(
        text = text,
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Center,
        modifier = modifier
            .background(Color(0xFFC3DFFD)) // Cor de fundo azul claro
            //.padding(horizontal = 6.dp, vertical = 11.dp) // Adiciona preenchimento ao redor do texto
            .width(113.dp)
            .height(45.dp)
            .clip(RoundedCornerShape(25.dp))
            .wrapContentHeight(Alignment.CenterVertically)
    )
}

@Preview(showBackground = true)
@Composable
private fun BotoesFiltroPreview() {
    BotoesFiltro(text = "proximo")
}
