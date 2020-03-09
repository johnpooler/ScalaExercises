package day1.basics

object addAndMultiply extends App{

def calculation(A:Int, B:Int,C:Int):Int= {
val nums=List(A,B,C).sorted
  (nums.head+nums(1))*nums(2)


}
  println(calculation(5,5,2))
}











