package singleton

class Singleton private constructor() {
  val value = "helloMan"

  companion object {
    private var instance: Singleton? = null
    fun getInstance() = instance ?: Singleton().also { instance = it }
  }
}