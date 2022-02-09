fun main() {

    //O(1)
    val n: Int = 5
    println("Your input is: $n")


    //O(n)
    for (i in 0 until n) {
        println("Your output is $i")
    }


    //O(n!)
    for (i in 1..n) {
        for (j in 1..n) {
            println("Your output is $i and $j")
        }
    }
    for (i in 1..factorial(n)) {
        println("Your output is $i")
    }

}


fun factorial(n:Int):Long{
    return 12
}