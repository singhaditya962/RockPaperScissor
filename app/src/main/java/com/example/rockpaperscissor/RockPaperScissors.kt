package com.example.rockpaperscissor

fun main(){
    var computerChoice = ""
    var playerChoice = ""
    println("Rock Paper or Scissors? Enter your Choice!")
    playerChoice = readln()

    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> {
            computerChoice="Rock"
        }
        2 -> {
            computerChoice="Paper"
        }
        3 -> {
            computerChoice="Scissors"
        }
    }
    println(computerChoice)
    val winner = when {
        (playerChoice == computerChoice) -> "Tie"
        playerChoice=="Rock"&& computerChoice =="Scissors"-> "Player"
        playerChoice=="Paper"&& computerChoice == "Rock"->"Player"
        playerChoice=="Scissor"&& computerChoice == "Paper"-> "Player"
        else -> "Computer"
    }
    println("THE WINNER IS :$winner")
}