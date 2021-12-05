import java.io.File

fun main() {
    val input2 : List<String> = File("in").readLines()
    val nums : List<Int> = input2.map { it.trim().toInt() }
    var ans = 0
    for (i in 1..nums.lastIndex) {
        ans += if (nums[i] > nums[i - 1]) 1 else 0
    }
    println(ans)
}