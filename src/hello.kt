fun main(args: Array<String>) {
// functions

    fun hello(){
        println("Hello World")
    }

    hello()

    fun hi(): String{
        return "Hi World!"
    }

    println(hi())


    fun hey(name: String): String{
        return "Hey $name"
    }

    println(hey("Biggie"))


    fun hlo(name: String = "Kiss"): String{
        return "$name my a**"
    }

    println(hlo())



    fun addNumbers(num1: Int, num2: Int, num3: Int): Int{
        return num1 + num2 + num3
    }

    fun addNums(num1:Int, num2:Int, num3:Int) = num1 + num2 + num3

    fun dog(name: String, age: Int){
        println("$name is $age years old")
    }

}