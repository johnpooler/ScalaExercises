package day6.animals

class Main {

    val meat=new Meat
    val grass=new Grass
    val cow = new Cow
    val lion = new Lion

  cow.doIEatIt(grass)
  lion.doIEatIt((grass,meat, cow))

}
