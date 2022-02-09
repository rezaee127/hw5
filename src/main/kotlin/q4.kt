
fun <T> ArrayList<T>.print(){
    for (t in this)
        print("$t    ")
}

fun main(){
    val list= arrayListOf(32, "Ali" , 334.89 , 'Z' , -456)
    list.print()
}