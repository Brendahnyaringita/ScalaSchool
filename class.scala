// class Calculator {
//     private var sum = 0
//     def add (b: Byte): Unit = {
//         sum += b
//     }
//     def checksum(): Int = {
//         return ~(sum & 0xFF) + 1
//     }

// }
//val math = new Calculator

object Classes extends App {
//Example showing Rational with a private field and method
class Rational(n: Int, d: Int) {
    require(d != 0)
    val numer: Int = n
    val denom: Int = d
    def this(n:Int) = this(n, 1)
    def add(that: Rational): Rational = 
        new Rational(
            numer * that.denom + that.numer * denom,
            denom * that.denom
        )
    // def * (that: Rational): Rational = 
    //     new Rational(numer * that.numer, denom * that.denom)
    override def toString = numer + "/" +denom
//purpose of the private “helper method”
//gcd is to factor out code needed by some other part of the class, in this case,
//the primary constructor.
    private def gcd(a:Int, b:Int): Int = 
     if (b == 0) a else gcd(b, a % b)


}
val x = new Rational(23, 66)
println(x)
}