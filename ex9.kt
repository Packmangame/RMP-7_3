import kotlin.math.pow

fun main() {
    try {
        var a = readLine()!!.toDouble()
        var b = readLine()!!.toDouble()
        var Square= a*b
        var Pirim= 2*a-2*b
        var diag= Math.sqrt(a.pow(2)+b.pow(2))
        println("Площадь=$Square\n,Пириметр=$Pirim\n,Диагональ=${String.format("%.3f",diag)}")

    }catch (e:Exception) {
        println("Error")
    }
}