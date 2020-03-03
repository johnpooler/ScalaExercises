package day1.basics

object Main extends App {



  println("hello world!")




  val example="how ya doin"
  var car="audi"
  car="ford"
  println(example + " " + car)




  def saySomething (name:String)=println("hello "+ name)

  saySomething("John")


//----------------------



  def aCar :String={
    "jdbvoi"
    6*5
    "jeff"


  }



  //optionals
//  val rareSteak:Option[String]=None
//  println(s"Rare steak tastes ${ rareSteak.get}")



    //for loops
  for(i<- 1 to 10 by 2) println(i)
  for(i<- 1 until 10 by 2) println("   "+ i)

//  for(i<- 1 to 5) yield i



}
