package controller

import java.util.Random

import model.Board
import model.Tile
import model.TileSet

class Game {

    private val board = Board()
    private val tileSet = TileSet()

    fun makeMove(tile: Tile, x: Int, y: Int) {
        if (checkMove(tile, x, y)) {
            board.makeMove(tile, x, y)
        } else {
            // Throw error
        }
    }

    fun turnTile(tile: Tile): Tile {
        val north = tile.north
        val south = tile.south
        val west = tile.west
        val east = tile.east
        tile.north = west
        tile.east = north
        tile.south = east
        tile.west = south
        return tile
    }

    private fun checkMove(tile: Tile, x: Int, y: Int): Boolean {
        val north = tile.north
        val south = tile.south
        val west = tile.west
        val east = tile.east
        val northTile = board.getBoardTile(x, y+1)
        val southTile = board.getBoardTile(x, y-1)
        val westTile = board.getBoardTile(x-1, y)
        val eastTile = board.getBoardTile(x+1, y)
        if (northTile != null && northTile.south != north) {
            return false
        }
        if (southTile != null && southTile.north != south) {
            return false
        }
        if (westTile != null && westTile.east != west) {
            return false
        }
        if (eastTile != null && eastTile.west != east) {
            return false
        }
        return true
    }

    fun getTile(): Tile? {
        val randomTile: Tile?
        if (tileSet.isEmpty()) {
            randomTile = tileSet.getTile(rand(tileSet.size()))
            tileSet.remove(randomTile)
        } else {
            randomTile = null
        }
        return randomTile
    }

    private fun rand(to: Int): Int {
        val random = Random()
        return random.nextInt(to)
    }
}