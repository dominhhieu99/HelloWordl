import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

/**
 * Created by hieudm.lvt on 3/24/2021.
 */
fun main(args: Array<String>) {
    println("Mời nhập giá trị: ")
    var value: Int = readLine()!!.toInt()
    when (value) {
        1 -> println("Hello Obama")
        2 -> println("Hello Putin")
        3 -> println("Hello Kim Jong Un")
        else -> println("Hello Everyone!")

    }


//    phép toán  + - * /

    var a: Double
    var b: Double
    var pheptoan: String?
    println("Phép tính + - * /")
    print("mời bạn nhập giá trị a: ")
    a = try {
        readLine()!!.toDouble()
    } catch (e: NumberFormatException) {
        0.0.also { a = it }
    }
    print("mời bạn nhập giá trị b: ")
    b = try {
        readLine()!!.toDouble()
    } catch (e: NumberFormatException) {
        0.0.also { b = it }
    }
    print("mời bạn nhập phép tính + - * / : ")
    pheptoan = readLine()!!.toString()
    if (pheptoan.isNullOrEmpty()){
        pheptoan="+"
    }

    when (pheptoan) {
        "+" -> println(a.toString() + " + " + b.toString() + " = " + (a + b))
        "-" -> println(a.toString() + " - " + b.toString() + " = " + (a - b))
        "*" -> println(a.toString() + " * " + b.toString() + " = " + (a * b))
        "/" ->
            if (b == 0.0)
                println("mẫu số phải khác 0")
            else
                println(a.toString() + "/" + b.toString() + " = " + (a / b))
        else -> println("bạn nhập sai")
    }
// nhập số tháng -> số quý của năm
    var month: Int = 0
    println("Nhập tháng:")
    var s: String? = readLine()
    if (s != null)
        month = s.toInt()
    when (month) {
        1, 2, 3 -> println("Tháng " + month + " thuộc quý 1")
        4, 5, 6 -> println("Tháng " + month + " thuộc quý 2")
        7, 8, 9 -> println("Tháng " + month + " thuộc quý 3")
        10, 11, 12 -> println("Tháng " + month + " thuộc quý 4")

        else ->
            println("Tháng " + month + " ko hợp lệ")
    }

//
    var tuoi: Int = 0
    println("Nhập tuoi:")
    tuoi = readLine()!!.toInt()
    when (tuoi) {
        in 1..5 -> println("Tuổi thiếu nhi")
        in 6..9 -> println("Tuổi nhi đồng")
        in 10..15 -> println("Tuổi thiếu niên")
        in 16..28 -> println("Tuổi thanh niên")
        !in 1..100 -> println("Ko biết tuổi gì")
        else -> println("...")
    }

}