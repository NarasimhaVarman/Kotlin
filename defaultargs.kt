fun main(){
    println(add(5))
    println(add(5.5f))
    println(add(5.5))
    println(add(5,5))
    println(add(5.5,5.5))
    println(add(5.5f,5.5f))
}
fun add(a: Int=0, b: Int=0): Int{
    println("Integer")
    return a+b
}
fun add(a: Float=0f, b: Float=0f): Float{
    println("Float")
    return a+b
}
fun add(a: Double=0.0, b:Double=0.0): Double{
    println("Double")
    return a+b
}