/**
 * Created by Dell on 6/30/2017.
 */
fun main(args:Array<String>){

    var a:Int=1
    var b:Int=2

    //Increment Operator
    //a=a+1
    var sum = ++a + b
    print("sum="+sum);

    var c:Int=1
    sum= c++ +b
    print("sum="+sum);

    //Decrement Operator
    //e=e-1
    var e:Int=1
    var f:Int=2
    var diff = --e + f
    print("diff="+diff);

    var d:Int=1
    diff= f-- -e
    print("diff="+diff);

}