package model

data class Tile(var north: SideType,
                var south: SideType,
                var west: SideType,
                var east: SideType,
                val shield: Boolean,
                val cloister: Boolean)