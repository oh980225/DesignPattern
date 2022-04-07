package factory_method

class SeaLogistics : Logistics() {
  override fun createTransport(): Transport = Ship()
}