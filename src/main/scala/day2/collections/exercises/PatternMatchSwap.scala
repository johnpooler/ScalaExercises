package day2.collections.exercises

object PatternMatchSwap extends App {

  def swappy[A,B](a: A, b: B): (B, A) = (b, a)

  println(swappy(1,333))
  println(swappy("tree", "bush"))



//
//  def swap(arr: Array[Int]) = arr.splitAt(2) match {
//
//      case (Array(x, y), z) => Array(y, x) ++ z
//      case _ => arr
//
//
//    }





}
