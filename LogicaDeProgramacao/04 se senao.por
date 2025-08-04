programa {
  funcao inicio() {
    //declaração de variaveis
    cadeia nome
    inteiro idade
    
    //entrada de dados
    escreva("Informe seu nome: ")
    leia(nome)
    escreva("informe sua idade: ")
    leia(idade)

    //estrutura d edecisão
    se(idade>=18){
      escreva(nome, " é maior de idade.\n")
    }
    senao{
      escreva(nome, " é menor de idade.\n")
    }

  }
}
