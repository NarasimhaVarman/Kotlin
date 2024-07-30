fun main(){
    println(getMax(4,6,54))
}
fun getMax(a: Int,b: Int,c: Int): Int{
    if(a>b){
        if(a>c){
            return a;
        }
        else{
            return c;
        }
    }
    else if(b>c){
        return b
    }
    else{
        return c;
    }
}