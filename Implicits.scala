// import scala.runtime.RichString
import scala.language.implicitConversions

// // val fs = new FancyString("scala")
// // println(fs.capitalize.reverse)

// //package io.atlabs.gator.core
// //package test
// object ImplicitTest extends App {
//   def DoIt(n: String, m: Int) = {
//     println(s"n is $n and m is $m")
//   }
// //To show it's being replaced directly
//   DoIt("Ejiro", 409)
  
//   //------------------------------------------------------------------
//   // function currying- means splitting parameters in a function 
//   //to accomodate more into bits. 
//   def DoItt(n: String)(m: Int) = {
//     //val mmm = "mmmm"
//     println(s"n is $n and m is $m")
//   }
//   DoItt("Precious")(50)

// //----------------------------------------------------------------------
//   def DoTo(n: String)(implicit m: Int) = {
//     println(s"n is $n and m is $m")
//   }
//   DoTo("Brenda")(23)
//   implicit val age: Int = 23
  
//   DoTo("Brenda")
// }

//------------------------------------------------------------------------
object Scope extends App{
  // three types 
  class A(val n: Int) {
    def isInA = println("Yes i am in A")
  }
  class B(val m: Int, val n: Int) {
    def isInB = println("Yes i am in B")
    def total = m + n
    
  }
  class C(val m: Int, val n: Int, val o: Int) {
    def isInC = println("Yes, I am in C")
    val total = m + n + o
  }

  object T1 { // to make it easy to test on REPL
    // implicit converter
    implicit def toA(n: Int): A = new A(n)
    implicit def aToB(a: A): B = new B(a.n, a.n)
    implicit def bToC(b: B): C = new C(b.m, b.n, b.o)
    // create a new A object

    // def total = m + n + o
    val a: A = new A(34)
    a.isInA
    a.isInB
    
    val n: Int = 34
    val m: String = "Ejiro"
    implicit def intToString(n: Int) = n.toString
    
    m.toLowerCase.reverse
    n.toLowerCase.reverse
    // works
    
    
  }
        
     println(new B(5, 5).total)
     println(new C(5, 5, 10).total)
}