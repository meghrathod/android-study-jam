fun main(){
    val num = 8
    var factorial = 1
	for(x in 1..num){
        factorial *= x
    }
    println("Factorial of ${num} is ${factorial}" )
}
