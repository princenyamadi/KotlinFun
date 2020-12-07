fun main(args: Array<String>) {
// For Loops

    for(x in 1..10){
        println(x)
    }

    var favCandy = listOf("Snickers", "100 grand bar", "Fun Dip")

    for( i in favCandy){
        println(i)
    }

//    Loop through the number 1 to 200 and print out all odd numbers
    for(i in 0..200){
        if( i % 2 == 1){
            println(i)
        }
    }


}