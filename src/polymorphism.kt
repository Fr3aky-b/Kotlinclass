
open class Shape{
    open fun Draw(){
        println("Drawing a shape")

    }


}

class Rhombus:Shape(){
    override fun Draw(){
        println("Drawing a rhombus")

    }
}
class parallelogram:Shape(){
    override fun Draw(){
        println("Drawing a Parallelogram")

    }
}

fun main(){
    var s=Shape()
    s.Draw()
    var r=Rhombus()
    r.Draw()
    var p= parallelogram()
    p.Draw()
}


