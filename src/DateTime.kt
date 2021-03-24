import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by hieudm.lvt on 3/24/2021.
 */
fun main(args: Array<String>) {

    var x: Int = 986553823
    var dcf = DecimalFormat("#,###")
    var dcfs = DecimalFormatSymbols(Locale.getDefault())
    dcfs.groupingSeparator = ','
    dcf.decimalFormatSymbols = dcfs
    println(x)
    println(dcf.format(x))
    var cal = Calendar.getInstance()
    var year = cal.get(Calendar.YEAR)
    var month = cal.get(Calendar.MONTH)
    var day = cal.get(Calendar.DAY_OF_MONTH)
    println("Năm=$year")
    println("Tháng=$month")
    println("Ngày=$day")

    var date = cal.time
    var sdf = SimpleDateFormat("dd/MM/yyyy");
    println(sdf.format(date))
    var sdf2 = SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
    println(sdf2.format(date))

    println("Số PI=" + Math.PI)
    println("Giá trị tuyệt đối của -4=" + Math.abs(-4))
    println("số " + Math.max(9, 2) + " là số lớn")
    println("Căn bậc 2 của 25=" + Math.sqrt(25.0))
    println("3 mũ 4 =" + Math.pow(3.0, 4.0))
    var goc = 45
    var rad = Math.PI * goc / 180
    println("sin($goc)=" + Math.sin(rad))
    println("cos($goc)=" + Math.cos(rad))
    println("tan($goc)=" + Math.tan(rad))
    println("cotan($goc)=" + Math.cos(rad) / Math.sin(rad))

    while (true) {
        choi()
        println("Chơi nữa không thím?(c/k):")
        val tl = readLine()
        if (tl.equals("k", ignoreCase = true))
            break
    }
    println("Tạm biệt Thím!")

}

fun choi() {
    val rd = Random()
    val soMay = rd.nextInt(101)
    println("Máy đã ra 1 số [0...100] mời Thím đoán!")
    var soNguoi: Int = 0
    var soLanDoan = 0
    do {
        println("Bạn đoán số gì?:")
        var s = readLine()
        if (s != null)
            soNguoi = s.toInt()
        soLanDoan++
        println("Thím đoán lần thứ " + soLanDoan)
        if (soNguoi == soMay) {
            println("Chúc mừng Thím! Thím đoán đúng, số máy =" + soMay)
            break

        } else {
            println("Thím đoán sai! số máy <số thím ")
        }
        if (soLanDoan == 7) {
            println("Thím đã Cáo Phó, vì đoán 7 lần mà ko trúng!")
            break
        }
    } while (soLanDoan <= 7)


//    append() – nối chuỗi
//    insert() – chèn chuỗi
//    delete() – xóa chuỗi
//    reverse() – đảo ngược chuỗi

    var sb = StringBuilder("Obama Putin")
    println(sb.toString())
    sb.insert(5, "Kim Jong Un")
    println(sb.toString())
    sb.append(" Donald Trump")
    println(sb.toString())
    sb.reverse()
    println(sb.toString())
}