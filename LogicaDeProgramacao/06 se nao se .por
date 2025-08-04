programa {
  funcao inicio() {
    cadeia nome
    real nota

    escreva("informe seu nome: ")
    leia(nome)
    escreva("Infome sua nota: ")
    leia(nota)
    se (nota >= 0 e nota <= 10)
    {
      se (nota >= 7) escreva(nome, "está aprovado.")
      senao se (nota >= 5) escreva(nome, " está de recuperação")
      senao escreva(nome, " está reprovado.")
    }
    senao
    {
      escreva("nota inválida")
    }
  }
}