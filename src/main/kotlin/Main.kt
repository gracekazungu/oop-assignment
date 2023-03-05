fun main(){
 var Grace=Human("Grace",20,40)
    Grace.eat(10)
Grace.speak("I enjoy learning Kotlin")
    Grace.birthday(1)
var Becky=User("Becky","Simiyu","sbeckysimiyu@gmail.com","0746404458","simiyu2002")
    println(Becky.firstName)
    println(Becky.email)
    println(Becky.phoneNumber)
}




//1. Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//Create an instance of this human class and invoke all its functions
class Human(var name:String,var age:Int,var Weight:Int){
    //- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten.
fun eat(foodWeight:Int){
    var add=foodWeight+Weight
    println("I am eating $add kgs of food")
}
    //- speak(speech: String) :Prints the string passed to it
    fun speak(speech:String){
        println(speech)
    }
    //- birthday( ) :Increments the human’s age by 1
    fun birthday(birtday:Int){
        var birthday=age++
        println(age)
    }

}
//2. Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
 data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){
 }
