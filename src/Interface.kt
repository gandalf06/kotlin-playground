
interface Presidente{
    fun ganharEleicao()
}
interface Pai{
    fun temFilho()
}

open class Cidadao{
    fun direitosDeveres(){
        println("Todo cidadao tem direitos e deveres!")
    }
}
class Obama: Cidadao(),Presidente,Pai{
    override fun ganharEleicao(){
        println("Ganhar eleição no EUA")
    }
    
    override fun temFilho(){
        println("Tem filho")
    }
}
class Darlan: Cidadao(), Presidente{
    override fun ganharEleicao(){
        println("Ganhar eleição no Brasil")
    }
}
fun main(args: Array<String>){
	val darlan =  Darlan()
    darlan.direitosDeveres()
    darlan.ganharEleicao()
    
    val obama = Obama()
	obama.direitosDeveres()
    obama.ganharEleicao()
    obama.temFilho()
    
}
