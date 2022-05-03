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


    //Exercise 4
    var fib1 = 1
    var fib2 = 1
    while (fib2 < 100) {
        var temp = fib2
        fib2 += fib1
        print("$fib1 ")
        fib1 = temp
    }
}