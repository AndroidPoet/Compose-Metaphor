
<h1 align="center"Compose Metaphor</h1>


<p align="center">
  <a href="https://devlibrary.withgoogle.com/authors/androidpoet"><img alt="Google" src="https://user-images.githubusercontent.com/13647384/162663007-d911f6ce-ac1b-4754-a63b-eadbef38087f.svg"/></a>
<br>
	<br>
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
  <a href="https://github.com/AndroidPoet"><img alt="Profile" src="https://user-images.githubusercontent.com/13647384/162662962-82e3c1eb-baf8-4e21-ad26-d4c4e3c31e44.svg"/></a>

</p> <br>


<p align="center">
	<img src="https://user-images.githubusercontent.com/13647384/164615319-997dd7a4-560c-40b2-bd4d-fbcc631957e3.png" width="30%" height="30%" />

</p> <br>

<p align="center">

<p align="center">
Material Motion system animations for Jetpack Compose
</p>



## Who's using Compose Metaphor?
**👉 [Check out who's using Compose Metaphor](/usecases.md)**

## Include in your project
[![Maven Central](https://img.shields.io/maven-central/v/io.github.androidpoet/composemetaphor.svg?label=Maven%20Central)](https://search.maven.org/artifact/io.github.androidpoet/composemetaphor)

### Gradle
Add the dependency below to your **module**'s `build.gradle` file:

```gradle
dependencies {
    implementation("io.github.androidpoet:composemetaphor:1.0.0")
}
```


```kotlin
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
```







## Enter Animations

```kotlin
 MetaphorEnterAnimation.SharedAxisXForward
 MetaphorEnterAnimation.SharedAxisYForward
 MetaphorEnterAnimation.SharedAxisZForward
 MetaphorEnterAnimation.ElevationScale
 MetaphorEnterAnimation.SlideIn
 MetaphorEnterAnimation.SlideInHorizontally
 MetaphorEnterAnimation.SlideInVertically
 MetaphorEnterAnimation.ScaleIn
 MetaphorEnterAnimation.ExpandIn
 MetaphorEnterAnimation.ExpandHorizontally
 MetaphorEnterAnimation.ExpandVertically
```



## Exit Animations

```kotlin
 MetaphorEnterAnimation.FadeOut
 MetaphorEnterAnimation.SharedAxisXBackward
 MetaphorEnterAnimation.SharedAxisYBackward
 MetaphorEnterAnimation.SharedAxisZBackward
 MetaphorEnterAnimation.ElevationScale
 MetaphorEnterAnimation.SlideOut
 MetaphorEnterAnimation.SlideOutHorizontally
 MetaphorEnterAnimation.SlideOutVertically
 MetaphorEnterAnimation.ScaleOut
 MetaphorEnterAnimation.ShrinkOut
 MetaphorEnterAnimation.ShrinkHorizontally
 MetaphorEnterAnimation.ShrinkVertically
```



<a href="https://www.flaticon.com/free-icons/3d-modeling" title="3d modeling icons">3d modeling icons created by Good Ware - Flaticon</a>


## Find this library useful? :heart:
Support it by joining __[stargazers](https://github.com/androidpoet/Compose-Metaphor/stargazers)__ for this repository. :star:

# License
```xml
Copyright 2022 AndroidPoet (Ranbir Singh)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```





