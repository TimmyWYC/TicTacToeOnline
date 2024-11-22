package com.example.tictactoeonline.DataClass

data class Player(
    val playerId: String = "",
    var name: String = "",
    var invitation: String = "",
)


data class Game(
    val gameId: String = "",
    var count: Int = 0,
    var player1: String = "",
    var player2: String = ""

)