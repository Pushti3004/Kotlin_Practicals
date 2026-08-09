// Parent Class
open class Person(
    val firstName: String,
    val lastName: String,
    var age: Int
) {
    // Parent Secondary Constructor
    constructor(firstName: String, lastName: String) : this(firstName, lastName, 19)

    open fun displayInfo() {
        print("Name: $firstName $lastName | Age: $age")
    }
}

// Child Class inheriting from Person
class Student(
    firstName: String,
    lastName: String,
    age: Int,
    val enrollmentNo: String,
    val branch: String,
    val className: String,
    val labBatch: String
) : Person(firstName, lastName, age) { // Calls Parent Primary Constructor

    // Child Secondary Constructor
    constructor(firstName: String, lastName: String, enrollmentNo: String, branch: String) : this(
        firstName, lastName, 20, enrollmentNo, branch, "Default-Class", "A"
    )

    override fun displayInfo() {
        super.displayInfo() // Prints Person details
        println(" | Enrollment No: $enrollmentNo | Branch: $branch | Class: $className | Lab Batch: $labBatch")
    }
}

fun main() {
    // Creating an ArrayList of 5 Student objects
    val studentList = ArrayList<Student>()

    // Populating using the Primary Constructor (4 students)
    studentList.add(Student("Pushti", "Gandhi", 20, "026", "Computer Engineering", "I", "I2"))
    studentList.add(Student("Riddhi", "Prajapati", 19, "156", "Information Technology", "A", "A1"))
    studentList.add(Student("Khyati", "Patel", 21, "095", "Machine Learning", "B", "B1"))
    studentList.add(Student("Kavya", "Raval", 19, "169", "Computer Science and Engineering", "C", "C1"))

    // for value of age=19, className=Default-Class and labBatch=Batch-A
    studentList.add(Student("Pankti", "Joshi", "030", "Psychology"))

    println("================ Student List Data ================")
    for (student in studentList) {
        student.displayInfo()
    }
}
