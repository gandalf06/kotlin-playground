class Casa(cor:String, vagasGaragem: Int){
    var cor: String 
    var vagasGaragem: Int 

   /*
     * Construtor Primario 
     * Pode ser utildao sem instaciamento do variaveis pode ser passada direto no parametro
     * Ex: Casa/*(var cor:String, var vagasGaragem: Int)*
     * removendo as var da linha 2 var cor: String  e 3 var vagasGaragem: Int 
   */
   
    init{
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }
  /*
     * Construtor Secundario 
     * Implementado da mesma forma com java 
     *
  */   
    constructor(cor:String, vagasGaragem: Int){
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }
    fun abrirJanela(qtdJanelas: Int){
        println("Abrir Janela total: $qtdJanelas")
    }
    fun abrirPorta(qtdPortas: Int){
        println("Abrir Porta total: $qtdPortas")
    }
    
    fun detalhesCasa(){
        println("Cor da casa: $cor , quantitdade de vagas na garagem: $vagasGaragem")
    }
    
    fun abrirCasa(qtdJanelas: Int,qtdPortas: Int){
        this.abrirJanela(qtdJanelas)
        this.abrirPorta(qtdPortas)
    }
}

fun main(args: Array<String>){
   
    val casa = Casa("Amarelo", 5)
   	
    casa.detalhesCasa()
    println(casa.cor)
    casa.abrirCasa(10,20)
}
