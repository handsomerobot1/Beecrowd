
import java.util.Scanner
import kotlin.math.sqrt
import kotlin.math.pow
fun main(args: Array<String>) {
    val input= Scanner(System.`in`)
    val x1=input.nextDouble()
    val y1=input.nextDouble()
    val x2=input.nextDouble()
    val y2=input.nextDouble()
   val fuelNeeded= sqrt((x2-x1).pow(2)+(y2-y1).pow(2))

}