import java.io.File

fun main() {
    val input : List<String> = File("in").readLines()
    var x = 0
    var y = 0
    for (line in input) {
        var (com, strx) = line.split(" ").map { it.trim() }
        var intx = strx.toInt()
        when (com) {
            "forward" -> {
                x += intx
            }
            "down" -> {
                y += intx
            }
            "up" -> {
                y -= intx
            }
            else -> {
                assert(false)
            }
        }
    }
    println(x * y)
}