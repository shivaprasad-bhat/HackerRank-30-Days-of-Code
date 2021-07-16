package day7

/**
 * @author shivaprasadbhat
 */
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    for(i in arr.indices.reversed()) {
        print("${arr[i]} ")
    }
}
