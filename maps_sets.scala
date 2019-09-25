//to create a set:
import scala.collection.mutable.Set
var jetSet = Set("Boeing", "Airbus") //define a new var

//initialize with an immutable set with 2 strings

//to add  to a set, use +
jetSet += "Lear"    
println(jetSet)

//to have a mutable set use import
//import scala.collection.mutable.Set

//MAPS
import scala.collection.mutable.Map 
//initialize it with an empty mutable Map
//that has integer keys and/or string values.
val cities = Map[String, String]()
    cities += ("Nairobi" -> "Kenya")
    cities += ("Lagos" -> "Nigeria")
    cities += ("Harare" -> "Zimbabwe")

println(cities("Lagos"))

import scala.io.Source
if (args.length > 0) {
    for (line <- Source.fromFile(args(0)).getLines)
    print(line.length +" "+ line)
}
else
    Console.err.println("Please enter filename")