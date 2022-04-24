package adapter

import kotlin.math.pow
import kotlin.math.sqrt

class SquarePegAdapter(val peg: SquarePeg) : RoundPeg(sqrt((peg.width / 2).pow(2.0) * 2))