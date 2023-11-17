package com.example.android5github

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android5github.ui.theme.Android5GitHubTheme

@Composable
fun FirstScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {

    }
}

@Preview
@Composable
fun PreviewFirstScreen() {
    Android5GitHubTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            FirstScreen()
        }
    }
}