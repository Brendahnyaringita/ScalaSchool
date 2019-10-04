import java.util.Calendar
object Controls extends App {

    val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
                  "Scottish Terrier", "Great Dane", "Portuguese Water Dog")
    for {
        breed <- dogBreeds
    
        upcasedBreed = breed.toUpperCase()
        
    //using filters to have specific output
        // if (breed.contains("Terrier"))
        // if (!breed.startsWith("Yorkshire"))
        //println(breed)
    }
    println(upcasedBreed)
for (i <- 1 to 10) println(i)

 //These shows use of match expression using case classes   
val firstArg = if (!args.isEmpty) args(0) else ""
val friend =
    firstArg match {
        case "salt" => "pepper"
        case "chips" => "salsa"
        case "eggs" => "bacon"
        case _ => "huh?"
    }
println(friend)

        def isFridayThirteen(cal: Calendar): Boolean = {
            val dayofWeek = cal.get(Calendar.DAY_OF_WEEK)
            val dayofMonth = cal.get(Calendar.DAY_OF_MONTH)

            (dayofWeek == Calendar.MONDAY) && (dayofMonth == 31)
        }
    while (!isFridayThirteen(Calendar.getInstance())) {
        println("Not today!")
        Thread.sleep(500)
    }


}
