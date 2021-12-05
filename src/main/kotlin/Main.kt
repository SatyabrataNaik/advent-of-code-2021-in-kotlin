import java.io.File

fun main(args: Array<String>) {
    println("Hello World!")
//    println("Program arguments: ${args.joinToString()}")
//    val input : String = File("in").readText()
//    val input2 : List<String> = File("in").readLines()
//
//    println(input)
//    println(input2)
//    val sanitized : String = "   5-6-7 ".trim() //"5-6-7"
//    val numbers : List<Int> = sanitized.split("-").map { it.toInt() }
//    print(numbers)

    // test mutable lists
    var a = MutableList(5) { _ -> MutableList(5) { _ -> 0 } }
    a.add(mutableListOf(0, 0, 0, 0, 1, 1))
    println(a)
}