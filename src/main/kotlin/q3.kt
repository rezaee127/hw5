class Generic<T>(var t1:T,var t2:T):Comparator<T> {
    override fun compare(t1: T, t2: T): Int {
        return (t1.toString()).compareTo(t2.toString())
    }
}