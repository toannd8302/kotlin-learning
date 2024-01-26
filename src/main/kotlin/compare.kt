fun main(args: Array<String>) {
    var soA = 6
    var soB = 4
    //so sánh thông thường
    println(soA == soB)
    println(soA != soB)
    println(soA > soB)
    println(soA < soB)
    println(soA >= soB)
    println(soA <= soB)

    println("--------------------------------------------------------------------")
    //so sánh = phương thức
    println(soA.equals(soB) )
    println(!soA.equals(soB))
    // a<b => <0 (a-b)
    //a>b => >0
    // a= b => =0
    println(soA.compareTo(soB))
    println(soA.compareTo(soB)>0)
    println(soA.compareTo(soB)==0)
    println(soA.compareTo(soB)>=0)



}