package gq.reactive.moneymap

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Surface
import androidx.compose.material.Text

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MoneymapTheme {
        Surface {
          Text("Android")
        }
      }
    }
  }
}

