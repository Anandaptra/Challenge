interface Bentuk {
    fun mnggmbr()
}

class Segtga(private val jmlh: Int) : Bentuk {
    override fun mnggmbr() {
        for (i in 0 .. jmlh) {
            for (j in 0 .. jmlh - i) {
                print(" ")
            }
            for (k in 0 .. 2 * i) {
                print("*")
            }
            println()
        }
    }
}

class Gambar(private val bentuk: Bentuk) {
    fun gmbrBentuk() {
        bentuk.mnggmbr()
    }
}

fun main() {
    val jmlh = 7
    val segtga = Segtga(jmlh)
    val gambar = Gambar(segtga)
    gambar.gmbrBentuk()
}