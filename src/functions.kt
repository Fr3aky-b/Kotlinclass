fun main(){
    //Standard-Library Functions/Predefined Functions

    var output=Math.sqrt(5.0)
    println("The squareroot of 5.0 is $output")


    var roundedvalue=Math.round(34.56)
    println(roundedvalue)

    name()
    add()
    emplolyee("Francis",30000,false)
    student("Viviana",22,"Data Science ")

}
//User-defined Functions

fun name(){
    println("Glory")


}
fun add(){
    var x=20
    var y=30
    println(x+y )
}
//Parameter and Arguments
fun emplolyee(name:String,salary:Int,disability:Boolean){
    println("$name is earning $salary.Disability $disability ")

}

fun student(name: String, age:Int ,course:String){
    println("$name is $age years old.$name is studying $course")
}

