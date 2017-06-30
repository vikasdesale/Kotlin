/**
 * Created by Dell on 6/30/2017.
 */
class Apple(){

    var color:String?=null
    var shape:String?=null

  /*class Apple(color:String,shape:String){

    var color:String?=null

  //will be executed when class is initialized or an instance is created
    init{   //you can print values here
      println("color : $color")   //$ means this is variable color print variable value
         println("shape : $shape")
       this.color=color
       this.shape=shape
    }*/

    //use init or constructor ...using constructor is good programming practice
    constructor(color:String,shape:String):this(){
        this.color=color
        this.shape=shape
    }
    fun GetColor():String?{

        return this.color
    }
    fun GetShape():String?{
      return this.shape
    }
}

fun main(args:Array<String>){
    var fruit=Apple("Red","Circular")
    println("color : " +fruit.GetColor())
    println("shape : " +fruit.GetShape())
    var greenFruit=Apple("Green","Round")
    println("color : " +greenFruit.GetColor())
    println("shape : " +greenFruit.GetShape())

}