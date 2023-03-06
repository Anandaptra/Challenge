//1
//interface Bentuk {
//    fun mnggmbr()
//}
//
//class Segtga(private val jmlh: Int) : Bentuk {
//    override fun mnggmbr() {
//        for (i in 0 .. jmlh) {
//            for (j in 0 .. jmlh - i) {
//                print(" ")
//            }
//            for (k in 0 .. 2 * i) {
//                print("*")
//            }
//            println()
//        }
//    }
//}
//
//class Gambar(private val bentuk: Bentuk) {
//    fun gmbrBentuk() {
//        bentuk.mnggmbr()
//    }
//}
//
//fun main() {
//    val jmlh = 7
//    val segtga = Segtga(jmlh)
//    val gambar = Gambar(segtga)
//    gambar.gmbrBentuk()
//}

//2
//open class Segitiga(val jumlah: Int) {
//    open fun sgt() {
//        for (i in jumlah downTo 1) {
//            for (j in 1..jumlah - i) {
//                print(" ")
//            }
//            for (k in 1..2 * i - 1) {
//                print("*")
//            }
//            println()
//        }
//    }
//}
//
//fun main() {
//    val segitiga = Segitiga(8)
//    segitiga.sgt()
//}

//3
//fun belahKetupat(ketupat: Int) {
//    for (i in 1..ketupat) {
//        for (j in 1..ketupat - i) {
//            print(" ")
//        }
//        for (k in 1..2 * i - 1) {
//            print("*")
//        }
//        println()
//    }
//    for (i in ketupat - 1 downTo 1) {
//        for (j in 1..ketupat - i) {
//            print(" ")
//        }
//        for (k in 1..2 * i - 1) {
//            print("*")
//        }
//        println()
//    }
//}
//
//fun main() {
//    val ketupat = 8
//    belahKetupat(ketupat)
//}

//4
//fun ex (bentuk : Int ) {
//    for (i in 1..bentuk) {
//        for (j in 1..bentuk) {
//            if (i == j || i + j == bentuk + 1) {
//                print("*")
//            } else {
//                print(" ")
//            }
//        }
//        println()
//    }
//}
//fun main() {
//    val bentuk = 17
//    ex(bentuk)
//}

//5
//fun main() {
//    val jmlah = 9
//    sgtg(jmlah)
//}
//

//fun sgtg(jmlah: Int) {
//    var k = 0
//    for (i in 1..jmlah) {
//        for (space in 1..jmlah- i) {
//            print("")
//        }
//        while (k != 1 * i - 1) {
//            print("*")
//            ++k
//        }
//        println()
//        k = 0
//    }
//}
//
