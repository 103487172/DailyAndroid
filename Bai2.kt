import kotlin.math.sqrt

fun main(){
    val a: Byte = 5
    val b: Byte = 9
    val s: Int = a*b
    println("dien tich hinh chu nhat la $s")

    val soPi: Double = 3.14
    val r: Double = 2.4
    val c: Double = 2*soPi*r
    println("chu vi hinh tron la $c")

    val x: Byte = 2
    val y: Double = sqrt((x*x +x*x).toDouble())
    println("canh huyen tam giac la $y ")
}
