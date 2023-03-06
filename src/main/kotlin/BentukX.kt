fun ex (bentuk : Int ) {
    for (i in 1..bentuk) {
        for (j in 1..bentuk) {
            if (i == j || i + j == bentuk + 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}
fun main() {
    val bentuk = 17
    ex(bentuk)
}