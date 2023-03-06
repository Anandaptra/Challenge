fun main() {
    val jmlah = 9
    sgtg(jmlah)
}


fun sgtg(jmlah: Int) {
    var k = 0
    for (i in 1..jmlah) {
        for (space in 1..jmlah- i) {
            print("")
        }
        while (k != 1 * i - 1) {
            print("*")
            ++k
        }
        println()
        k = 0
    }
}