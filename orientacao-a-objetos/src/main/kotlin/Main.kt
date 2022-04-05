fun main(){
    println("Bem vinde ao ByteBank!")

    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
    

//    var i = 0
//    while(i < 5){
//        val titular = "Thais $i"
//        val numeroConta = 1000 + i
//        var saldoConta = i + 0.0
//        i++
//
//        println("Titular da Conta: $titular")
//        println("Número da Conta: $numeroConta")
//        println("Saldo Atual da Conta: $saldoConta")
//        println()
//    }


//    for(i in 5 downTo 1){
//
//        if(i == 4) {
//            continue
//        }
//
//        val titular = "Thais $i"
//        val numeroConta = 1000 + i
//        var saldoConta = i + 0.0
//
//
//        println("Titular da Conta: $titular")
//        println("Número da Conta: $numeroConta")
//        println("Saldo Atual da Conta: $saldoConta")
//        println()
//
//        testaCondicoes(saldoConta)
//    }
}


fun testaCondicoes(saldoConta: Double){
//    if (saldoConta > 0.0) {
//        println("A conta é positiva!")
//    } else if (saldoConta == 0.0) {
//        println("A conta é neutra!")
//    } else {
//        println("A conta é negativa!")
//    }

    when {
        saldoConta > 0.0 -> println("A conta é positiva!")
        saldoConta == 0.0 -> println("A conta é neutra!")
        else -> println("A conta é negativa!")
    }
}


