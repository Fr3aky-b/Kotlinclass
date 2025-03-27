open class Animals{ //Parent Class/Base class/Super class
    var age=12
    var gender="Male"

    fun makeSound(){

        println("Animal is speaking")
    }

}

//Child class/Derived class/Sub class
class Dog:Animals(){
    fun bark(){

        println("Dog is woofing")
    }

}
class Cat:Animals(){
    fun meow(){
        println("Cat is meowing")
    }
}

fun main(){
    var a=Animals()


    var d=Dog()
    d.makeSound()

    var c=Cat()

}
