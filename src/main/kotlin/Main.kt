open class Car (model : String, color : String, speed : Int){

     open fun getFuelType():String{
         return "Unknown Fuel Type"
     }
}

class BMW(model: String, color: String, speed: Int) : Car(model, color, speed){
 override fun getFuelType() : String{
    return "Fuel Type is Benzene"
    }
}

class Tesla(model: String, color: String, speed: Int) : Car(model, color, speed){
 override fun getFuelType() : String{
        return "Car is Electric"
    }
}

fun main() {



    var BMW1 = BMW("BMW1", "White", 200)
    println("BMW Fuel Type: ${BMW1.getFuelType()}")

    var Tesla1 = Tesla("Model S", "Black", 250)
    println("Tesla Fuel Type: ${Tesla1.getFuelType()}")



}

