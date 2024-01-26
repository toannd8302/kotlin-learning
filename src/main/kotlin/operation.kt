fun main(args: Array<String>) {
    var i1:Int = 2
    var i2:Int = 5
    var i3:Int = -3
    var d1:Float = 2.0f
    var d2: Float = 5.0f
    var d3: Float = -0.5f
    //b) i1 *(i2+i3)
   println("Cach 1: " + (i1 + (i2*i3)))
    println("Cach 2: " + (i1.plus(i2.times(i3))))

    //c)i1/(i2+i3)
    println("Cach 1: " + (i1.toFloat() / (i2*i3)))
    println("Cach 2: " + (i1.toFloat().div(i2.times(i3))))

    //3 * (d1 + d2) * (d1-d3)
    println("Cach 1: " + (3 * (d1+d2) * (d1-d3)))
    println("Cach 2: " + (3.times (d1.plus(d2)) .times (d1.minus(d3))))

    // 5%2 = 1
    println("Cach 1: " + i2%i1)
    println("Cach 2: " + i2.rem(i1))

    // Toán tử + - 1 ngôi (đảo dấu) => Số đối
    var x: Float = 9.2f
    var y  = x.unaryMinus()
    println("x = " + x)
    println("y = " + y)

    var z: Float = y.unaryMinus()
    println("z = " + z)
}