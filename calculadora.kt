fun main() {
    print("Introdueix el primer número: ")
    val n1 = readLine()!!.toDouble()

    print("Introdueix el segon número: ")
    val n2 = readLine()!!.toDouble()

    print("Introdueix l'operació (+, -, *, /): ")
    val op = readLine()

    when (op) {
        "+" -> println("Resultat: ${n1 + n2}")
        "-" -> println("Resultat: ${n1 - n2}")
        "*" -> println("Resultat: ${n1 * n2}")
        "/" -> println("Resultat: ${n1 / n2}")
    }
}
