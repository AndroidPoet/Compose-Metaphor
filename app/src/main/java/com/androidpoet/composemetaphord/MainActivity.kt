/*
 * Copyright 2022 AndroidPoet (Ranbir Singh)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


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
fun AnimateVisibility() {
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
      enter = MetaphorEnterAnimation.SlideInHorizontally,
      exit = MetaphorExitAnimation.FadeOut,
      easing = MetaphorEasing.FastOutLinearInEasing,
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


}
