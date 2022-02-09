interface Vehicle{
    fun maxSpeed()
    fun maxCapacity()
    val name:String
    val speed:Int
    val capacity:Int
}

interface PublicTrasportationVehicle:Vehicle {
    override fun maxSpeed()
    override fun maxCapacity()
    override val name:String
}
interface ServiceTrasportationVehicle:Vehicle {
    override fun maxSpeed()
    override fun maxCapacity()
    override val name:String
}
interface PrivateTrasportationVehicle:Vehicle {
    override fun maxSpeed()
    override fun maxCapacity()
    override val name:String
}
