programa {
  funcao inicio() {
    cadeia nome, genero
    inteiro idade

    // entrada de dados
    escreva("informe o nome: ")
    leia(nome)
    escreva("informe o idade: ")
    leia(idade)
    escreva("informe o gênero: ")
    leia(genero)

    se(idade>=65 e genero == "masculino" ou idade >= 62 e genero == "feminino") escreva(nome, " aposentadoria autorizada..")
    senao escreva(nome, " aposentadoria não autorizada")
  }
}
