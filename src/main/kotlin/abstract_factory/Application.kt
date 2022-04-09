package abstract_factory

class Application(factory: FurnitureFactory) {
  private val chair: Chair = factory.createChair()
  private val table: Table = factory.createTable()

  fun printMySet() {
    chair.print()
    table.print()
  }
}

fun main() {
  println("What type of furniture do you like?")
  println("1. Victorian")
  println("2. Modern")

  val factory: FurnitureFactory = when (readLine()) {
    "1" -> VictorianFactory()
    "2" -> ModernFactory()
    else -> {
      println("Error!")
      return
    }
  }

  val application = Application(factory)
  application.printMySet()
}