fun factorial0(n: Int): Int {
    if (n == 0 || n == 1)
        return 1
    else
        return n * factorial0(n - 1)
}
tailrec fun factorial1(n: Int, result: Long = 1): Long {
    return if (n == 0 || n == 1)
        result
    else
        factorial1(n - 1, result * n)
}

fun main() {
    print("Enter Number:")
    val num = readln().toInt()
    println("Factorial of $num = "+factorial0(num))
    println("By TailRec Keyword, Factorial of $num = "+factorial1(num))

}