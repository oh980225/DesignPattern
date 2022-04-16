package prototype

abstract class Shape {
  var x: Int? = null
  var y: Int? = null
  var color: String? = null

  abstract fun clone(): Shape

  override fun equals(other: Any?): Boolean {
    if (other is Shape) {
      return x == other.x && y == other.y && color == other.color
    }

    return false
  }

  override fun toString(): String = "x: ${x}, y: ${y}, color: ${color}"
}