package factory_method

abstract class Logistics {
  fun planDelivery() {
    val transport = createTransport()
    println("---Start Delivery---")
    transport.deliver()
    println("---End Delivery---")
  }

  abstract fun createTransport(): Transport
}