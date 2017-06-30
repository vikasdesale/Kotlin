/**
 * Created by Dell on 6/30/2017.
 */
fun main(args:Array<String>){

    //NullSafety is new feature in Kotlin

    var a:Int?   //that means a can be Int type or ? means null value

    //if you put like this
    // var a:Int
    //a=null gives error

    a=null

    print(a)
    a=10
    print(a)
}