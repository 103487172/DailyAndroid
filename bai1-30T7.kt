fun main(){
    val length: Int = readLine()!!.toInt()
    val width: Int = readLine()!!.toInt()
    val area: Int = length*width
    val perimeter: Int = (length + width)*2
    println("Enter length: $length")
    println("Enter width: $width")
    println("The area of the rectangle is $area")
    println("The perimeter of the rectangle is $perimeter")

}
