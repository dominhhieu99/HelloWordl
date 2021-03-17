fun main(args: Array<String>) {
//giai phương trình bậc 2
    var a:Int
    var b:Int
    var c:Int
    var delta:Double
    var s:String?
    println("Mời nhập a: ")
    s= readLine()
    if (s!=null){
        a=s.toInt()
    }else{
        a=0
    }
    println("Mời nhập b: ")
    s= readLine()
    if (s!=null){
        b=s.toInt()
    }else{
        b=0
    }
    println("Mời nhập c: ")
    s= readLine()
    if (s!=null){
        c=s.toInt()
    }else{
        c=0
    }
    println("Phương trình $a x2 + $b x + $c = 0")
    delta= ((b*b)-(4*a*c)).toDouble();
    if (delta<0){
        println("Phương trình vô nghiệm")
    }else if (delta.equals(0)){
        println("Phương trình có nghiệm kép: x1, x2 = "+(-b/(2*a)))
    } else if (delta>0){
        println("Phương trình có 2 nghiệm x1 = "+((-b + Math.sqrt(delta))/(2*a)))
        println("Phương trình có 2 nghiệm x2 = "+((-b - Math.sqrt(delta))/(2*a)))
    }
}