package builder

fun main() {
  println("which car is better?")
  println("1. SportsCar")
  println("2. SUV")

  val carBuilder = CarBuilder()
  val manualBuilder = ManualBuilder()
  val director = Director()

  when (readLine()) {
    "1" -> {
      director.makeSportsCar(carBuilder)
      director.makeSportsCar(manualBuilder)
    }
    "2" -> {
      director.makeSUV(carBuilder)
      director.makeSUV(manualBuilder)
    }
    else -> {
      println("Error!")
      return
    }
  }

  println("My Car is ${carBuilder.build()}")
  println("This Manual is ${manualBuilder.build()}")
}