import java.util.*
fun main(args: Array<String>) {
    val input= Scanner(System.`in`)
    val x1=input.nextInt()
    val x2=input.nextInt()
    val distance=x1*x2
    val fuelNeeded=distance/12.0
    println("%.3f".format(fuelNeeded))
}