import java.io.File

fun main() {
    val input2 : List<String> = File("in").readLines()
    val nums : List<Long> = input2[0].trim().split(",").map { it.toLong() }
    var mymap : MutableMap<Long, Long> = mutableMapOf()
    for (x in nums) {
        add(mymap, x, 1)
    }
    val days = 256
    for (i in 1..days) {
        var newmap : MutableMap<Long, Long> = mutableMapOf()
        for (x in mymap.keys) {
            if (x == 0.toLong()) {
                add(newmap, 6, mymap[x]!!)
                add(newmap, 8, mymap[x]!!)
            } else {
                add(newmap, x - 1, mymap[x]!!)
            }
        }
        mymap = newmap
    }
    var ans = 0.toLong()
    for (x in mymap.keys) {
        ans += mymap[x]!!
    }
    print(ans)
}

