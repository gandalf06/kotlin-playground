fun main(args: Array<String>){
    /* Definindo um Array 
     * Utilizar a fun do Kotlin arrayOf(valores)
     * */
    var nomes = arrayOf("Darlan", "Oliveira", "Silva")
    
    /* 
     * Alterando valor do Array
     */
    // nomes[1]= "Schwarzenegger"
    
    println(nomes[1])
    
    /*
     * Tipos de Array
     * Só acetarar valores do tipo definido
     * Ex: var numeros = intArrayOf(10,20,30)
     * err: var numeros = intArrayOf("Darlan",20,30)
     */
    
     var numeros = intArrayOf(10,20,30)
    print(numeros[1])
    
}
