import kotlin.math.pow

fun main() {
    try {
        var Ph=7.9
        var Mmas=56
        var x=10.0
        var Na=6.02*x.pow(23)
        var V= Mmas/Ph*Na
        println({String.format("%.3f",V)})
    }catch (e:Exception)
    {
        println("Error")
    }
}