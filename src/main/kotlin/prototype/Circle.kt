package prototype

class Circle(
  override val x: Int,
  override val y: Int,
  override val color: String,
  val radius: Int
) : Shape() {
  override fun clone(): Shape = Circle(x, y, color, radius)

  override fun equals(other: Any?): Boolean {
    if (other is Circle) {
      return super.equals(other) && (radius == other.radius)
    }

    return false
  }

  override fun toString(): String = super.toString() + " ,radius : ${radius}"
}