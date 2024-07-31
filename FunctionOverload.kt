fun main(){
    println(add(5,5))
    println(add(5.5,5.5))
    println(add(5.5f,5.5f))
}
fun add(a: Int, b: Int): Int{
    println("Integer")
    return a+b
}
fun add(a: Float, b: Float): Float{
    println("Float")
    return a+b
}
fun add(a: Double, b:Double): Double{
    println("Double")
    return a+b
}