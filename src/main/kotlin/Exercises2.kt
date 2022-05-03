fun main(){
    //Exercise 1
    var n = 100
    var sum = 0;
    for (i in 1..n) {
        sum += i
    }

    println("Sum of all numbers from 1 to $n is $sum")

    //Exercise 2
    var m = 10
    var factorial = 1
    for (i in m downTo 1) {
        factorial *= i
    }

    println("Factorial of $m is $factorial")

    //Exercise 3
    for (i in 1..10) {
        println("10 * $i = ${i*10}")
    }

    //Exercise 4
    var fib1 = 1
    var fib2 = 1
    while (fib1 < 100) {
        var temp = fib2
        fib2 += fib1
        print("$fib1 ")
        fib1 = temp
    }

    //Exercise 5
    val numArry: IntArray = intArrayOf(1,2,3,6,4,2,0)
    for (num in numArry) {
        println(num)
    }

    //Exercise 6
    val numArry2: DoubleArray = doubleArrayOf(23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5)
    var max = Double.MIN_VALUE;
    for (num in numArry2) {
        if (num > max) {
            max = num;
        }
    }
    println("Max value is $max")

    //Exercise 7
    val numArry3: DoubleArray = doubleArrayOf(45.3, 67.5, -45.6, 20.34, 33.0, 45.6)
    var sum2 = 0.0
    for (num in numArry3) {
        sum2 += num
    }
    println("Average value of array is ${sum2/numArry3.size}")

    //Exercise 8
    for (i in 0..255) {
        println("Ascii value of $i is ${i.toChar()}")
    }



}