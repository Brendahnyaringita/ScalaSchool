//Abstract class

//Abstract class with argument.
abstract class myauthor (name: String, 
                        topic: String) 
{
    //abstarct method
    // val name: String = "AT"
    // val tutorial: String = "SCala"
    
    def portal: Unit
}
//Create a class that extends abstract class
class Books(name: String, topic: String) extends myauthor(name, topic) 
{
    def portal: Unit =
    {
        println("Portal name: " + name)
        println("Author: Crazy Guy")
        println("Topic:  " + topic)
    }

    // def tutdetails: Unit = 
    // {
    //     println("Tutorial name: " + tutorial)
    // }
}
// object Main 
// {
//     //Main method
//     def main(args: Array[String]) : Unit =
//     {
//         val library = new Books("bbb", "ggg")
//         library.portal
//     }
// }