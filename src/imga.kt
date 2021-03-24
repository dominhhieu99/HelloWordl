import kotlin.math.sqrt

/**
 * Hinh
 *
 * @constructor Create empty Hinh
 */
 class hinh{

    var a: Int = 0
    var b: Int = 0
    var c: Int = 0
    constructor()
    constructor(a: Int, b: Int, c: Int) {
        this.a = a
        this.b = b
        this.c = c
    }

    fun chuVi(): Int {
        return a + b + c
    }

    fun dienTich(): Double {
        var p = chuVi() / 2
        return sqrt((p * (p - a) * (p - b) * (p - c)).toDouble())
    }

}

class SinhVien {
    constructor()
    {
        println("Đây là secondary constructor 0 đối số")
    }
    constructor(ma:Int,ten:String)
    {
        println("Đây là secondary constructor 2 đối số")
        println("Mã=$ma ; Tên =$ten")
    }
}
