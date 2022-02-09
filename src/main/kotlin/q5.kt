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
