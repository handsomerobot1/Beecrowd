//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {

    val input1 = readLine()!!.split(" ")
    val code1 = input1[0].toInt()
    val units1 = input1[1].toInt()
    val price1 = input1[2].toDouble()

    val input2 = readLine()!!.split(" ")
    val code2 = input2[0].toInt()
    val units2 = input2[1].toInt()
    val price2 = input2[2].toDouble()

    val total = (units1 * price1) + (units2 * price2)


    println("VALOR A PAGAR: R$ %.2f".format(total))
}
