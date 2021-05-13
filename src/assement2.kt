import javax.swing.GroupLayout
fun main() {

    var bus = mutableListOf<Car>(Car("benz","three","blue"),
        Car("benz","new","red"),
        Car("brand","old","other"),
        Car("toyata","motor","blue"))
    brandColor(bus)
    print(length("sarah"))

}
data class Car(var make:String, var model:String,var color:String)
fun brandColor(cars:List<Car>){
    var redCars = mutableListOf<Car>()
    var blueCars = mutableListOf<Car>()
    var others = mutableListOf<Car>()


    var colour= cars.forEach { car ->  car.color}
    println(colour)
    when (colour) {
        "blue"  -> blueCars.plus(cars)
        " red" -> redCars.plus(cars)
        else -> others.plus(cars)
    }
    println("blue")

}

fun length(text:String):Int {
    return text.length
}
class Current(var name:String,var number:String,var balance:Double)
fun deposit(amount: Double){
    var  cash=
}
