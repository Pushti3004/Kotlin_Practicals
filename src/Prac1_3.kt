fun main(){
    println("Student Enrollment No.:")
    val no: Long= readlnOrNull()?.toLongOrNull()?:0L    // For long to take null value
    println("Student Name:")
    val name: String=readln()                   // readln is a modern func and cant take null value and through exception.
    println("Age:")
    val age: Int= readln().toInt()
    println("Student Branch:")
    val branch: String=readLine()!!                // it is old method of take input or read the lines
    println("Student Class:")                      // !! refers that the var 100% cant be null, it will crash the system.
    val classname: String?= readlnOrNull()         // ? refers that string can hold nullable value also.
    println("Student Batch:")
    val batch: String=readln()
    println("Collage Name:")
    val collage: String=readln()
    println("University Name:")
    val university: String=readln()
    println(" ")
    println("Student's Data:")
    println("Enrollment No.:"+no)
    println("Name:"+name)
    println("Age:"+age)
    println("Branch:"+branch)
    println("Class:"+classname)
    println("Batch:"+batch)
    println("Collage Name:"+collage)
    println("University Name:"+university)


    //var s_name: String? = "23"
    //s_name = "23"
    //val kal :Int= s_name!!.toInt()
    //println(kal)
}