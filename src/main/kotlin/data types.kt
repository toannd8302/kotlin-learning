fun main(args: Array<String>) {
    //khởi tạo biến
    var soA:Int = 64
    var soB:Short = 5

    println("Giá trị của A = " + soA)
    println("Giá tri so B = $soB")

    //khai báo tường minh
    var y:Double = 8.5

    //khai báo không tường minh
    var z = 10.76

    var f:Float = 7.5F
    //TODO: Xuất ra kiểu dữ liệu
    println("Kiểu dữ liệu của y là:　" + (y::class.java.typeName))
    println("Kiểu dữ liệu của z là: " + (z::class.java.typeName))
    println("Kiểu dữ liệu của f là: " + (f::class.java.typeName))

    //Kiểu số nguyên
    var soE:Int = 15
    var soF = 10
    println("Kiểu dữ liệu của SoE là: " + (soE::class.java.typeName))
    println("Kiểu dữ liệu của soF là: " + (soF::class.java.typeName))
        //kiểu LONG
    var soG:Long = 12L  // var soE:Int = 12l => ERROR
    var soH = 4L
    println("Kiểu của soG la: " + (soG::class.java.typeName))
    println("Kiểu của soH là : " + soH::class.java.typeName)

    //khai báo kí tự
    var kyTu:Char = 'a'
    println("Kiểu của kyTu là: ")

    //khai báo kiểu String
    var str1:String = "Hôm nào em cũng học tiếng Nhật"
    var str2 = "a"
    var Str3 = "Hôm nay tôi không có gì để mặc"
    println("Kiểu của str1 là : " + str1::class.java.typeName)
    println("Kiểu của str2 là : " + str2::class.java.typeName)
    println("Kiểu của str3 là : " + Str3::class.java.typeName)
    //khai báo đoạn
    var str4 = """
        Thân em vừa trắng lại vừa tròn
        Bảy nổi ba chìm với nước non
    """
}