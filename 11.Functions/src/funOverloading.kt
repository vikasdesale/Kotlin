/**
 * Created by Dell on 6/30/2017.
 */
fun add(a:Int, b:Int) : Int{
    return a+b
}
fun add(a:Int, b:Int, c:Int ) : Int{
    return a+b+c
}
fun add(a:Int, b:Int, c:Int, d:Int ) : Int{
    return a+b+c+d
}

fun main(args:Array<String>){
    var total=add(10,20);
    println(total)
    total=add(10,20,30);
    println(total)
    total=add(10,20,30,40);
    println(total)
}