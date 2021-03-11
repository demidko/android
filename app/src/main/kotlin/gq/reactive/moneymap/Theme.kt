package gq.reactive.moneymap.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable


@Composable
fun MoneymapTheme(content: @Composable() () -> Unit) {
  val colors = darkColors(
    primary = RelizzBlack,
    primaryVariant = RelizzBlack,
    secondary = RelizzBlack,
    background = RelizzBlack
  )

  MaterialTheme(
    colors = colors,
    typography = Typography,
    shapes = Shapes,
    content = content
  )
}