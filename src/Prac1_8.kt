fun main(){
    val arr1 = arrayOf(10,90,60,80,100)
    println("Create Array-1 by using arrayOf() method: ")
    println(arr1.contentToString())

    val arr2 = Array<Int>(5){0}
    println("Create Array-2 by using Array<>(): ")
    println(arr2.contentToString())

    val arr3 = Array(8){i -> i}
    println("Create Array-3 by using Array<>() and lamda function:")
    println(arr3.contentToString())

    val arr4 = IntArray(5){0}
    println("Create Array-4 by using IntArray():")
    println(arr4.joinToString())

    val arr5 = intArrayOf(12,10,1,5,18,19)
    println("Create Array-5 by using IntArrayOf():")
    println(arr5.joinToString())

    val arr6 = arrayOf(
        intArrayOf(1,3),
        intArrayOf(4,5),
        intArrayOf(6,7)
    )
    println("Create 2D Array-6 by using arrayOf() and intArrayOf():")
    println(arr6.contentDeepToString())
}