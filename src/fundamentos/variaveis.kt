package fundamentos


fun main() {
    var nomeVar = "thais"
    val nomeVal = "ThaisVal" //this var can't be change (val)

    nomeVar = "thais var"

    println("$nomeVal $nomeVar")
}

class variaveis {
    lateinit var exemplo : String

    fun iniciaVaraiveis(){
        exemplo = "Teste Variavel"
    }
}