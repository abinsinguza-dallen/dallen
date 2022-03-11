fun main(){
words("hens","doves","eagles","pigion")
    places(arrayOf("harare","mumbai","dodoma","jarkata"))
    operations(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
    var names= students("dallen","speria","faith")
    println(names.contentToString())

}
fun words(b:String,h:String,d:String,r:String){
    var birds = arrayOf(b, h, d, r)
    println(birds.contentToString())

}
fun places(cities:Array<String>){
    cities.forEach{ d ->
        println(d.capitalize())
        }
}
fun operations(number:Array<Int>){
    var sum = number[0] + number[4]
    println(sum)

    var points= number.indexOf(158)
    println(points)

    println(number.sortedArray().contentToString())
}

fun students(name1:String, name2:String,name3:String):Array<String>{
    var names= arrayOf(name1,name2,name3)
    return names
}

