fun main(args: Array<String>) {
    val car1 = Car("Ferrari","Sports")
    println(car1.name)
    
    car1.move()
}
class Car(name : String,model:String){
    var name:String = name
    var model:String = model
    fun move(){
        print("car is moving")
    } 
    fun stop(){
        print("car is stopped")
    }
}