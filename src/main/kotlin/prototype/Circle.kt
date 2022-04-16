package prototype

class Circle() : Shape() {
  var radius: Int? = null

  constructor(target: Circle) : this() {
    x = target.x
    y = target.y
    color = target.color
    radius = target.radius
  }

  override fun clone(): Shape = Circle(this)

  override fun equals(other: Any?): Boolean {
    if (other is Circle) {
      return super.equals(other) && (radius == other.radius)
    }

    return false
  }

  override fun toString(): String = super.toString() + " ,radius : ${radius}"
}