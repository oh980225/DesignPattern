package abstract_factory

class ModernFactory : FurnitureFactory {
  override fun createChair() = ModernChair()

  override fun createTable() = ModernTable()
}