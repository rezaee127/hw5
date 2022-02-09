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



class Taxi(override val name:String, override var speed:Int,override val capacity:Int):PublicTrasportationVehicle{
    var listOfTaxis=ArrayList<Taxi>()
    override fun maxSpeed() {
        var max=0
        var fastestCar=""
        for (taxi in listOfTaxis){
            if (taxi.speed>max){
                max=taxi.speed
                fastestCar=taxi.name
            }
        }
        println("fastest ${this.javaClass.name} is $fastestCar with $max kph speed")
    }

    override fun maxCapacity() {
        var max=0
        var mostCapaciousCar=""
        for (taxi in listOfTaxis){
            if (taxi.capacity>max){
                max=taxi.capacity
                mostCapaciousCar=taxi.name
            }
        }
        println("The most capacious ${this.javaClass.name} is $mostCapaciousCar with $max capacity")
    }
}

class Bus(override val name:String, override val speed:Int,override val capacity:Int):PublicTrasportationVehicle{
    var listOfBuses=ArrayList<Bus>()
    override fun maxSpeed() {
        var max=0
        var fastestCar=""
        for (bus in listOfBuses){
            if (bus.speed>max){
                max=bus.speed
                fastestCar=bus.name
            }
        }
        println("fastest ${this.javaClass.name} is $fastestCar with $max kph speed")
    }

    override fun maxCapacity() {
        var max=0
        var mostCapaciousCar=""
        for (bus in listOfBuses){
            if (bus.capacity>max){
                max=bus.capacity
                mostCapaciousCar=bus.name
            }
        }
        println("The most capacious ${this.javaClass.name} is $mostCapaciousCar with $max capacity")
    }
}

class SportCar(override val name:String,override val speed:Int,override val capacity:Int): PrivateTrasportationVehicle{
    var listOfSportCars=ArrayList<SportCar>()
    override fun maxSpeed() {
        var max=0
        var fastestCar=""
        for (sportCar in listOfSportCars){
            if (sportCar.speed>max){
                max=sportCar.speed
                fastestCar=sportCar.name
            }
        }
        println("fastest ${this.javaClass.name} is $fastestCar with $max kph speed")
    }

    override fun maxCapacity() {
        var max=0
        var mostCapaciousCar=""
        for (sportCar in listOfSportCars){
            if (sportCar.capacity>max){
                max=sportCar.capacity
                mostCapaciousCar=sportCar.name
            }
        }
        println("The most capacious ${this.javaClass.name} is $mostCapaciousCar with $max capacity")
    }
}

class Van(override val name:String,override val speed:Int,override val capacity:Int):PrivateTrasportationVehicle{
    var listOfVans=ArrayList<Van>()
    override fun maxSpeed() {
        var max=0
        var fastestCar=""
        for (van in listOfVans){
            if (van.speed>max){
                max=van.speed
                fastestCar=van.name
            }
        }
        println("fastest ${this.javaClass.name} is $fastestCar with $max kph speed")
    }

    override fun maxCapacity() {
        var max=0
        var mostCapaciousCar=""
        for (van in listOfVans){
            if (van.capacity>max){
                max=van.capacity
                mostCapaciousCar=van.name
            }
        }
        println("The most capacious ${this.javaClass.name} is $mostCapaciousCar with $max capacity")
    }
}

class Ambulance(override val name:String,override val speed:Int,override val capacity:Int):ServiceTrasportationVehicle{
    var listOfAmbulances=ArrayList<Ambulance>()
    override fun maxSpeed() {
        var max=0
        var fastestCar=""
        for (ambulance in listOfAmbulances){
            if (ambulance.speed>max){
                max=ambulance.speed
                fastestCar=ambulance.name
            }
        }
        println("fastest ${this.javaClass.name} is $fastestCar with $max kph speed")
    }

    override fun maxCapacity() {
        var max=0
        var mostCapaciousCar=""
        for (ambulance in listOfAmbulances){
            if (ambulance.capacity>max){
                max=ambulance.capacity
                mostCapaciousCar=ambulance.name
            }
        }
        println("The most capacious ${this.javaClass.name} is $mostCapaciousCar with $max capacity")
    }
}

class Truck(override val name:String,override val speed:Int,override val capacity:Int):ServiceTrasportationVehicle{
    var listOfTrucks=ArrayList<Truck>()
    override fun maxSpeed() {
        var max=0
        var fastestCar=""
        for (truck in listOfTrucks){
            if (truck.speed>max){
                max=truck.speed
                fastestCar=truck.name
            }
        }
        println("fastest ${this.javaClass.name} is $fastestCar with $max kph speed")
    }

    override fun maxCapacity() {
        var max=0
        var mostCapaciousCar=""
        for (truck in listOfTrucks){
            if (truck.capacity>max){
                max=truck.capacity
                mostCapaciousCar=truck.name
            }
        }
        println("The most capacious ${this.javaClass.name} is $mostCapaciousCar with $max capacity")
    }
}


