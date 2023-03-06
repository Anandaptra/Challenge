open class Segitiga(val jumlah: Int) {
    open fun sgt() {
        for (i in jumlah downTo 1) {
            for (j in 1..jumlah - i) {
                print(" ")
            }
            for (k in 1..2 * i - 1) {
                print("*")
            }
            println()
        }
    }
}

fun main() {
    val segitiga = Segitiga(8)
    segitiga.sgt()
}