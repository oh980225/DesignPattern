package prototype

class Rectangle(
  override val x: Int,
  override val y: Int,
  override val color: String,
  val width: Int,
  val height: Int
) : Shape() {
  override fun clone(): Shape = Rectangle(x, y, color, width, height)

  override fun equals(other: Any?): Boolean {
    if (other is Rectangle) {
      return super.equals(other) && (width == other.width && height == other.height)
    }

    return false
  }

  override fun toString(): String = super.toString() + " ,width: ${width}, height: ${height}"
}