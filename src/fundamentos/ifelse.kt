package fundamentos

fun main(){
//    parOrImpar(9)
//    parOrImpar(10)

    resultadoNota(2)
    resultadoNota(9);
}

fun parOrImpar (numero: Int){
    if (numero % 2 == 0 ){
        println("par")
    }else {
        println("impar")
    }
}

fun resultadoNota( nota: Int){
    if(nota >= 6){
        println("passou")
    }else if (  nota >= 4 ){
        println("recuperação")
    }else {
        println("reprovado")
    }
}