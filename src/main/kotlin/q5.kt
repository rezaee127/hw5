fun <F> ArrayList<F>.slice2(i:Int){
    if (i>-1) {
        if (i+1<this.size) {
            val x = this.subList(0, i + 1)
            val y = this.subList(i + 1, this.lastIndex + 1)
            print("[$x , $y]\n")
        }else{
            print("${this}\n")
        }
    }else
        print("slice is impossible")
}


fun main(){
    val list= arrayListOf(32, "Ali" , 334.89 , 'Z' , -456)
    list.slice2(1)
    val list2= arrayListOf(1,2,3,4,5)
    list2.slice2(2)
    val list3= arrayListOf('a','b','c','d','e','f','g')
    list3.slice2(3)
    list3.slice2(20)
    list3.slice2(0)
    list3.slice2(-1)
}