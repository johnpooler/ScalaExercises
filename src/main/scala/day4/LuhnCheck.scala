package day4

object LuhnCheck extends App {

  def checkLuhn(cardNumber: String): Boolean = {
    val nDigits = cardNumber.length
    var nSum = 0
    var isSecond = false

    for (i <- nDigits - 1 to 0 by -1) {
      var d = cardNumber.charAt(i) - '0'
      if (isSecond == true) d = d * 2
      // We add two digits to handle cases that make two digits after doubling
      nSum += d / 10
      nSum += d % 10
      isSecond = !isSecond
    }
    nSum % 10 == 0
  }

  println(checkLuhn("79927398713"))

  println(checkLuhn("1111111"))

  println(checkLuhn("11111111"))

  println(checkLuhn("1091"))


}
