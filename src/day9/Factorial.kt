package day9


fun factorial(n: Int): Int {
    return if(n >= 1) {
        n * factorial(n - 1)
    } else {
        1
    }

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = factorial(n)

    println(result)
}
