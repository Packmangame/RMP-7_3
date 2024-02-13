fun main() {
    try {
        var k= readLine()!!.toInt()
        var n= readLine()!!.toInt()
        var m= readLine()!!.toInt()
        var l= readLine()!!.toInt()
       when {
           n % k == 0&&l % k == 0&&m %  k == 0->println("общий делитель")
           else->println("не общий делитель")
       }
    }catch (e:Exception){
        println("Error")
    }
}