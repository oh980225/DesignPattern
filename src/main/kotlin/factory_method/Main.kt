package factory_method


fun main() {
  println("What mode of transport would you like to use?")
  println("1. Truck")
  println("2. Ship")

  val logistics: Logistics = when(readLine()) {
    "1" -> RoadLogistics()
    "2" -> SeaLogistics()
    else -> {
      println("Error!")
      return
    }
  }

  logistics.planDelivery()
}