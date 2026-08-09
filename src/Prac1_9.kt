fun main() {
    val a= IntArray(5)
    println("Enter the numbers:")

    for (i in a.indices) {
        print("a[$i] = ")
        a[i]= readln().toInt()
    }
    var max = a[0]

    for (i in a) {
        if (i > max) {
            max = i
        }
    }
    println("Largest element = $max")
}