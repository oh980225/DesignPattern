package prototype

class Tester {
  fun compareClone(shapeList: List<Shape>) {
    shapeList.forEach {
      val clone = it.clone()
      println("shape1: ${it}")
      println("shape2: ${clone}")
      println("equality: ${it == clone}")
      println("identity: ${it === clone}")
    }
  }
}