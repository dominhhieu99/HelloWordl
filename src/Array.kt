import java.util.*

/**
 * Created by hieudm.lvt on 3/24/2021.
 */
fun main(args: Array<String>) {
    var M: IntArray = IntArray(10)

    var rd = Random()
    for (i in M.indices)
        M[i] = rd.nextInt(100)//nhập giá trị là các số ngẫu nhiên [0..99]
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
    println("Số chẵn=${M.count { x -> x % 2 == 0 }}")
//đếm số lẻ
    println("Số lẻ=${M.count { x -> x % 2 == 1 }}")
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
    var dsChan = M.filter { x -> x % 2 == 0 }
    println("Các số chẵn:")
    for (i in dsChan)
        print("$i\t")
    println()
//lọc các số lẻ trong mảng
    var dsLe = M.filter { x -> x % 2 == 1 }
    println("Các số Lẻ:")
    for (i in dsLe)
        print("$i\t")
    println()
    var k = 50
//lọc các số >50 trong mảng
    var dsTim = M.filter { x -> x > k }
    println("Các số > $k:")
    for (i in dsTim)
        print("$i\t")
    println()




    var n = Array(10,{IntArray(5)})
    for(i in n.indices)
    {
        for(j in n[i].indices)
        {
            n[i][j]=rd.nextInt(100)
        }
    }
    println("Mảng 2 chiều sau khi nhập:")
    for(i in n.indices)
    {
        for(j in n[i].indices)
        {
            print("${n[i][j]}\t")
        }
        println()
    }
    println("Mảng 2 chiều sau khi nhập - cách 2:")

    for(row in n)
    {
        for(cell in row)
        {
            print("$cell \t")
        }
        println()
    }
    println("Mảng thứ 1:")
    var M1=n[1]
    for (i in M1.indices)
        print("${M1[i]}\t")
    println()
}
