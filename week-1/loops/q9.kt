fun main(){
    var num = 17
    var sum = 0
    if (num%2 == 1){
        num -= 1
    }
    for (i in 0..num step 2){
        sum += i
    }
    println("Your sum is ${sum}")
}
