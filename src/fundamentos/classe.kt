package fundamentos

class Pessoa (var nome: String, var idade: Int){
    override fun toString(): String {
        return "Classe: Pessoa - ${nome}, ${idade}"
    }
}

fun main (){
    var gustavo = Pessoa("Jose" , 14)
    println(gustavo)
}