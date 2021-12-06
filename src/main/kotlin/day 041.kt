import java.io.File

fun main() {
    val input2 : List<String> = File("in").readLines()
    val order : List<Int> = input2[0].trim().split(",").map { it.toInt() }

    var lineNum = 1
    var grids : MutableList<MutableList<MutableList<Int>>> = mutableListOf()
    while (lineNum < input2.size) {
        if (input2[lineNum].length > 2) {
            var grid = mutableListOf<MutableList<Int>>()
            for (i in 0..4) {
                grid.add((input2[lineNum + i].trim().split("  ", " ").map { it.trim().toInt() }).toMutableList())
            }
            grids.add(grid)
            lineNum += 5
        } else {
            lineNum += 1
        }
    }

    var found = false
    for (x in order) {
        for (id in 0 until grids.size) {
            if (mark(grids, id, x)) {
                var ans = 0
                for (i in 0 until 5) {
                    for (j in 0 until 5) {
                        if (grids[id][i][j] != -1) {
                           ans += grids[id][i][j]
                        }
                    }
                }
                found = true
                println(ans * x)
            }
            if (found) break
        }
        if (found) break
    }
}

private fun mark(grids: MutableList<MutableList<MutableList<Int>>>, id: Int, x: Int): Boolean {
    for (i in 0 until 5) {
        for (j in 0 until 5) {
            if (grids[id][i][j] == x) {
                grids[id][i][j] = -1
            }
        }
    }
    var rowFound = false
    var colFound = false
    for (i in 0 until 5) {
        var allOne = true
        for (j in 0 until 5) {
            if (grids[id][i][j] != -1) allOne = false
        }
        if (allOne) rowFound = true
    }

    for (j in 0 until 5) {
        var allOne = true
        for (i in 0 until 5) {
            if (grids[id][i][j] != -1) allOne = false
        }
        if (allOne) colFound = true
    }

    return rowFound or colFound
}
