package day3.oop

object cmon extends App {


  class BeerConstructor(val beerName: String, var quantity: Double) {

    //constructor
    def this(beerName: String) = this(beerName, 0)

    def showInfo(): Unit = quantity match {
      case 0 => println(s"The beer is $beerName")
      case _ => println(s"A $beerName costs $quantity dollars")
    }
  }

  val quidsberg = new BeerConstructor("QUIDSBERG", 1.99)
  quidsberg.showInfo()
  val phoenixois=new BeerConstructor("PHOENIXOIS")
  phoenixois.showInfo()

}



