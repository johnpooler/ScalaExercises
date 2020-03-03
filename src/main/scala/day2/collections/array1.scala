package day2.collections

object array1 extends App {

  val array1:Array[String]=Array("beer", "cider", "soft-drink")
//  for(tmp<-)

val arrayNums=Array[Int](1,2,3,4,5,6,7,8,9)
  val min=arrayNums.reduceLeft(_ min _)

println(s"the minimum number is: $min")
}
