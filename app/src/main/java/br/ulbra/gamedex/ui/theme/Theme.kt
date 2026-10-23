package br.ulbra.gamedex.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = TealPrimaryDark,
    onPrimary = Color.Black,
    primaryContainer = TealPrimaryContainerDark,
    onPrimaryContainer = Color(0xFFA7FFEB),
    secondary = IndigoSecondaryDark,
    onSecondary = Color.Black,
    tertiary = AmberGoldDark,
    onTertiary = Color.Black,
    background = BackgroundDark,
    onBackground = Color(0xFFE2E2E2),
    surface = SurfaceDark,
    onSurface = Color(0xFFE2E2E2),
    surfaceVariant = SurfaceVariantDark,
    onSurfaceVariant = Color(0xFFCAC4D0)
)

private val LightColorScheme = lightColorScheme(
    primary = TealPrimary,
    onPrimary = Color.White,
    primaryContainer = TealPrimaryContainer,
    onPrimaryContainer = Color(0xFF003830),
    secondary = IndigoSecondary,
    onSecondary = Color.White,
    tertiary = AmberGold,
    onTertiary = Color.White,
    background = BackgroundLight,
    onBackground = Color(0xFF191C1E),
    surface = SurfaceLight,
    onSurface = Color(0xFF191C1E),
    surfaceVariant = SurfaceVariantLight,
    onSurfaceVariant = Color(0xFF49454F)
)

@Composable
fun GameDexTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Set dynamicColor to false by default to ensure custom group colors are visible
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
