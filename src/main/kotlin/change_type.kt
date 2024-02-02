fun main(args: Array<String>) {
    //TODO: Ép kiểu từ kiểu bé sang lớn
    var soA:Int = 35
    var soB:Long = soA.toLong()
    println(soA::class.java.typeName)
    println(soB::class.java.typeName)
    println(soA)
    println(soB)
    //TODO: Ép sang kiểu lớn về kiểu bé
    var x:Short = 32767
    var y:Byte = x.toByte()
    println("x = $x" )
    println("y = $y")

}