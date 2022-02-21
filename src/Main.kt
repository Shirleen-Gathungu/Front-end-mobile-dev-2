fun main() {
    helloName()
    myself()
    add(num1=67,num2=33)
    add(num1=45,num2=989)
    add(num1=7000,num2=4560)
    add(num1=807,num2=420)
    remainder(a=989,b=47)
}



fun helloName(){
    println("Hello Shirleen Gathungu")
}

fun myself(){
    val message:String=("My name is Shirleen Gathungu.Currently on a gap year.I just realised in the past year that I am very good with remembering details in a person like their full name.I am also very good in imagining unrealistic scenarios.I believe with this kind of imagination,I will be able to innovate amazing things in tech that will be useful to humans.")
    println(message)
}
fun add(num1:Int,num2:Int){
    num1+num2
    println(num1+num2)
}

fun remainder(a:Int,b:Int) {
    val remainder=a % b
    println(remainder)


}

