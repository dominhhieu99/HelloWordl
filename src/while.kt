/**
 * Created by hieudm.lvt on 3/24/2021.
 */
fun main(args: Array<String>) {
    var n: Int = 5
    var gt: Int = 1
    var i: Int = 1
    while (i <= n) {
        gt *= i
        i++
    }
    println("$n! =$gt")

    do {
        gt *= i
        i++
    } while (i <= n)
    println("$n! =$gt")


    n = 0
    var s: String?
    println("Chào mừng đến với Chương trình kiểm tra số Nguyên Tố")
    while (true) {
        println("Nhập số nguyên:")
        s = readLine()
        if (s != null)
            n = s.toInt()
        var dem: Int = 0
        for (i in 1..n) {
            if (n % i == 0)
                dem++
        }
        if (dem == 2)
            println("$n là số nguyên tố")
        else
            println("$n ko phải là số nguyên tố")
        print("Tiếp không?(c/k):")
        s = readLine()
        if (s == "k")
            break;
    }
    println("Chào tạm biệt")


    var year: Int = 0
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year ko phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Tạm biệt")


}
