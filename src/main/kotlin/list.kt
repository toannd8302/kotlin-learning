import java.util.Scanner
import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello List!")
    //1. Khai báo MutableList
    var ds1: MutableList<Int> = mutableListOf()
    println(ds1::class.java.typeName) //java.util.ArrayList
    //2. Khai báo List (read only)
    var ds2: List<Int> = listOf()
    println(ds2::class.java.typeName) //kotlin.collections.EmptyList

    //3. Khởi tạo
    var ds3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("ds3: $ds3")
    var ds4: List<Int> = listOf(4, 5, 6, 7)
    println("ds4: $ds4")

    //4.Duyệt mảng
    for (i in ds3.indices) { //ds3.indices (0<ds3<Length) => duyệt qua từng phần tử
        print("${ds3[i]}\t")
    }
    println()
    //Các phần tử chia hết cho 2
    for (i in ds3.indices) {
        if (ds3[i] % 2 == 0) {
            print("${ds3[i]}\t")
        }
    }
    println()
    //Thao tác với mảng
    //kiểm tra size
    var ds6: MutableList<Int> = mutableListOf(2, 3, 4)
    println(ds6.size)//3
    //add 1 phần tử vào vị trí cuối cùng
    ds6.add(7)

    println(ds6)//[2, 3, 4, 7]
    //add 1 phần tử vào 1 vị trí bất kì chỉ định
    ds6.add(2, 8)
    println(ds6) //[2, 3, 8, 4, 7]
    //addAll
    ds6.addAll(mutableListOf(5, 5, 5)) //thêm vào cuối
    println("$ds6 sau khi addAll(mutableListOf(5,5,5)")
    //[2, 3, 8, 4, 7, 5, 5, 5]
    ds6.addAll(2, mutableListOf(6, 7, 8))
    println("$ds6 sau khi addAll(2,mutableListOf(6,7,8)")
    //[2, 3, 6, 7, 8, 8, 4, 7, 5, 5, 5]
    //removeAt => Xóa tại 1 vị trị chỉ định
    ds6.removeAt(1)
    println("$ds6 sau khi removeAt(1)") //[2, 6, 7, 8, 8, 4, 7, 5, 5, 5] sau khi removeAt(1)

    //remove xóa phần tử đầu tiên trùng khớp
    ds6.remove(5)
    println("$ds6 sau khi remove(5)") //[2, 6, 7, 8, 8, 4, 7, 5, 5] sau khi remove(5)
    //sort tăng dần
    ds6.sort()
    println("$ds6 sau khi sort") //[2, 4, 5, 5, 6, 7, 7, 8, 8] sau khi sort
    //sort giảm dần
    ds6.sortDescending()
    println("$ds6 sau khi sortDescending") //[8, 8, 7, 7, 6, 5, 5, 4, 2] sau khi sortDescending
    //filter lọc ra các phần tử thỏa mãn điều kiện rồi đẩy vào 1 mảng mới
    var ds7 = ds6.filter { x -> x > 5 }
    //[8, 8, 7, 7, 6] sau khi filter x>5
    println("$ds7 sau khi filter x>5")
    //contains => Kiểm tra list có chứa phần tử đó hay không có thì true không thì false
    println(ds6.contains(8))//true

    //clear => xóa sạch List
    ds6.clear()
    println("List $ds6 sau khi đã clear")

    println("================================Bài tập================================")
    //Tạo 1 List có n phần tử nhập từ bàn phím & cac phần tử là số [1-100]
    var n:Int=0
    var sc:Scanner = Scanner(System.`in`)
    println("Xin mời nhập số phần tử mảng")
    n = sc.nextInt()
    var random = Random
    var list:MutableList<Int> = MutableList(n){
        random.nextInt(1,100)
    }
    for (i in list.indices){
        print("${list[i]}\t")
    }

}