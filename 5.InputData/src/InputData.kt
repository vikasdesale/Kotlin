/**
 * Created by Dell on 6/30/2017.
 */
fun main(args:Array<String>)
{
    //readLine command for getting input data

    println("Please enter you name:")
    var name= readLine();
    println("Please enter you age:")
    var age:Int= readLine()!!.toInt()
    //String into integer     !!=non-null assert

println("your name is " + name + " and you are " +age+  " years old" )
}