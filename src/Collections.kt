/**
 * Created by hieudm.lvt on 3/24/2021.
 */
fun main(args: Array<String>) {
/*    Tên Thuộc tính/phương thức	Mô tả
size	Thuộc tính trả về kích thước thực sự của Collection
[i]	Indexer cho phép truy suất và thay đổi giá trị tại vị trí i của collection
add()	Thêm một phần tử
addAll()	Thêm nhiều phần tử
removeAt()	Xóa theo vị trí
remove()	Xóa theo đối tượng
removeIf{}	Xóa theo điều kiện
clear()	Xóa toàn bộ danh sách
sort()	Sắp xếp tăng dần
sortDescending()	Sắp xếp giảm dần
filter {  }	Lọc dữ liệu
contains()	Kiểm tra Collection có chứa phần tử nào đó hay không*/

    var ds = listOf(5,6,1,9,-4,7,8,2)
    println("Các phần tử trong List cách 1:")
    for(i in ds.indices)
        print("${ds[i]}\t")
    println()
    println("Các phần tử trong List cách 2:")
    for(i in ds)
        print("$i\t")
    println()
    println("Các phần tử sắp xếp tăng dần:")
    var ds2= ds.sorted()
    for(i in ds2)
        print("$i\t")
    println()
    println("Các phần tử sắp xếp giảm dần:")
    var ds3= ds.sortedDescending()
    for(i in ds3)
        print("$i\t")
    println()
    var ds4=ds.filter { x->x%2==0 }
    println("Các phần tử chẵn:")
    for(i in ds4)
        print("$i\t")
    println()
    println("SUM="+ds.sum())
    println("MAX="+ds.max())
    println("MIN="+ds.min())
    println("AVERAGE="+ds.average())

}