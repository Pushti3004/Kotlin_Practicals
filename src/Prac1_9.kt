fun main() {
    val arr = ArrayList<Int>()

    println("Enter 5 numbers:")

    for (i in 0 until 5) {
        print("a[$i] = ")
        arr.add(readln().toInt())
    }
    var max = arr[0]

    for (i in arr) {
        if (i > max) {
            max = i
        }
    }

    println("Largest element = "+max)
}