// Scala program to illustrate how to  
// create traits 
  
// Trait 
object Traits extends App { 
trait MyTrait 
{ 
    def pet : Unit 
    def pet_color : Unit
} 
  
// MyClass inherits trait 
class MyClass extends MyTrait 
{ 
      
    // Implementation of methods of MyTrait 
    def pet() : Unit =  
    { 
        println("Pet: Dog") 
    } 
      
    def pet_color() : Unit =   
    { 
        println("Pet_color: White") 
    } 
      
    // Class method 
    def pet_name() : Unit =  
    { 
        println("Pet_name: Dollar") 
    } 
}  
  
object Main  
{ 
      
    // Main method 
    def main(args: Array[String]): Unit = 
    { 
        val obj = new MyClass(); 
        obj.pet(); 
        obj.pet_color(); 
        obj.pet_name(); 
    } 
}
} 