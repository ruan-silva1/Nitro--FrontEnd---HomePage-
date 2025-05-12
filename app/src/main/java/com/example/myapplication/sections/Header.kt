import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.R

@Composable
fun Header(modifier: Modifier = Modifier) {
    Row{
        FotoPerfil(74, R.drawable.foto_perfil)
        TextoHeader()
    }
}

@Preview
@Composable
private fun HeaderPreview() {
    Header()
}