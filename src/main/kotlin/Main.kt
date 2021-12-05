import java.io.File

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val input : String = File("in").readText()
    val input2 : List<String> = File("in").readLines()

    println(input)
    println(input2)
    val sanitized : String = "   5-6-7 ".trim() //"5-6-7"
    val numbers : List<Int> = sanitized.split("-").map { it.toInt() }
    print(numbers)
}