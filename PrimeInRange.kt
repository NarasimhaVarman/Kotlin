fun main(args: Array<String>) {
    var start: Int = 1
    var end : Int = 20
    var flag: Int = 0
    for(i in start..end){
        for(j in 1..i){
            if(i%j==0){
                flag++
            }
        }
        if(flag==2){
            println("$i is a prime number")
        }
    }
}