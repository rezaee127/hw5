import java.util.*

fun main() {
    try {
        var flag = true
        while (flag) {
            val r = Scanner(System.`in`)
            println("\nenter 1 for convert Decimal to Binary ")
            println("enter 2 for convert Binary to Decimal ")
            println("enter 0 for exit ")
            when (r.nextInt()) {
                1 -> {
                    decimalToBinary()
                }
                2 -> {
                    binaryToDecimal()
                }
                0 -> {
                    flag = false
                }
                else -> {
                    println("number is incorrect")
                }
            }
        }
    } catch (e: InputMismatchException) {
        println("input invalid")
    } catch (e: Exception) {
        println("input invalid")
    }
}