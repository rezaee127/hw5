
class Generic<T>(var t1:T,var t2:T)/*:Comparator<T>*/{
    /*    override fun compare(t1: T, t2: T): Int {
            return (t1.toString()).compareTo(t2.toString())
        }
        fun compare():T{
            if (compare(t1,t2)>0)
                return  t1
            else
                return t2
        }
    */
    fun compare():T{
        if (t1.toString()>t2.toString())
            return  t1
        else
            return t2

    }
}

fun main(){
    val generic1=Generic(1,1.00001)
    println(generic1.compare())
    val generic2=Generic(23.2,22.2)
    println(generic2.compare())
    val generic3=Generic("aa","1a")
    println(generic3.compare())
}