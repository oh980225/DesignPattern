package builder

import java.time.LocalDate

class Director {
  fun makeSportsCar(builder: Builder) {
    builder.seatCount(2)
    builder.carType(CarType.SPORTS_CAR)
    builder.engine(Engine(3.0, 0.0))
    builder.dateOfManufacture(LocalDate.of(1998, 2, 25))
  }

  fun makeSUV(builder: Builder) {
    builder.seatCount(4)
    builder.carType(CarType.SUV)
    builder.engine(Engine(2.5, 0.0))
    builder.dateOfManufacture(LocalDate.of(1998, 2, 25))
  }
}