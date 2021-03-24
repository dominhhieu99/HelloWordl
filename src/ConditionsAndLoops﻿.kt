/**
 * Created by hieudm.lvt on 3/24/2021.
 */
fun main(args: Array<String>) {

//    println("Mời nhập giá trị: ")
//    var value: Int = readLine()!!.toInt()
//    if (value==1){
//        println("Hello Obama")
//    }else if (value==2){
//        println("Hello Putin")
//    }else if (value==3){
//        println("Hello Kim Jong Un")
//    }else{
//        println("Hello Everyone!")
//    }

    var gt: Int = 1
    val n: Int = 5
    var sum: Int = 0

//    .. chay i chạy đến n
//    unit i chạy đến n-1
//    step 2 là i chạy i = i+=2
//    downTo đếm ngược từ n về i

    for (i in 1..n) {
        gt *= i
        sum += i

    }
    println("$n!=$gt")
    println("Tổng=$sum")


    //    downTo đếm ngược từ n về i

    var a: Int = 9
    var b: Int = 6
    var ucscln = 1
    var min = if (a > b) b else a
    for (i in min downTo 1) {
        if (a % i == 0 && b % i == 0) {
            ucscln = i
            break
        }
    }

    println("USCL của $a và $b = $ucscln")


    var dsSanPham = arrayOf("kotlin", "java", "c#", "python", "R")

    for (i in dsSanPham.indices)
        println("Sản phẩm thứ $i có tên " + dsSanPham[i])

    for ((index, value) in dsSanPham.withIndex()) {
        println("Sản phẩm thứ $index có tên $value")
    }

}