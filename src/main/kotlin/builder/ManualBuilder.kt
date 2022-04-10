package builder

import java.time.LocalDate

class ManualBuilder : Builder {
  var seatCount: Int? = null
  var carType: CarType? = null
  var engine: Engine? = null
  var dateOfManufacture: LocalDate? = null

  override fun seatCount(count: Int) {
    this.seatCount = count
  }

  override fun carType(carType: CarType) {
    this.carType = carType
  }

  override fun engine(engine: Engine) {
    this.engine = engine
  }

  override fun dateOfManufacture(date: LocalDate) {
    this.dateOfManufacture = date
  }

  fun build() = Manual(seatCount, carType, engine, dateOfManufacture)
}