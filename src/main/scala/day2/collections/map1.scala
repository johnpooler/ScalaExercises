package day2.collections

object map1 extends App {

  val map = Map (1-> "a", 2->"b",3 ->"c")

  map(1)
  map.get(1)
  map.getOrElse(9,"no value found ")

  map.keys
  map.keySet
  map.values

//  map filterKeys((key=>key>1))

  val mapMutable= scala.collection.mutable.Map(1-> "north", 2->"south",3 ->"west", 4->"east")

  mapMutable remove 3
//  mapMutable.

  val listy=List("hello", "and", "welcome")

  println(listy map(_.toList))


}
