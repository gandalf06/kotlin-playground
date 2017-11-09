/*
	* Tipos de Collections
    - List -> imutavel, tamanho fixo, apenas para leitura
    - ArrayList -> Mutavel, sem tamanho fixo, pode adicionar ou remover 
*/

fun main(args: Array<String>){
	var listaEstados = listOf("SP","CE","MG", "RJ")
    println(listaEstados)
    
    var listaItens = arrayListOf("SP","CE","MG", "RJ")
    listaItens.add("BA")
    listaItens.remove("SP") // ou removeAt(indice) 
    
}
