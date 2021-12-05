import java.io.File

fun main() {
    val input2 : List<String> = File("in").readLines()
    val nums : List<Int> = input2.map { it.trim().toInt() }
    var ans = 0
    val threeSumNums : MutableList<Int> = mutableListOf()
    for (i in 0..nums.size - 3) {
        threeSumNums.add(nums[i] + nums[i + 1] + nums[i + 2])
    }
    for (i in 1 until threeSumNums.size) {
        ans += if (threeSumNums[i] > threeSumNums[i - 1]) 1 else 0
    }
    println(ans)
}