package prototype

fun main() {
  val tester = Tester()

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

  tester.compareClone(shapeList)
}