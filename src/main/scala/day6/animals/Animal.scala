package day6.animals

abstract class Animal {

  type SuitableFood
  def doIEatIt(food: SuitableFood)
}


class Grass {
  override def toString: String = "I eat Grass"
}

class Meat {override def toString: String = "I eat Meat"}


class Cow extends Animal {
  type SuitableFood = Grass
  override def doIEatIt(food: Grass): Unit = println(food.toString)
  override def toString: String = "Cow"
}


class Lion extends Animal {
  type SuitableFood = (Grass, Meat, Cow)
  override def doIEatIt(food: (Grass, Meat, Cow)): Unit =     food.productIterator.foreach(item => println(item))}


