fun main(args: Array<String>) {
    var a1: Boolean = "true".toBoolean()
    println(a1)
    println(a1::class.java.typeName)
    println("----------------------------------------------------------------")
    var a2: Byte = "2".toByte()
    println(a2)
    println(a2::class.java.typeName)
    println("----------------------------------------------------------------")
    var a3: Short = "3".toShort()
    println(a3)
    println(a3::class.java.typeName)
    println("----------------------------------------------------------------")
    var a4: Float = "20.5".toFloat()
    println(a4)
    println(a4::class.java.typeName)
//    println("Mời nhập tên của bạn vào")
//    //Nhập dữ liệu từ bàn phím
//    var ten:String? = readln()
//    println("Ten vua moi nhap la: " + ten)
//    println("Mời bạn nhập vào 1 số nguyên")
//    var soA: Int
//    var soAString:String?  = readln()
//    if(soAString!=null){
//        soA = soAString.toInt()
//        println(soA)
//    }
println("CHƯƠNG TRÌNH TÍNH DIỆN TÍCH VÀ CHU VI CỦA HÌNH TRÒN" )
    //BT nhỏ: tính chu vi, diện tích của hình tròn
    var banKinh: Float
    val pi = 3.14
    println("Mời nhập giá trị bán kính")
    var banKinhString:String? = readln()
    if (banKinhString == null){
        banKinh = 0f
    }
    if(banKinhString!=null){
        banKinh = banKinhString.toFloat()
        var cVi = 2 * pi * banKinh
        var dienTich = pi*banKinh*banKinh
        println("Chu vi = " + cVi)
        println("Diện tích = " + dienTich)
    }


}