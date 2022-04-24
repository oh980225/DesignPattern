package adapter

class RoundHole(val radius: Double) {
  fun fits(peg: RoundPeg) = radius >= peg.radius
}