fun main(args: Array<String>) {
//    1. Toán tử một ngôi:
    println("1. Toán tử một ngôi:")
    var a: Int = 8
    var b = a.unaryPlus()// số dương = a * 1 nếu a <0 -> b<0 & a>0 -> b>0
    var c = a.unaryMinus()// số âm = a * -1 nếu a <0 -> c>0 & a>0 -> c<0
    println("a= " + a)
    println("b= " + b)
    println("c= " + c)

/*
    2. Toán tử số học cơ bản:
    +	 Cộng	a.plus(b)	 8 + 5 => 13 8.plus(5) =>13
    –	 Trừ	a.minus(b)	8-5 =>3 8.minus(5) =>3
    *	 Nhân	times	 8*5 =>40 8.times(5) =>40
    /	 Chia	div	 8/5  => 1 8.div(5) => 1
    %	 Chia lấy phần dư	rem	 8 % 5 => 3 8.rem(5) =>3
*/
    println("2. Toán tử số học cơ bản:")
    a = 8;b = 5
    println("Phép cộng cách 1:" + a + "+" + b + "=" + (a + b))
    println("Phép cộng cách 2:" + a + "+" + b + "=" + (a.plus(b)))
    println("Phép trừ cách 1:" + a + "-" + b + "=" + (a - b))
    println("Phép trừ cách 2:" + a + "-" + b + "=" + (a.minus(b)))
    println("Phép nhân cách 1:" + a + "*" + b + "=" + (a * b))
    println("Phép nhân cách 2:" + a + "*" + b + "=" + (a.times(b)))
    println("Phép chia cách 1:" + a + "/" + b + "=" + (a / b))
    println("Phép chia cách 2:" + a + "/" + b + "=" + (a.div(b)))
    println("Lấy dư cách 1:" + a + "/" + b + "=" + (a % b))
    println("Lấy dư cách 2:" + a + "/" + b + "=" + (a.rem(b)))
    println(8.plus(9))

/*
    3. Toán tử gán:
    =	 Phép gán giá trị bên phải cho biến bên trái dấu bằng	 x=5
    +=	 Cộng và gán	x=2 x+=5 ==>x=7  (x=x+5)
    -=	 Trừ và gán	    x=2 x-=5 ==>x=-3 (x=x-5)
    *=	 Nhân và gán	x=2 x*=5 ==>x=10 (x=x*5)
    /=	 Chia và gán	x=7 x/=5 ==>x=1  (x=x/5)
    %=	 Chia lấy dư	x=7 x%=5 ==>x=2  (x=x%5)
*/
    println("3. Toán tử gán:")
    var x: Int = 5
    x += 2
    println("x=" + x)
    x -= 2
    println("x=" + x)
    x *= 2
    println("x=" + x)
    x /= 2
    println("x=" + x)
    x = 7
    x %= 3
    println("x=" + x)

/*
    4. Toán tử So sánh:
    ==	So sánh bằng	a.equals(b)	5 == 5 => kết quả True
    !=	So sánh không bằng	!a.equals(b)	5 != 5  => kết quả False
    <	So sánh nhỏ hơn	a.compareTo(b) < 0	5 < 5  => kết quả False
    <=	So sánh nhỏ hơn hoặc bằgg	a.compareTo(b) <= 0	5 <= 5 => kết quả True
    >	So sánh lớn hơn	a.compareTo(b) > 0	5 > 5.5 => kết quả False
    >=	So sánh lớn hơn hoặc bằng	a.compareTo(b) >= 0	113>= 5 => kết quả True
*/
    println("4. Toán tử So sánh:")
    a=8;b=5
    println(a==b)
    println(a.equals(b))
    println(!a.equals(b))
    println(a.compareTo(b))
    println(3.compareTo(3))
    println(3.compareTo(5))
    println(5.compareTo(3))

    a=5;b=8;c=2
    a-- //4
    b++ //9  5 + 10 - 1 + 7
    var z= a++ + ++b - --c + 7


    println("a++="+a++)
    println("++a="+ ++a)
    println("b="+ ++b)
    println("c="+c)
    println("z="+z)
}