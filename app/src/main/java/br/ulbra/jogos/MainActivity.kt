package br.ulbra.jogos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.ulbra.jogos.ui.AppNavHost
import br.ulbra.jogos.ui.theme.JogosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JogosTheme {
                AppNavHost()
            }
        }
    }
}
