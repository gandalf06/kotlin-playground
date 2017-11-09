/*
 * Set -> não permite elementos duplicados, é mais rapido que o ArrayList ,
   não mantem a ordem dos elementos
 * Map -> é uma implementação de chave/valor
*/
fun main(args: Array<String>){
   
    /* Usando SET */
    //var itens = hashSetOf("a","b","c","c")
   var itens = hashSetOf(10,20,30,40,50)
   println(itens)
    
    for(item in itens){
        println(item)
    }
    
    /* Usando MAP */
    var map = hashMapOf(
    	"urso" to "Animal que hiberna",
        "cao" to  "Melhor amigo do homem"
    )
    
    map.put("passaro", "Gosta de voar") // adicionando
   // map.remove("passaro", "Gosta de voar") // removendo
    
    
    for(item in map){
        println(item)
    }
}
