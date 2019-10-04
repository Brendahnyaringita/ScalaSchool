//showing polymorphism
object Polymorphism extends App {
    class example {
        //first function with the same name
        def funct(a: Int) : Unit = {
            println("First execution: " + a)

        }
        //Second function#
        def funct(a: Int, b: Int) : Unit = {
            val sum = a + b
            println("Second execution: " + sum)

        }
        //Third function
        def funct(a: Int, b: Int, c: Int) : Unit = {
            val mult = a * b * c
            println("Third execution: " + mult)
        }
    }
    //creating main object
    object Main
    {
        //create main method
        def main(args: Array[String]) : Unit = {
            //create new object of class example
        var obj = new example()
        // obj.funct(22)
        // obj.funct(22, 33)
        // obj.funct(22, 33, 44)
        }
        
    }
}