fun main() {
    /* 1 - Crie um programa onde o usuário digite as notas referente a 4 bimestres e calcule a média. No final, verifique a situação do aluno com base nesses dados:

    - Reprovado se a média for 4 ou menos
    - Regular se a média for maior que 4 e menor ou igual a 5
    - Boa se a média for maior do que 5 e menor ou igual a 8
    - Excelente se a média for maior do que 8 e menor ou igual a 10
    - Se a média der um número negativo ou uma nota fora da escala de 0 a 10, deverá ser printado média inválida */

    println("Digite sua primeira nota")
    var nota1 = readLine()!!.toDouble()
    println("Digite sua segunda nota")
    var nota2 = readLine()!!.toDouble()
    println("Digite sua primeira nota")
    var nota3 = readLine()!!.toDouble()
    println("Digite sua primeira nota")
    var nota4 = readLine()!!.toDouble()

    var nota = nota1 + nota2 + nota3 + nota4

    val media = nota / 4

    if (media <= 4) (
            println("Reprovado")
            )
    if (media > 5 && media <= 8) {
        println("Sua nota está classificada como boa!")
    } else if (media > 8 && media <= 10) {
        println("Parabens!, Sua nota esta classificada como excelente")
    } else {
        (media > 10)
        println("Média inválida")
    }

}
