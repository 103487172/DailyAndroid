fun main(){
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val t = a + b
    val h = a - b
    val max = (Math.abs(t) + Math.abs(h))/2
    val min = t - max
    println("So lon nhat trong 2 so la $max")
    println("So be nhat trong 2 so la $min ")

}
