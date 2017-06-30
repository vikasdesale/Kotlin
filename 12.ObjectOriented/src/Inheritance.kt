/**
 * Created by Dell on 7/1/2017.
 */
open class Math(){
                                     //by default class is final
                                    //specify open for  inheritance
    open fun add(a:Int, b:Int):Int{

        return a+b
    }
    fun sub(a:Int, b:Int):Int{
        return a-b
    }
}
class Math2():Math(){   //inherited class Math
    var x:Int?=null;
    //override method add
    override fun add(a:Int, b:Int):Int{
        return a+b+10
        this.x=20              //this allows us to access things in this class
        super.add(a, b)    //super allows us to access functions of inherited class
    }
    fun multiply(a:Int, b:Int):Int{
        return a*b
    }
    fun divide(a:Int, b:Int):Int{
        return a/b
    }
}

fun main(args:Array<String>){

  /*  var math = Math();

    var add=math.add(10,20);
    println(add)
    var sub=math.sub(10,20);
    println(sub)
*/
    var math2= Math2();
    var add=math2.add(10,20);
    var sub=math2.sub(10,20);
    var mul=math2.multiply(10,20);
    var div=math2.divide(10,20);
    println(add)
    println(sub)
    println(mul)
    println(div)
}