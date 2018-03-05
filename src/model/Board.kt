package model

import model.SideType.*

class Board {
    private val startTile = Tile(CITY, GRASS, ROAD, ROAD, false, false)
    private class Coordinate(val x: Int, val y: Int)
    private val board = mutableMapOf<Coordinate, Tile>()

    init {

    }

    fun makeMove(tile: Tile, x: Int, y: Int) {
        board[Coordinate(x,y)] = tile;
    }

    fun getBoardTile(x: Int, y: Int): Tile? {
        val coordinate = Coordinate(x, y)
        return board[coordinate]
    }
}

fun main(args: Array<String>) {
    val board = Board()
}
