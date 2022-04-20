package prototype

abstract class Shape() {
  abstract val x: Int
  abstract val y: Int
  abstract val color: String

  abstract fun clone(): Shape

  override fun equals(other: Any?): Boolean {
    if (other is Shape) {
      return x == other.x && y == other.y && color == other.color
    }

    return false
  }

  override fun toString(): String = "x: ${x}, y: ${y}, color: ${color}"
}