fun main(){
    val nam_sinh = readLine()!!.toInt()
    println("Nam sinh: $nam_sinh")
    val tuoi_nam_2021 = 2021 - nam_sinh
    println("Tuoi cho toi nam 2021 la $tuoi_nam_2021 tuoi")
    val graduate_year = 24 - tuoi_nam_2021
    println("So nam nua tot nghiep dai hoc la $graduate_year year")
}
