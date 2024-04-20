fun main() {
//    println("Hello World!")

    var name: String = "Jemutai"
    name = "joan"
    println("I am  $name")


//Boolean data type
    var isHappy: Boolean = false
    println(isHappy)


    //Logical operators


    val isStudying: Boolean = true
    val isWatching: Boolean = false

    println(isWatching && isStudying)

    if (isStudying == isWatching) {
        println("She is  watching and studying")


    } else
        println("She is doing none ")

    //comparison operators

    var password: String = "Jemutais"
    var cPassword: String = "Jemutai"
    if (password == cPassword) {
        println("Dear  $password,welcome  to kotlin")

    } else {
        println("$password and $cPassword should match in order to login")
    }

    //Arrays  and Lists

    val cars = arrayOf<String>("Vits", "Filder", "Demio", "V8")

    println(cars.contentToString())   //prints  the list of array
    println(cars[2])   //prints car in index 2

    println(cars.size)   //prints the size of the array


    //difference between arrays and list is that list is expandable

    val models: List<String> = listOf(
        "Demio",
        "v8",
        "premio"
    )

    println(models)
    println(models.size)
    println(models.contains("Demio"))
    println(models[3])

    //use mutableListOf in order to add more items to the list


    //How to loop through list

    for (model in models) {
        println(model)
    }
    // functions
    fun first() {

        println("This is  a function called  first,and here is where we put our logic")

    }
    // Unit  corresponds  to void in java ,it's a retiurn ttoe with a null return value

    fun greet(): Unit {

        println("This is  a function called  greet,and it returns a null value")

    }
    //functions with parameters...paremeters reffer to the variables for example name,age...while arguments refer to the actual values
    // for example jemutai,sato,34...

    val names: String = "Sato Jemutai"
    fun sayHi(names: String) {
        println("Good morning ,$names")
    }

    // classes  and objects
    //class is  a blueprint of an object


    data class Engineers(
        //properties.variables. val or var
        var name: String = "",
        var skills: String = "fff"
    )
    //behaviours...functions or methods

    fun drive(){

    }

    val Justoo = Engineers()  // this is how to create an instance of a class

    Justoo.name = ""
    Justoo.skills = ""


}