/**
 * Created by hieudm.lvt on 3/24/2021.
 */

fun main(args: Array<String>) {
    println("Xin chào! Tôi là Kotlin.")
//    print("Bạn tên là: ")
//    var name: String? = readLine()
//    println("Chào mừng bạn $name đến với Kotlin. Chúc bạn có một ngày làm việc hiệu quả! ")


//    Giải phương trình bậc 1
    var a: Double = 0.0
    var b: Double = 0.0
    println("Giải phương trình 1 ẩn ax + b =0")
    print("Mời bạn nhập giá trị a: ")

    a = readLine()!!.toDouble()
    print("Mời bạn nhập giá trị b: ")
    b = readLine()!!.toDouble()
    println("Phương trình bậc 1 ${a}X + $b = 0 ")


//    Tìm số lớn nhất giữa a và b
    var max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println("max =" + max)

}
