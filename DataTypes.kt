fun main(){
       var minnumber : Int = Int.MIN_VALUE //32 Bits (4 bytes)
       var maxnumber : Int = Int.MAX_VALUE 
       var minbyte : Byte = Byte.MIN_VALUE //8 bits (1 byte)
       var maxbyte : Byte = Byte.MAX_VALUE
       var minshort : Short = Short.MIN_VALUE //16 bits (2 bytes)
       var maxshort : Short = Short.MAX_VALUE
       var minlong : Long = Long.MIN_VALUE //64 bits (8 bytes)
       var maxlong : Long = Long.MAX_VALUE
       var minfloat = Float.MIN_VALUE//32 bits (4 Bytes)
       var maxfloat = Float.MAX_VALUE
       var mindouble = Double.MIN_VALUE//64 bits (8 bytes)
       var maxdouble = Double.MAX_VALUE
       var minchar = Char.MIN_VALUE
       var maxchar = Char.MAX_VALUE
       println("minshort :$minshort")
       println("maxshort :$maxshort")
       println("minbyte :$minbyte")
       println("maxbyte :$maxbyte")
       println("minnumber: $minnumber")
       println("maxnumber :$maxnumber")
       println("minlong :$minlong")
       println("maxlong :$maxlong")
       println("minfloat :$minfloat")
       println("maxfloat :$maxfloat")
       println("mindouble :$mindouble")
       println("maxdouble :$maxdouble")
       println("minchar: $minchar") // \u0000 (Hangul Filler)
       println("maxchar: $maxchar") // ? (65535) 2 bytes (16 bits)
}
