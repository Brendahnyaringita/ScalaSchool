//package io.atlabs.gator.core
//package
// A closure is a function, whose return value depends
// on the value of one or more variables declared outside this function.
object ClosureExample  extends App {
  val x: String = "Ejiro"
  // function value
  val y: Int => Int = (n: Int) => n * n
  // function
  def yy(n: Int) = n * n
  println(y(3))
  // function value
  // f(x) = x + 2x
  //f("Ejiro")
  class Foo {
    def exec(s: String) = println(s)
    // exec applies f on the name parameter
    def exec(f: ((String) => Unit), name: String) = {
      f(name)
    }
  }
  /// function values
  val f: String => Unit = (s: String) => println(s.toUpperCase)
  val p: String => Unit = (s: String) => println(s.toLowerCase)
  val foo = new Foo
  foo.exec(f, "Ejiro")
  foo.exec(p, "Ejiro")
  // String => Unit
  def sayHello(name: String) = { println(s"Hello, $name") }
  foo.exec(sayHello, "Brenda")
}