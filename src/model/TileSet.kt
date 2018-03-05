package model

import model.SideType.*

class TileSet {

    private val tiles = mutableListOf<Tile>()

    init {
        fillTileSet()
    }

    private fun fillTileSet() {
        // All city
        tiles.add(Tile(CITY, CITY, CITY, CITY, true, false))
        // Crossroad
        tiles.add(Tile(ROAD, ROAD, ROAD, ROAD, false, false))
        // City with grass in south
        tiles.add(Tile(CITY, GRASS, CITY, CITY, false, false))
        tiles.add(Tile(CITY, GRASS, CITY, CITY, false, false))
        tiles.add(Tile(CITY, GRASS, CITY, CITY, false, false))
        tiles.add(Tile(CITY, GRASS, CITY, CITY, true, false))
        // City with road in south
        tiles.add(Tile(CITY, ROAD, CITY, CITY, false, false))
        tiles.add(Tile(CITY, ROAD, CITY, CITY, true, false))
        tiles.add(Tile(CITY, ROAD, CITY, CITY, true, false))
        // T-crossing
        tiles.add(Tile(GRASS, ROAD, ROAD, ROAD, false, false))
        tiles.add(Tile(GRASS, ROAD, ROAD, ROAD, false, false))
        tiles.add(Tile(GRASS, ROAD, ROAD, ROAD, false, false))
        tiles.add(Tile(GRASS, ROAD, ROAD, ROAD, false, false))
        // City west to east
        tiles.add(Tile(GRASS, GRASS, CITY, CITY, false, false))
        tiles.add(Tile(GRASS, GRASS, CITY, CITY, true, false))
        tiles.add(Tile(GRASS, GRASS, CITY, CITY, true, false))
        // Straight road
        tiles.add(Tile(ROAD, ROAD, GRASS, GRASS, false, false))
        tiles.add(Tile(ROAD, ROAD, GRASS, GRASS, false, false))
        tiles.add(Tile(ROAD, ROAD, GRASS, GRASS, false, false))
        tiles.add(Tile(ROAD, ROAD, GRASS, GRASS, false, false))
        tiles.add(Tile(ROAD, ROAD, GRASS, GRASS, false, false))
        tiles.add(Tile(ROAD, ROAD, GRASS, GRASS, false, false))
        tiles.add(Tile(ROAD, ROAD, GRASS, GRASS, false, false))
        tiles.add(Tile(ROAD, ROAD, GRASS, GRASS, false, false))
        // Corner city with grass
        tiles.add(Tile(CITY, GRASS, CITY, GRASS, false, false))
        tiles.add(Tile(CITY, GRASS, CITY, GRASS, false, false))
        tiles.add(Tile(CITY, GRASS, CITY, GRASS, false, false))
        tiles.add(Tile(CITY, GRASS, CITY, GRASS, true, false))
        tiles.add(Tile(CITY, GRASS, CITY, GRASS, true, false))
        // Corner city with road
        tiles.add(Tile(CITY, ROAD, CITY, ROAD, false, false))
        tiles.add(Tile(CITY, ROAD, CITY, ROAD, false, false))
        tiles.add(Tile(CITY, ROAD, CITY, ROAD, false, false))
        tiles.add(Tile(CITY, ROAD, CITY, ROAD, true, false))
        tiles.add(Tile(CITY, ROAD, CITY, ROAD, true, false))
        // Corner road
        tiles.add(Tile(GRASS, ROAD, ROAD, GRASS, false, false))
        tiles.add(Tile(GRASS, ROAD, ROAD, GRASS, false, false))
        tiles.add(Tile(GRASS, ROAD, ROAD, GRASS, false, false))
        tiles.add(Tile(GRASS, ROAD, ROAD, GRASS, false, false))
        tiles.add(Tile(GRASS, ROAD, ROAD, GRASS, false, false))
        tiles.add(Tile(GRASS, ROAD, ROAD, GRASS, false, false))
        tiles.add(Tile(GRASS, ROAD, ROAD, GRASS, false, false))
        tiles.add(Tile(GRASS, ROAD, ROAD, GRASS, false, false))
        tiles.add(Tile(GRASS, ROAD, ROAD, GRASS, false, false))
        // 2 Separate city parts
        tiles.add(Tile(CITY, GRASS, GRASS, CITY, false, false))
        tiles.add(Tile(CITY, GRASS, GRASS, CITY, false, false))
        tiles.add(Tile(GRASS, GRASS, CITY, CITY, false, false))
    }

    fun remove(tile: Tile): Boolean {
        return tiles.remove(tile)
    }

    fun getTile(index: Int): Tile {
        return tiles[index]
    }

    fun size(): Int {
        return tiles.size
    }

    fun isEmpty(): Boolean {
        return tiles.isEmpty()
    }
}