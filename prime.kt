fun main(args: Array<String>) {
    var num:Int=6
    var flag:Int=0
    for (i in 1..num){
        if(num%i==0){
            flag++
        }
    }
    if(flag==2){
        println("Yes, $num is a prime number")
    }
    else{
        println("No, $num is not a prime number")
    }
}