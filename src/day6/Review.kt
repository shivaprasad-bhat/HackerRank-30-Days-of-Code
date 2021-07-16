package day6

/**
 * @author shivaprasadbhat
 */
fun main(args: Array<String>) {
    val t: Int = readLine()!!.trim().toInt()
    val list = arrayListOf<String>()
    for (i in 1..t) {
        list.add(readLine()!!)
    }

    for (word in list) {
        for (j in word.indices step 2) {
            print(word[j])
        }
        print(" ")
        for (i in 1 until word.length step 2) {
            print(word[i])
        }
        println()
    }

}
