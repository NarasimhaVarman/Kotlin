fun main() {
    println(sum(1,2,3,4,5,6,7,8,9,10))
}
fun sum(vararg numbers: Int): Int{
    var result=0;
    for (i in numbers){
        result += i
    }
    return result
}