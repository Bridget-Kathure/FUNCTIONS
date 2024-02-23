fun main(){
    name( "Bridget")
    modulus(6,7)
    sum(7,8,5,4)
    fact("Reading,Cooking")
}

fun name(word:String){

    println( "Hello $word")
}
fun modulus(num1:Int, num2:Int):Int{
    var remainder = num1 % num2
    println(remainder)
    return remainder
}
fun sum(num1:Int, num2:Int, num3:Int, num4:Int):Int{
    var results= num1+num2+num3+num4
    println(results)
    return results
}
fun fact(Interestingfact:String){
    println(Interestingfact)

}