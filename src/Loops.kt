/*
 Loops
	while
	for
*/
fun main(args: Array<String>) {
 	
    /*
     while 
    	var numero = 1
    	while(numero < 5){
            println("Executado $numero")
            numero++
        }
    	
    	while(numero > 1){
            println("Executado $numero")
            numero--
        }
    */
    
    /*
    for(numero in 1..5){
         println("Executado $numero")
    }
    */
    val postagens = arrayOf(
    	"Descoberto novo método de tratamento da Diabetes!",
        "Novo curso de Android foi lançado.",
        "Bolsa de valores opera em alta de 2%.",
        "Quer ganhar 1 milhão sem sair de casa!"  
    )
    for( (indice, postagem) in postagens.withIndex()){
        println("$indice - $postagem")
    }
}
