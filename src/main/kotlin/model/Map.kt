package model

class Map(val items: List<Item>) {
    fun getPositionValue(position: Position): Type {
        return items.find { it.position == position }?.type ?: throw Exception("해당 좌표에 값이 없습니다.")
    }

    override fun toString(): String {
        return items.sortedWith(compareBy({ it.position.y }, { it.position.x })).groupBy { it.position.y }.values.joinToString("\n") { it.joinToString(" ") }
    }
}