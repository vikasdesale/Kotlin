/**
 * Created by Dell on 6/30/2017.
 */
fun main(args:Array<String>){

    var array= Array<Int>(5){0}
    array[0]=1
    array[1]=2
    array[2]=3
    array[3]=4
    array[4]=5


    for(counter in array){

        println("number "+array +counter )
    }

    for(counter in 0..2){

        println("Enter number ")
        array[counter] = readLine()!!.toInt();


    }
    println(array[1])


}