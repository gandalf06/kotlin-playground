
fun main(args: Array<String>) {
    
    // var para variável mutável
    var firstname = "Darlan Oliveira"
    firstname = "Darlan"
    println(firstname)
    
    // val para variáveis imutável 
    val lastname = "Oliveira"
    //lastname = "Silva" Não permitido 
    println(lastname)
    
    var fullname = firstname+" "+lastname
    println("Olá¡ $fullname")
}
    
