package singleton

fun main() {
  val singleton1 = Singleton.getInstance()
  val singleton2 = Singleton.getInstance()

  println("singleton1 value : ${singleton1.value}")
  println("singleton1 value : ${singleton2.value}")
  println("identity: ${singleton1 === singleton2}")
}