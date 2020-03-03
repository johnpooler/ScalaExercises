package day2.collections

object arrayBuffer extends App {

  val arrayBuffer1 = scala.collection.mutable.ArrayBuffer.empty[Int]

  arrayBuffer1+=1
  arrayBuffer1+=33
  arrayBuffer1.toArray
  println(arrayBuffer1)
}
