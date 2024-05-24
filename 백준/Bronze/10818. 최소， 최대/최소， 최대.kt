import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val arr = readLine().split(" ").map { it.toInt() }
    println("${arr.sorted()[0]} ${arr.sorted()[arr.size - 1]}")
}