class Car1(
    var carName: String,
    var model: Int,
    var owner: String,
    var milesDrive: Int,
    var originalPrice: Double) {

    init {
        println("Object of class is created and Init is called.")
    }
    val currentPrice = originalPrice - (milesDrive * 10)

    fun display1() {
        println("------------")
        println("Car Information: $carName, $model")
        println("Car Owner: $owner")
        println("Miles Drive: $milesDrive")
        println("Original Car Price: $originalPrice")
        println("Current Car Price: ${currentPrice}")
        println("------------")
    }
}
class Car2(
    var carName: String,
    var model: Int,
    var owner: String,
    var milesDrive: Int,
    var originalPrice: Double)
{
    init {
        println("Object of class is created and Init is called.")
    }
    val currentPrice = originalPrice - (milesDrive * 10)


    fun display2() {
        println("------------")
        println("Car Information: $carName, $model")
        println("Car Owner: $owner")
        println("Miles Drive: $milesDrive")
        println("Original Car Price: $originalPrice")
        println("Current Car Price: ${currentPrice}")
        println("------------")
    }
}
class Car3(
    var carName: String,
    var model: Int,
    var owner: String,
    var milesDrive: Int,
    var originalPrice: Double)
{
    init {
        println("Object of class is created and Init is called.")
    }
    val currentPrice = originalPrice - (milesDrive * 10)

    fun display3() {
        println("------------")
        println("Car Information: $carName, $model")
        println("Car Owner: $owner")
        println("Miles Drive: $milesDrive")
        println("Original Car Price: $originalPrice")
        println("Current Car Price: ${currentPrice}")
        println("------------")
    }
}



fun main() {

    println("Creating Car Class Object car1 in next line")

    val car1 = Car1("BMW", 2018, "Aman", 105,100000.0)
    car1.display1()

    println("Creating Car Class Object car2 in next line")

    val car2 = Car2("BMW", 2019, "Karan", 20, 400000.0)
    car2.display2()
    println("******** ArrayList of Car ********")

    val carList = ArrayList<Car3>()

    // Add Car Objects
    carList.add(Car3("Toyota", 2017, "KJS", 100, 1080000.0))
    carList.add(Car3("Maruti", 2020, "NPP", 200, 4000000.0))

    for (car in carList) {
        car.display3()
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

