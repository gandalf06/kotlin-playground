class Casa{
    var cor: String = ""
    
    fun abrirJanela(qtdJanelas: Int){
        println("Abrir Janela total: $qtdJanelas")
    }
    fun abrirPorta(qtdPortas: Int){
        println("Abrir Porta total: $qtdPortas")
    }
    fun abrirCasa(qtdJanelas: Int,qtdPortas: Int){
        this.abrirJanela(qtdJanelas)
        this.abrirPorta(qtdPortas)
    }
}
fun main(args: Array<String>){
   
    val casa = Casa()
    casa.cor = "Azul"
    println(casa.cor)
    casa.abrirCasa(10,20)
    
   /* val casa2 = Casa()
    casa2.cor = "Verde"
    println(casa2.cor)*/
    
}
