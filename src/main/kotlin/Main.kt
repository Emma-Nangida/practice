
fun main() {
    name("Emma")
    multiply(10,4,40,5)
    println(names("winny"))
    println(addition(40,50,100,70))
    println(fact("Emma",5.4F, 23, country = "Kenya"))







}
fun name(name:String){
    println("hello"+ name)


}

fun multiply(num1:Int,num2:Int,num3:Int,num4:Int){
    var z=(num1*num2*num3*num4)
    println(z)
}
fun names(names: String):String{
    var greetings="Hello , my name is" + names
    return greetings



}
fun addition(num1:Int,num2: Int,num3: Int,num4: Int):Int{
    var z=(num1+num2+num3+num4)
    return z


}

fun fact(name: String,height:Float,age:Int,country:String):String{
    var name=("my name is $name Iam $height tall and I am $age from $country")
    return name

}