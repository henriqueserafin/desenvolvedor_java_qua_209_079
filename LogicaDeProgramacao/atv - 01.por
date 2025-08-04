programa {
  funcao inicio() {
  
  // Declaração de variaveis
    cadeia nome, sexo
    inteiro idade

  //entrada de dados
    escreva("Informe seu nome: ")
    leia(nome)
    escreva("Informe seu sexo (homem/mulher): ")
    leia(sexo)
    escreva("Informe sua idade: ")
    leia(idade)

  //saida de dados
    se (sexo == "homem" e idade >= 65) {
      escreva(nome, ", você pode se aposentar.")
    }
    senao se (sexo == "mulher" e idade >= 62) {
      escreva(nome, ", você pode se aposentar.")
    }
    senao {
      escreva(nome, ", você ainda não pode se aposentar.")
    }
  }
}