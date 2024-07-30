fun main(){
    var a: Int = 1
    var b: Int = 2
    var c: Int = 3
    if(a>b){
        if(a>c){
            println("a : $a is greatest")
        }
        else{ //a<c
            println("c : $c is greatest")
        }
    }
    else if(b>c){
        println("b : $b is greatest")
    }
    else if (b<c){
        println("c : $c is greatest")
    }
    else{
        println("$a = $b = $c")
    }
}