 ---                                                                                                                                                                                                                            
  # ImageUrlCoil                                                                                                                                                                                                                 
                                                                                                                                                                                                                                 
  Tutorial de como carregar imagens a partir de uma URL utilizando a biblioteca **Coil** em um projeto Android com **Jetpack Compose**.                                                                                          
                  
  ## Sobre

  Este projeto demonstra de forma simples e prática como integrar o [Coil](https://coil-kt.github.io/coil/) para carregar imagens remotas via URL em uma aplicação Android moderna.

  ## Tecnologias utilizadas

  - Kotlin
  - Jetpack Compose
  - Coil 3 (`coil-compose` + `coil-network-okhttp`)

  ## Dependências

  Adicione ao seu `build.gradle.kts`:

  ```kotlin
  implementation("io.coil-kt.coil3:coil-compose:3.3.0")
  implementation("io.coil-kt.coil3:coil-network-okhttp:3.3.0")

  Requisitos

  - Android minSdk 26+
  - Kotlin 2.2.0
  - Android Gradle Plugin 8.13.2
