package prototype

fun main() {
  val tester = Tester()

  val shapeList = mutableListOf<Shape>()

  val circle = Circle(10, 20, "red", 15)
  shapeList.add(circle)

  val rectangle = Rectangle(10, 20, "blue", 15, 20)
  shapeList.add(rectangle)

  tester.compareClone(shapeList)
}