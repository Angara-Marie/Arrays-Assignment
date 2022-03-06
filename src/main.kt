fun main(){
    students(arrayOf("Tessa", "Naima", "Saido", "Shamim"))
    countries(arrayOf())
    Nums(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
    var c=majina(arrayOf("Tessa", "Nakimuli", "Maryann"))
    println(c)


}
fun students(names:Array<String>){
    println(names.contentToString())
}
fun countries(cities:Array<String>){
    var cities = arrayOf ("harare", "mumbai", "dodoma","jakarta")
    cities.forEach { jiji ->
        println(jiji.capitalize())
    }
}
fun Nums(numbers:Array<Int>){
    var sum = numbers[1].plus(numbers[4])
    println(sum)
    var index = numbers.indexOf(158)
    println(index)
    var sortedNums= numbers.sortedArray()
    println(sortedNums.contentToString())
}
fun majina(girls:Array<String>):String{
    var girl=(girls.contentToString())
    return girl
}

