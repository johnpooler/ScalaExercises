package day4

object LuhnCheck {

  def checkDigits(cardNumber: String): Unit= {
    val nDigits = cardNumber.length
    var nSum = 0
    var isSecond = false

    for (i <- (nDigits - 1) to 0 by -1) {
      var d = cardNumber.charAt(i) - '0'
      if (isSecond == true) d = d * 2
      // We add two digits to handle cases that make two digits after doubling
      nSum += d / 10
      nSum += d % 10
      isSecond = !isSecond
    }
    if(nSum % 10 == 0) println("valid cardnumber")
    else println("invalid cardnumber")

  }


 def main(args: Array[String] ): Unit = {

   checkDigits("79927398713")
   checkDigits("1111111")
   checkDigits("11111111")
   checkDigits("1040")
   checkDigits("49927398716")
   checkDigits("4998716")

  }
}

