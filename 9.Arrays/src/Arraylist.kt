/**
 * Created by Dell on 6/30/2017.
 */
fun main(args:Array<String>){

    //ArrayList
    var names= ArrayList<String>()
    names.add("vikas")   //Index 0
    names.add("vishal")
    names.add("prem")
    names.add("pankaj")


    println("name "+ names.get(3));
    if(names.contains("pankaj")){
        println("pankaj is exist in database")
    }else
    {
        println("pankaj is not exist in database")
    }

}