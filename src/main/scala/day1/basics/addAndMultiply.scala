package day1.basics

object addAndMultiply extends App{

def calculation(A:Int, B:Int,C:Int):Int= {
var nums=List(A,B,C).sorted
  (nums(0)+nums(1))*nums(2)


}
  println(calculation(5,6,7))
}











