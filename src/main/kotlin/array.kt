import java.util.Random
import java.util.Scanner

fun main(args: Array<String>) {
    //1. Khai bao Array
    var M: IntArray = IntArray(5)
    var M2: FloatArray = FloatArray(3)
    println(M::class.java.typeName)
    //2. Duyet mang
    for (i in M) {
        print("$i\t")
    }
    println()
    //3. khoi tao gia tri
    var M3: IntArray = intArrayOf(1, 2, 3, 5, 7)
    for (i in M3) {
        print("$i\t")
    }
    println()
    //4. Truy xuat qua index
    print(M3[0])
    print(M3[1])
    print(M3[2])
    println()
    M3[0] = 99
    M3[1] = 100
    println("Mảng M3 sau khi thay đổi là: ")

    for (i in M3) {
        print("$i\t")
    }
    println()
    //Todo: mảng giá trị ngẫu nhiên
    var rd = kotlin.random.Random
    var M7: IntArray = IntArray(6)
    //chạy từ 0->size-1
    print(M7.indices)

    for (i in M7.indices)// =0..5
    {
        M7[i] = rd.nextInt(101)
    }
    println()
    //maảng M7 ngẫu nhiên là
    println("Mảng M7 sau khi thay đổi")
    for (i in M7)// =0..5
    {
        print("$i\t")
    }
    println()
    println("Số phần tử của mảng là: " + M7.size)

    //phep gán mảng
    var M9 = arrayOf(1, 2, 3, 4)
    var M10 = M9 // truy cập vào cùng 1 ô nhớ => thay đổi M9 => M10 thay đổi
    M9[0] = 113
    println(M9[0])
    println(M10[0])

    //clone mảng
    var M11 = arrayOf(5, 6, 7)
    var M12 = M11.clone()
    // thay đổi giá trị M11 => M12 không thay đổi
    M11[0] = 111

    println(M11[0])
    println(M12[0])

    //Đảo ngược mảng
    var M13 = arrayOf(10, 11, 12)
    M13.reverse()
    for (i in M13) {
        print("$i\t")
    }
    println()
    //Sắp xếp tăng dần
    M7.sort(); //M7 là mảng ngẫu nhiên
    for (i in M7) {
        print("$i\t")
    }
    println()
    //Sắp xếp giảm dần
    M7.sortDescending(); //M7 là mảng ngẫu nhiên
    for (i in M7) {
        print("$i\t")
    }
    //Trích lọc mảng theo điều kiện
    var M14 = arrayOf(1, 3, 5, 7, 8, 10)
    var filer = M14.filter { x -> x % 2 == 0 }
    println()
    println(filer)

    //Max Min
    var M15 = arrayOf(5, 7, 8, 100, 88, 99)
    M15.sort()
    for (i in M15) {
        print("$i\t")
    }
    println()
    println("Min = " + M15.first()) //M15[0]
    println("Max = " + M15.last()) //M15[M15.size-1]




}

