package day2

/**
 * @author shivaprasad bhat
 */
fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {
    val tip: Double = meal_cost * (tip_percent/100.0)
    val tax: Double = meal_cost * (tax_percent/100.0)
    val total: Long = Math.round(meal_cost+tip+tax)
    println(total.toInt())
}

fun main(args: Array<String>) {
    val meal_cost = readLine()!!.trim().toDouble()

    val tip_percent = readLine()!!.trim().toInt()

    val tax_percent = readLine()!!.trim().toInt()

    solve(meal_cost, tip_percent, tax_percent)
}
