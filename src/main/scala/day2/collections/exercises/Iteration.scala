package day2.collections.exercises

object Iteration extends App {


  def iter1(A: String, B: Int): Unit = {
    var pompei: String = A
    var num: Int = B

    for (i <- 1 to num) println(pompei)


  }

  def iter2(input: String, numero: Int): Any = {


    for(i<-1 to numero){

      for(j<-1 to numero){
        print(input)
      }
      println()

    }

  }

  def iter2recursive(input:String, number:Integer):Unit={

  if (number==0) {}
  else
    (println(input,number-1)


  }

  iter1("hi", 6)
  iter2("poncho", 3)
  iter2recursive("H", 5)

}














