fun main(args: Array<String>) {
//Nullables
    var age: Int? = 28

    age = 45
    age  = null

    var newNumber = age!! //turning a nullable to none null

    if(age != null){
        age!!
    }
}