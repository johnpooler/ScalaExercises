package day2.collections.exercises


import java.util.TimeZone

object TimeZoneIDs extends App {

  val Id_array = TimeZone.getAvailableIDs


  var count = 0
  while ( {count < Id_array.length})
  {
    println(Id_array(count))
    count += 1
  }
  println(count)



}
