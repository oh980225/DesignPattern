package abstract_factory

interface FurnitureFactory {
  fun createChair(): Chair
  fun createTable(): Table
}