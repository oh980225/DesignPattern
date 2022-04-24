package adapter

fun main() {
  val hole = RoundHole(5.0)
  val roundPeg = RoundPeg(5.0)

  if (hole.fits(roundPeg)) {
    println("Round peg fits round hole.")
  }

  val smallSquarePeg = SquarePeg(2.0)
  val largeSquarePeg = SquarePeg(20.0)

  val smallSquarePegAdapter = SquarePegAdapter(smallSquarePeg)
  val largeSquarePegAdapter = SquarePegAdapter(largeSquarePeg)
  if (hole.fits(smallSquarePegAdapter)) {
    println("Small square peg fits round hole.")
  }

  if (!hole.fits(largeSquarePegAdapter)) {
    println("Big square peg does not fit into round hole.")
  }
}