package day3.oop

class abstraction {

}


abstract class Animal { //abstract method
  def sound(): Unit
}

//Dog class extends Animal class
object Dog {
  def main(args: Array[String]): Unit = {
    val obj = new Dog
    obj.sound()
  }
}

class Dog extends Animal {
  override def sound(): Unit = {
    System.out.println("Woof")
  }
}