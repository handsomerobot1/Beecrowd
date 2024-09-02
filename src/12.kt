import java.util.Scanner

fun main(args: Array<String>) {
  val input = Scanner(System.`in`)
    val A = input.nextFloat()
    val B = input.nextFloat()
    val C = input.nextFloat()
    val pi = 3.14159

    val TRIANGULO=0.5*A*C
    val CIRCULO=pi*C*C
    val TRAPEZIO=0.5*(A+B)*C
    val QUADRADO=B*B
    val RETANGULO=A*B
    println("TRIANGULO: %.3f".format(TRIANGULO))
    println("CIRCULO: %.3f".format(CIRCULO))
    println("TRAPEZIO: %.3f".format(TRAPEZIO))
    println("QUADRADO: %.3f".format(QUADRADO))
    println("RETANGULO: %.3f".format(RETANGULO))
}