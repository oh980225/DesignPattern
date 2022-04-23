package abstract_factory

class VictorianFactory : FurnitureFactory {
  override fun createChair() = VictorianChair()

  override fun createTable() = VictorianTable()
}