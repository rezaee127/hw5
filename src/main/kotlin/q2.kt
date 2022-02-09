abstract class Employee {
    open val name: String=""
    open val age: Int=0
    open val hourRate: Double=0.0

    abstract fun salary(hours: Double): Double
    override fun toString(): String {
        return "name: $name age: $age hourRate: $hourRate"
    }
}
class Manager(override val name: String, override val age: Int, override val hourRate: Double):Employee(){
    override fun salary(hours: Double): Double {
        return hourRate*hours
    }
}

class Clerk(override val name: String, override val age: Int, override val hourRate: Double):Employee(){
    override fun salary(hours: Double): Double {
        return (hourRate*hours)/2
    }
}

data class Customer(var name:String,var age:Int,var gender:Gender)

fun main() {
    val manager1 = Manager("Ali", 52, 104.0)
    val clerk1 = Clerk("Sama", 26, 110.0)
    val manager2 = Manager("Reza", 42, 120.0)
    val manager3 = Manager("Farhad", 34, 120.0)
    val listOfEmployees = arrayOf(manager1, clerk1, manager2, manager3)

    val listOfHours = arrayOf(140.0, 150.0, 130.0, 180.0)
    println("list of employee")
    var totalPayment=0.0
    for (i in listOfEmployees.indices){
        println(listOfEmployees[i])
        totalPayment +=listOfEmployees[i].salary(listOfHours[i])
    }
    println("\nTotal payment is $totalPayment $\n")

    val customer1=Customer("Sara",22,Gender.Female)
    val customer2=Customer("Maryam",30,Gender.Female)
    val customer3=Customer("Sara",22,Gender.Female)

    if (customer1==customer2){
        println("${customer1} and ${customer2} are the same\n")
    }

    val listOfManagers= arrayOf(manager1,manager2,manager3)
    println("{${listOfManagers.maxByOrNull { it->it.age }}}  is the oldest manager")

}



enum class Gender{
    Female,Male
}