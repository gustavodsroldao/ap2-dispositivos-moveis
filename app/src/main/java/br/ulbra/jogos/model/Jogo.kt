package br.ulbra.jogos.model

data class Jogo(
    val id: Int,
    val titulo: String,
    val genero: String,
    val ano: Int,
    val nota: Double,
    val imagemUrl: String,
    val descricao: String
)
