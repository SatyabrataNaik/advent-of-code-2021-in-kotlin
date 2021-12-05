import java.io.File

fun main() {
    val input : List<String> = File("in").readLines()
    var oxygen = ""
    var carbon = ""
    val len = input[0].length
    for (i in 0 until len) {
        var cnt1 = 0
        var cnt0 = 0
        for (str in input) {
            if (str[i] == '1') {
                cnt1 += 1
            } else {
                cnt0 += 1
            }
        }
        oxygen += if (cnt1 >= cnt0) '1' else '0'
        carbon += if (cnt1 <= cnt0) '1' else '0'
    }
    print(oxygen.toInt(2) * carbon.toInt(2))
}