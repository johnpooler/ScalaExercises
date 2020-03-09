package day2.collections.basics

object PatternMatching extends App {

  def whatTimeIsIt(time:Any):String=time match {


    case x => s"$x is no time"
  }




case class Time (hours:Int, minutes:Int)
  def whatTimeIsIt2(time:Any):String=time match {

    case Time(12,0) => s"its high noon"

    case Time(12, minutes) => s"its $minutes past noon"

    case _ =>s"$time is no time"

  }

//  val beerType="lager"
//  beerType match{
//
//    case "Ale" =>println("dark brown")
//    case_ => "some other colour"
//  }





}
