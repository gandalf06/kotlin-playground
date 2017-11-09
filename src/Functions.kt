   	
   	/* 
     * Funções sem retorno 
     * Pode receber parametros mais não retorna nada 
     */

	fun exibirMensagem(nome:String){
         print("Alerta, você não preencheu todos os dados! $nome") 
    }
    fun somar(numero1: Int, numero2: Int){
        var total = numero1 + numero2
        println(total)
    }

    /*
     * Funções com retorno
     * Pode receber parametros e retorna um resultado
     */
    fun somarReturn(numero1: Int, numero2: Int): Int{
        var total = numero1 + numero2
        return total
    }
fun main(args: Array<String>){
    //exibirMensagem("Darlan")
    //somar(2,2)
     var resultado = somarReturn(3,3)
     println(resultado)
}
