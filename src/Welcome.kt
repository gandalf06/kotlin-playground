fun  welcome(name: String, event: String): String{
    return "Hello ${name}, welcome to ${event}!"
}
fun main(args: Array<String>) {
 val result = welcome("Darlan","kotlin")
    println(result)
}