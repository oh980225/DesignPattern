package prototype

class Rectangle() : Shape() {
  var width: Int? = null
  var height: Int? = null

  constructor(target: Rectangle) : this() {
    x = target.x
    y = target.y
    color = target.color
    width = target.width
    height = target.height
  }


  override fun clone(): Shape = Rectangle(this)

  override fun equals(other: Any?): Boolean {
    if (other is Rectangle) {
      return super.equals(other) && (width == other.width && height == other.height)
    }

    return false
  }

  override fun toString(): String = super.toString() + " ,width: ${width}, height: ${height}"
}