package prototype

class ShapeComparator {
  fun execute(shape1: Shape, shape2: Shape) {
    println("shape1: ${shape1}")
    println("shape2: ${shape2}")
    println("equality: ${shape1 == shape2}")
    println("identity: ${shape1 === shape2}")
  }
}

fun main() {
  val comparator = ShapeComparator()

  val shapeList = mutableListOf<Shape>()
  val circle = Circle()
  circle.x = 10
  circle.y = 20
  circle.radius = 15
  circle.color = "red"
  shapeList.add(circle)

  val rectangle = Rectangle()
  rectangle.x = 10
  rectangle.y = 20
  rectangle.width = 15
  rectangle.height = 20
  rectangle.color = "blue"
  shapeList.add(rectangle)

  shapeList.forEach { shape -> comparator.execute(shape, shape.clone()) }
}