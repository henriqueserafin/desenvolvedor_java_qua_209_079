programa {
  funcao inicio() {
    cadeia nome
    inteiro idade
    real altura

    //entrada de dados
    escreva("Informe seu nome: ")
    leia(nome)
    escreva("Informe sua idade: ")
    leia(idade)
    escreva("Informe sua altura em metros, ex: 1.78: ")
    leia(altura)

    // verifica idade e altura
    se (idade >= 12 e altura >= 1.15){
      escreva(nome, " está autorizado a entrar no trem fantasma.")
    }
    senao{
      escreva(nome, " não está autorizado a entrar no trem fantasma.")

    }
  }
}
