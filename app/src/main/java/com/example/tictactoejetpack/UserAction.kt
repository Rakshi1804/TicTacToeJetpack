package com.example.tictactoejetpack

sealed class UserAction {
    /*object PlayAgainButtonCLicked: UserAction()
    data class BoardTapped(val cellNo: Int): UserAction()*/

    data class BoardTapped(val cellNo: Int) : UserAction()
    object PlayAgainButtonClicked : UserAction()
}
