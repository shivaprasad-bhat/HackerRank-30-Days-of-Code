package day8

/**
 * @author shivaprasadbhat
 */
fun main(args: Array<String>) {
    val map = mutableMapOf<String, Int>()

    val n = readLine()!!.trim().toInt()

    for(i  in 1..n) {
        var arr: List<String> = readLine()!!.trim().split(" ")
        map.put(arr[0], arr[1].toInt())
    }

    var query = readLine()
    do {
        if(map.containsKey(query)) {
            println("$query=${map.get(query)}")
        } else {
            println("Not found")
        }
        query = readLine()
    }while(query != null)

}
