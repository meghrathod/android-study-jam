/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    val num1 = 0
    val num2 = 12
    val num3 = -14
    if (num1>num2 && num1>num3){
        println("Number 1 is greatest.")
    }
    else if (num2>num1 && num2>num3){
        println("Number 2 is negative.")
    }
    else if (num3>num1 && num3>num3){
        println("Number 3 is negative.")
    }
    else if (num1==num2 && num1>num3){
        println("Number 1 and 2 is greatest.")
    }
    else if (num3==num2 && num1<num3){
        println("Number 2 and 3 is greatest.")
    }
    else{
        println("Number 1 and 3 is greatest.")
    }
}
