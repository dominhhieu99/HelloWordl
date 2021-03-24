/**
 * Created by hieudm.lvt on 3/24/2021.
 */
fun main(args: Array<String>) {


    try {
        // some code
    } catch (e: Exception) {
        // handler
    } finally {
        // optional finally block
    }


//    val a: Int? = try { parseInt(input) } catch (e: NumberFormatException) { null }


    try {
        var a:Int=5
        var b:Int=0;
        var c=a/b
        println("$a/$b=$c")
    }
    catch (e:Exception)
    {
        println(e.message)
    }
    finally {
        println("Đây là finally, 100% chạy, cho dù lỗi hay không")
    }
}