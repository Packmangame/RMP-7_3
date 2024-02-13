import java.awt.geom.Area

fun main() {
    try {
       var r= readLine()!!.toInt()
        var C= 2*Math.PI*r
        var Area=4*r*Math.sqrt(2.0)
        println("окружность=$C, пириметр=$Area")
    }catch (e:Exception){
        println("Error")
    }
}