class Car(
    var carName: String,                                  // declaring a class
    var model: Int,
    var owner: String,
    var milesDrive: Int,
    var originalPrice: Double) {

    init {
        println("Object of class is created and Init is called.")      // declaring a constructor
    }
    val currentPrice = originalPrice - (milesDrive * 10)

    fun display() {
        println("------------")                                   // declaring a function
        println("Car Information: $carName, $model")
        println("Car Owner: $owner")
        println("Miles Drive: $milesDrive")
        println("Original Car Price: $originalPrice")
        println("Current Car Price: ${currentPrice}")
        println("------------")
    }
}

fun main() {

    // Add an object
    println("Creating Car Class Object car1 in next line")
    val car1 = Car("BMW", 2018, "Aman", 105,100000.0)
    car1.display()

    println("Creating Car Class Object car2 in next line")
    val car2 = Car("BMW", 2019, "Karan", 20, 400000.0)
    car2.display()

    println(" ")
    println("******** ArrayList of Car ********")
    val car3 = ArrayList<Car>()
    car3.add(Car("Toyota", 2017, "KJS", 100, 1080000.0))
    car3.add(Car("Maruti", 2020, "NPP", 200, 4000000.0))

    for (car in car3) {
        car.display()
    }
}

//class Car(var model : String, var){
//    init {
//        println("init")
//    }
//    var price : Double= 0.0
//    constructor(m: String, p: Double) : this(m) {
//        price = p
//    }
//}
//class Suzuki(m:String): Car(m){}
//
//
//fun main(){
//    var c = Car("BMW")
//    println(c.model)
//}

