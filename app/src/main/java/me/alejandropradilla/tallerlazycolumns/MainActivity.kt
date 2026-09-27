package me.alejandropradilla.tallerlazycolumns
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import me.alejandropradilla.tallerlazycolumns.ui.screens.FeedScreen
import me.alejandropradilla.tallerlazycolumns.ui.theme.TallerLazyColumnsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TallerLazyColumnsTheme {
                FeedScreen()
            }
        }
    }
}
