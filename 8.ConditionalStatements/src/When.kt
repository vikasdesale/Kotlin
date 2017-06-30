/**
 * Created by Dell on 6/30/2017.
 */
fun main(args:Array<String>){

    //When is like switch statement
    var a:Int=50

    when(a)
    {
        50 -> { println(" A's values is 50") }   //when value of A is 50 print this option
        60 -> { println(" A's values is 60") } //when value of A is 60 print this option

        else ->  { println(" A's values is other than 50 and 60") }   //like default statement
    }

}