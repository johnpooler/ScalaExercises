package day6

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.language.postfixOps


object futures extends App {

  def sleep (time:Long): Unit= Thread.sleep(time)

  val function= Future {
    sleep(5000)
    4534 + 565
  }


  val result= Await.result(function, 10 seconds)
  println(result)
  sleep(15000)
}


