import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.io.StdIn._



object BrokenKeyboard extends App {

  println(readUserInput())

  def readUserInput(): Unit = {
  println("Please input how many keyboards do you have")

  for(keys <- readKeyboards()){
    betterCheckWord(keys.toArray)
  }
}

  def readKeyboards(): ArrayBuffer[String] = {
  val keyboards = ArrayBuffer[String]()
  for(i <- 0 until readInt()){
    println("Please type keys available")
    keyboards.append(readLine())
  }
  keyboards
}
  def betterCheckWord(keysAvailable: Array[Char]) = {
  var listOfWords = Source.fromURL("http://norvig.com/ngrams/enable1.txt").getLines.toList
  ('a' to 'z')
    .toArray
    .diff(keysAvailable)
    .foreach(
      key => listOfWords = listOfWords.filter(!_.contains(key))
    )
  listOfWords.maxBy(_.length)
}}