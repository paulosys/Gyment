package com.gps.gyment.data.models

data class Exercise(
    val id: Int,                  // Identificador único para o exercício
    val name: String,             // Nome do exercício
    val repetitions: Int,        // Número de repetições (opcional)
    val sets: Int,               // Número de séries (opcional)
    var imageUrl: String,         // ID do recurso da imagem associada ao exercício (opcional)
    val description: String?      // Descrição do exercício (opcional)
)