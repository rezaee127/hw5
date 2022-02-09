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
    val listOfEmployee = arrayOf(manager1, clerk1, manager2, manager3)

    val listOfHours = arrayOf(140.0, 150.0, 130.0, 180.0)
}




enum class Gender{
    Female,Male
}