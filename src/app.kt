import java.util.*

/**
 * @author Trần Duy Thanh
 * @param x biến x
 * @param y biến y
 * @return tổng của x và y
 * @sample x=5, y=6 => 11
 * Đây là ghi chú docs
 */
fun Cong(x:Int,y:Int):Int
{
    return x+y
}/*
Đây là hàm main
dùng để chạy chương trình
*/
fun main() {
    println("Hello World!")
    println("Obama")
    println("Putin")
    println("Kim Jong Un")
    //gọi hàm Cộng 2 số
    val t:Int=Cong(7,8)
    var c:Char='c'
    println(t)
//    Kiểu dữ liệu trong kotlin
    var x:Long=100L
    var y:Double=110.0
    var z:Byte=1
    var x2:Short= 3
    var i:Int = 333

    var address:String="""số 24 đường 7, khu phố X"""
println(address)
    var ten:String="Nguyễn Văn A - Hà Nội"
    var kq:Boolean=true
    var arrA:IntArray= IntArray(10)
    arrA.set(0,0);
    arrA.set(1,1);
    arrA.set(2,2);
    arrA.set(3,3);

    for (a in 0..3){
        println(arrA[a])
    }
    var M:IntArray= IntArray(10)

    var rd= Random()
    for(i in M.indices)
        M[i]=rd.nextInt(100)//nhập giá trị là các số ngẫu nhiên [0..99]
    println("Mảng sau khi nhập - duyệt theo giá trị:")
    for (i in M)
        print("$i\t")
    println()
    println("Mảng sau khi nhập - duyệt theo vị trí:")
    for (i in M.indices)
        print("${M[i]}\t")
    println()
//số lớn nhất
    println("MAX=${M.max()}")
//số nhỏ nhất
    println("MIN=${M.min()}")
//tổng mảng
    println("SUM=${M.sum()}")
//trung bình mảng
    println("AVERAGE=${M.average()}")
//đếm số chẵn
    println("Số chẵn=${M.count { x->x%2==0 }}")
//đếm số lẻ
    println("Số lẻ=${M.count { x->x%2==1 }}")
//sắp xếp tăng dần
    M.sort()
    println("Tăng dần:")
    for (i in M)
        print("$i\t")
    println()
//sắp xếp giảm dần
    M.sortDescending()
    println("Giảm dần:")
    for (i in M)
        print("$i\t")
    println()
//lọc các số chẵn trong mảng
    var dsChan= M.filter { x->x%2==0 }
    println("Các số chẵn:")
    for (i in dsChan)
        print("$i\t")
    println()
//lọc các số lẻ trong mảng
    var dsLe= M.filter { x->x%2==1 }
    println("Các số Lẻ:")
    for (i in dsLe)
        print("$i\t")
    println()
    var k=50
//lọc các số >50 trong mảng
    var dsTim=M.filter { x->x>k }
    println("Các số > $k:")
    for (i in dsTim)
        print("$i\t")
    println()

        var a:Double=0.0
        var b:Double=0.0
        println("Nhập a:")
        var s= readLine()
        if(s!=null)
            a=s.toDouble()
        println("Nhập b:")
        s= readLine()
        if(s!=null)
            b=s.toDouble()
        if(a==0.0 && b==0.0)
        {
            println("Phương trình vô số nghiệm")
        }
        else if(a==0.0 && b!=0.0)
        {
            println("Phương trình vô nghiệm")
        }
        else
        {
            var x=-b/a
            println("No x="+x)
        }
}