import java.io.File

fun main() {
    val input : List<String> = File("in").readLines()
    var oxygen = ""
    var carbon = ""
    val len = input[0].length
    var list1 = input.toMutableList()
    var list2 = input.toMutableList()

    for (i in 0 until len) {
        if (list1.size == 1) {
            break
        }
        var cnt1 = 0
        var cnt0 = 0
        for (str in list1) {
            if (str[i] == '1') {
                cnt1 += 1
            } else {
                cnt0 += 1
            }
        }
        var choose = if (cnt1 >= cnt0) '1' else '0'
        var newlist1 = mutableListOf<String>()
        for (str in list1) {
            if (str[i] == choose) {
                newlist1.add(str)
            }
        }
        list1 = newlist1
    }

    for (i in 0 until len) {
        if (list2.size == 1) {
            break
        }
        var cnt1 = 0
        var cnt0 = 0
        for (str in list2) {
            if (str[i] == '1') {
                cnt1 += 1
            } else {
                cnt0 += 1
            }
        }
        var choose = if (cnt0 <= cnt1) '0' else '1'
        var newlist2 = mutableListOf<String>()
        for (str in list2) {
            if (str[i] == choose) {
                newlist2.add(str)
            }
        }
        list2 = newlist2
    }
    print(list1[0].toInt(2) * list2[0].toInt(2))
}