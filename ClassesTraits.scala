//package io.atlabs.gator.core
//package Untitled

class Brenda(age: Int) {
  //final val skinCor: String = "WHITE" // this shows it cannot be overridden
  val skinCor: String = "WHITE"
  def printMyAge: Unit = {
    println(age)
  }
}

// Companion object to class Brenda
// One benefits is that itb helps you to define how you want to create a new Brenda
object Brenda {
  val house: String = "Kilimani"
  def apply(): Brenda                           = new Brenda(30)
  def apply(age: Int): Brenda                   = new Brenda(age)
  def apply(age: Int, skinCorT: String): Brenda = new Brenda(age) {
    override val skinCor: String = skinCorT
  }
}

// Singleton object an entry point bcos of it extends App
// one of the use case for singleton is for utilites
object Testing extends App {

  // creating an instance of Brenda from the class Brenda directly
  val brenda1 = new Brenda(23)
  val brenda2 = new Brenda(12)

  // creating an instance of Brenda from the companion object of class Brenda
  // apply automaticatily applies
  val applyBrenda: Brenda = Brenda(24)
  val applyBrenda2: Brenda = Brenda(24)
  val applyBrenda4: Brenda = Brenda(24, "BLACK") // this b
  val applyBrenda5: Brenda = Brenda()
  val applyBrenda3: Brenda = Brenda.apply(24)
  println(applyBrenda.skinCor)
  println(applyBrenda2.skinCor)
  println(applyBrenda4.skinCor)
  println(applyBrenda5.skinCor)
  println(applyBrenda3.skinCor)

  println(Brenda.house)

  println(Utilities.addStuff(2, 3))
  println(Utilities.divideStuff(4, 2))
}

// singleton Utilities
object Utilities {
  // (Int, Int) => Int
  def addStuff(x: Int, y: Int): Int = x + y
  // (Int, Int) => Int
  def divideStuff(a: Int, b: Int): Int = a/b
}


class Go {
  val typeOfFruit: String = ""
  def giveMe: Unit = {}
}




// trait, abstract class, class, object

abstract class People(name: String) {
  val Age: String

  def Go: Unit
}

// super class Inheritance
trait Fruit {
  val typeOfFruit: String
  // () =>  Unit
  def giveMe: Unit
}

class Mango extends Fruit  {
  override val typeOfFruit: String = "Mango"
  override def giveMe: Unit = {}
}

class Orange extends Fruit {
  override val typeOfFruit: String = "Orange"
  override def giveMe: Unit = {}
}

class Apple extends Fruit {
  override val typeOfFruit: String = "Apple"
  override def giveMe: Unit = {}
}

object TestingT extends App {

  // Fruit => Unit
  def DoIt(fruit: Fruit) = {
    println(fruit.typeOfFruit)
  }

  // String => Unit
  def GoThere(str: String) = {
    println(str)
  }

  val mango1: Mango = new Mango
  val mango2: Mango = new Mango
  val apple: Apple  = new Apple

  DoIt(mango1)
  DoIt(apple)

}