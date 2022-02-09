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










enum class Gender{
    Female,Male
}