fun main(){
    var j: Int = 5
    var i: Int = 1
    for(i in 1..5){
        while(j >= i){
            print("* ")
            j--
        }
        j=5
        println()
    }
}