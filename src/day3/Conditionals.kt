package day3


fun main(args: Array<String>) {
    val N = readLine()!!.trim().toInt()

    if( N % 2 != 0 ) {
        println("Weird")
    } else {
        when (N) {
            in 2..5 -> {
                println("Not Weird")
            }
            in 6..20 -> {
                println("Weird")
            }
            else -> {
                println("Not Weird")
            }
        }
    }
}
