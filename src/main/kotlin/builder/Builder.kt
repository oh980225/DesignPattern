package builder

import java.time.LocalDate

interface Builder {
  fun seatCount(count: Int)
  fun carType(carType: CarType)
  fun engine(engine: Engine)
  fun dateOfManufacture(date: LocalDate)
}