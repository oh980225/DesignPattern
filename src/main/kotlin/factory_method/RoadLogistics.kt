package factory_method

class RoadLogistics : Logistics() {
  override fun createTransport(): Transport = Truck()
}