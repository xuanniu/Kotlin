import java.util.*

fun main() {
    println("Hello World")
    var numbers = arrayOf(1,122,3,2344,15,6)
    var nameArray = arrayOf("don", "john", "bob", "betty")
    for (name in nameArray) {
        println("$name")
    }

    for (i in nameArray.indices) {
        println(nameArray[i])
    }

    for ((index, value2) in nameArray.withIndex()) {
        println("my index is $index and the corresponding value is $value2")
    }
    for(num in numbers) {
        if (num % 2 == 0) {
            println("even")
        } else {
            println("odd")
        }
    }

    var myArray = arrayOf(1,3,7,2,60,23)
    var b = 7
    for ((index,value) in myArray.withIndex()) {
        println("my index is $index and the corresponding value is $value")
        if (b == value) {
            println("b is in the array at index $index")
        }
    }

    val num = Scanner(System.`in`)
    print("Enter Integer:")
    var myNum = num.nextInt()
    var sum = 0
    for (index in 1 .. myNum) {
        sum += index
    }
    print("$sum")

    //Exercise 1
    var n = 100
    sum = 0;
    for (i in 1..n) {

    }


}
