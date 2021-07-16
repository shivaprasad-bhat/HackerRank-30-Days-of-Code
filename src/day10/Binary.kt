package day10

fun main(args: Array<String>) {
    var n = readLine()!!.trim().toInt()

    // To Store Binary
    val bin = arrayListOf<Int>()
    var count = 0


    var counts = arrayListOf<Int>()

    while(n > 0) {
        bin.add(n%2)
        n/= 2
    }

    println("Binary of 125 is $bin")

    for (i in bin) {
        if (i == 1) {
            count++
            println("Count: $count")
        } else {
            counts.add(count)
            count = 0
            println("Count: $count")
        }
    }

    /**
     * This will execute if last element is 1
     * if last element is 1, the latest count will not be added to the counter list as per the logic
     * because previous counter will be added when element is 0.
     * if counter value > 0 after iteration, that will be the latest count
     */
    if(count != 0) {
        counts.add(count)
    }


    println(counts.maxOrNull())

}