fun belahKetupat(ketupat: Int) {
    for (i in 1..ketupat) {
        for (j in 1..ketupat - i) {
            print(" ")
        }
        for (k in 1..2 * i - 1) {
            print("*")
        }
        println()
    }
    for (i in ketupat - 1 downTo 1) {
        for (j in 1..ketupat - i) {
            print(" ")
        }
        for (k in 1..2 * i - 1) {
            print("*")
        }
        println()
    }
}

fun main() {
    val ketupat = 8
    belahKetupat(ketupat)
}