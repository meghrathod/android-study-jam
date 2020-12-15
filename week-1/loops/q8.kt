fun main(){
    val num = 3
    val factorialSum = sumOfFactorial(num)
    println("Sum of Factorial of ${num} is ${factorialSum}" )
}

fun factorial(num: Int): Int{
    var product = 1
	for(x in 1..num){
        product *= x
    }
    return product

}

fun sumOfFactorial(num: Int): Int{
    var sum = 0
    for(y in 1..num){
        sum+=factorial(y)
    }
    return sum
}
