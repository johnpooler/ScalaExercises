package day2.lists

object list1 extends App {

  val list:List[String]=List(
    "corona",
    "stella artois",
    "guiness"
  )


  println(list(0))
  println(list.head)
  println(list.last)
  println(list.tail)


  val emptyList=List.empty


}
