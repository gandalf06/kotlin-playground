/* 
 *  Enum (Enumeração) -> é um tipo de dados que ciste em um conjunto de costantes
 */
enum class StatusPedido{
    	PROCESSANDO, APROVADO, REPROVADO
}
class Pedido{
    var status: StatusPedido = StatusPedido.PROCESSANDO
}
fun main(args: Array<String>){
    val pedido = Pedido()
    if(pedido.status == StatusPedido.PROCESSANDO){
        println("Pedido está sendo processado!")
    }else if(pedido.status == StatusPedido.APROVADO){
        println("Pedido foi aprovado!")
    }
}
