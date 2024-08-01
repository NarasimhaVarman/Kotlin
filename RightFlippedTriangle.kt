fun main(){
    var j: Int = 5
    var i: Int = 1
    for(i in 1..5){
        while(j >= i){
            print(" ")
            j--
        }
        for (k in 1..i) {
            print("*")
        }
        j=5
        println()
    }
}