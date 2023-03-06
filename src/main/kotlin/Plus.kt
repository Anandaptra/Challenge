fun plus(jumlah: Int) {
    for (i in 0 until jumlah) {
        for (j in 0 until jumlah) {
            if (i == jumlah / 2 || j == jumlah / 2) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }
}

fun main() {
    val jumlah = 11
    plus(jumlah)
}