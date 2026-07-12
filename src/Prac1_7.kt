fun factorial(n: Int): Int {
    if (n == 0 || n == 1)
        return 1
    else
        return n * factorial(n - 1)
}

fun main() {
    print("Enter Number:")
    val num = readln().toInt()
    println("Factorial of $num = "+factorial(num))
}