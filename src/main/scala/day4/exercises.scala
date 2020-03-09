package day4


object exercises extends App {

  println(16.toHexString)
  println("bar".take(2))
  println((0 until 10).contains(10))



  def square(x: Double) = x * x
  println(square(15))

  def area(radius: Double): Double = 3.14159 * square(radius)
  println(  area(10))

  def sumOfSquares(x: Double, y: Double) = square(x) + square(y)
  println(sumOfSquares(2,3))



  println(!false == true)




  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)


  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def isGoodEnough(guess: Double, x: Double) =
  (guess * guess - x) < 0.001
  def sqrt(x: Double) = sqrtIter(1.0, x)

}
