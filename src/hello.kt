fun main(args: Array<String>) {
// Classes
    class Dog(var name: String, var age: Int){



}

    var myDawg = Dog("Dogie",8)
    myDawg.name
    myDawg.age

    class Cat{
        var name: String
        var age: Int
//
//        init {
//            name = ""
//            age=0
//
//        }
        constructor(name:String, age: Int){
        this.age =age
        this.name = name
}

        fun catInfo(){
            println("$name is $age years")

        }


    }
}