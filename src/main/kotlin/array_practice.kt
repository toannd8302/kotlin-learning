import java.util.*

fun main(args: Array<String>) {
    //TODO: BT
    //B1: Nhập số lượng phần tử mảng
    val scanner = Scanner(System.`in`)
    var n: Int;
    println("Nhập số lượng pần tử của mảng:")
    n = scanner.nextInt();
    var array = IntArray(n)
    //B2: Tạo các phần tử ngẫu nhiên
    var rd1 = kotlin.random.Random
    //println(array.size)
    //Nếu thiếu indices la sai logic
    for (i in array.indices) {

        array[i] = rd1.nextInt(n + 20)
    }
    println()
    //B3: Xuất các giá trị trong mảng
    println("Giá trị các phần tử trong mảng:")
    for (i in array) {
        print("$i\t")
    }
    println()
    //B4: Đảo ngược + xuất mảng sau đảo ngược
    array.reverse()
    println("Mảng sau khi đã đảo ngược:")
    for (i in array) {
        print("$i\t")
    }
    println()
    //B5.Sắp xếp mảng tăng dần
    array.sort()
    println("Mảng sau khi đã sắp xếp tăng dần")
    for (i in array) {
        print("$i\t")
    }
    println()
    //B6. Tính tổng các pần tử trong mảng
    var sum: Int = 0
    for (i in array) {
        sum += i

    }
    println("tổng = " + sum)
    //B7: Kiểm tra sự tồn tại của phần tử trong mảng
    var checkInt: Int
    var checkPos: Int=0
    var checkFlag: Boolean = false
    println("Mời nhập vào giá trị cần kiểm tra: ")
    checkInt = scanner.nextInt()
    for (i in array.indices) {
        if (checkInt == array[i]) {
            checkPos = i
            checkFlag = true

        } else {

            checkFlag
        }
    }
    if (checkFlag) {
        //Chưa giải quyết vấn đề giá trí có thể nằm trên nhiều index => ghi đè giá trị cuối cùng search ra được
        println("Giá trị $checkInt tồn tại trong array tại index thứ $checkPos")
    } else {

        println("Giá trị $checkInt không tồn tại trong array")
    }
}