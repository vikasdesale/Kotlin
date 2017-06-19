/**
 * Created by Dell on 6/19/2017.
 */
fun main(args:Array<String>){

 //automatically detect data type
    var a = 15
    print(a);   //output 15
    a=50
    print(a);   // output 50
    var car= "Ferrari"
    print(a);   // output Ferrari

    //for enforcement
    var b:Int=20;
    //b="vikas"    gives error

    var email:String?    // ? this means variable email is going to be wait to assign value to email by programmer or user

    email ="vikas.desaleu@gmail.com"

    print(email)   //vikas.desaleu@gmail.com

//small your info detail

    var name = "vikas"
    var age = 21
    var phone:Int = 1234567890

    //concatenation operator   +
    println("\n My name is " + name + " amd I am" + age + " years old and my phone number is " + phone)



    // Var vs Val
    var c=20  //value can be changed or updated
    c=30     //not gives any error

    val d=20   //cannot be changed or updated
    //d=30  gives error

}