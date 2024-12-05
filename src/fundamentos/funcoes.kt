package fundamentos

fun main (){
    dizOi(retornaNome(), 36);
}

fun dizOi(nome: String, idade: Int) {
    println("Oi ${nome}, parabéns pelos seus ${idade}" )
}

fun retornaNome() : String{
    return "thais M Freitas"
}

