package factory_method

class Ship : Transport {
  override fun deliver() {
    println("Go Go Ship!")
  }
}