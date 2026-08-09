// Parent Class
open class Product(
    val productName: String,
    var quantity: Int,
    var amountPerQuantity: Double
) {
    // Parent Secondary Constructor 1
    constructor(productName: String) : this(productName, 0, 0.0)

    // Parent Secondary Constructor 2
    constructor(productName: String, quantity: Int) : this(productName, quantity, 0.0)

    open fun displayInfo() {
        print("Product: $productName | Qty: $quantity | Price: $$amountPerQuantity")
    }
}

// Child Class inherits from Parent
class Laptop(
    productName: String,
    quantity: Int,
    amountPerQuantity: Double,
    val cpuName: String,
    val ramSizeGb: Int,
    val hddSizeGb: Int
) : Product(productName, quantity, amountPerQuantity) {

    // Child Secondary Constructor
    // 'this' is use for constructor
    constructor(productName: String, cpuName: String) : this(
        productName, 1, 999.0, cpuName, 8, 512
    )

    override fun displayInfo() {
        super.displayInfo()
        println(" | CPU: $cpuName | RAM: ${ramSizeGb}GB | Storage: ${hddSizeGb}GB HDD")
    }
}

fun main() {
    val laptops = ArrayList<Laptop>()

    // adding using the primary constructor
    laptops.add(Laptop("Dell XPS 15", 2, 1500.0, "Intel i7", 16, 512))
    laptops.add(Laptop("MacBook Pro", 1, 2400.0, "Apple M3 Pro", 18, 512))
    laptops.add(Laptop("HP Pavilion", 4, 700.0, "AMD Ryzen 5", 8, 256))
    laptops.add(Laptop("Lenovo ThinkPad", 3, 1200.0, "Intel i5", 16, 1024))

    // adding using the child secondary constructor
    laptops.add(Laptop("Asus ROG Strix", "AMD Ryzen 9"))

    println("=== Laptop Inventory Information ===")
    for (laptop in laptops) {
        laptop.displayInfo()
    }
}
