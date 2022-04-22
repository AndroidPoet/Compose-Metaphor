
package com.androidpoet.composemetaphord

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.androidpoet.composemetaphor.Metaphor
import com.androidpoet.composemetaphor.MetaphorEasing
import com.androidpoet.composemetaphor.MetaphorEnterAnimation
import com.androidpoet.composemetaphor.MetaphorExitAnimation
import com.androidpoet.composemetaphord.ui.theme.ComposeMetaPhorDTheme

class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      setContent {
        ComposeMetaPhorDTheme {
          AnimateVisibility(
            MetaphorEnterAnimation.SlideInHorizontally,
            MetaphorExitAnimation.ElevationScale,
            MetaphorEasing.FastOutSlowInEasing
          )
        }
      }
    }
  }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Greeting(name: String) {
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  ComposeMetaPhorDTheme {
    Greeting("Android")
  }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AnimateVisibility(
  metaphorEnterAnimation: MetaphorEnterAnimation,
  metaphorExitAnimation: MetaphorExitAnimation,
  metaphorEasing: MetaphorEasing
) {
  var visible by remember {
    mutableStateOf(true)
  }
  Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Metaphor(
      visible = visible,
      enter = metaphorEnterAnimation,
      exit = metaphorExitAnimation,
      easing = metaphorEasing,
      enterDuration = 500,
      exitDuration = 100,
      delay = 0,
      content = {

        FloatingActionButton(
          modifier = Modifier.padding(24.dp),
          onClick = {
          }
        ) {
          Icon(imageVector = Icons.Default.Add, "")
        }
      }
    )
  }

  Column(
    modifier = Modifier
      .fillMaxSize()
      .padding(0.dp, 0.dp),
    verticalArrangement = Arrangement.Bottom,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Button(

      onClick = { visible = !visible }
    ) {
      Text("Animate")
    }
  }
}
