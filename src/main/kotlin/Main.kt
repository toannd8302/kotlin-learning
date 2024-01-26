
fun foo():String{
    println("Calculating Foo...")
    return "foo"
}
fun main(args: Array<String>) {
    // TODO: FIRST PROGRAMING WITH KOTLIN
    println("Hello World")
    val name = if(args.size > 0) args[0] else "Kotlin"

    println("Hello $name")
    println("Hello ${args.getOrNull(0)}" )
    println("First ${foo()}, second ${foo()}")
//    println("Today i leaning Kotlin at the first time")
//    println("\t Todo I fun") //TODO: Thụt vào 1 lần tab
//    println("\t\t Today I sad") // TODO: Thụt vào 2 lần tab
//    print("I want to do \nthis homework\n")// TODO: Xuống dòng
//    println("Có người nói rằng:\"cho đi là còn mãi\"") //TODO: Xuất ra dấu "" trong ""
}