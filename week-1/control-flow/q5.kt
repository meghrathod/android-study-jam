fun main(){
	print("\nSide 1: ")
    val side1 = readLine()!!
    print("\nSide 2: ")
    val side2 = readLine()!!
    print("\nSide 3: ")
    val side3 = readLine()!!
    if (side1 == side2 && side2 == side3){
        println("Equilateral Triangle")
    }
    else if(side1 == side2 || side1 == side3 || side2 == side3){
        println("Isosceles Triangle")
    }
    else{
        println("Scalene Triangle")
    }
    
    
}
