// 11 - listas
programa {
  funcao inicio() {
    // declaração de vetor
    cadeia nomes[10]
    inteiro idades[10]

    para(inteiro i = 0; i<10; i++)
    {
      escreva("Informe o ", i+1, "° nome do usuário: \n")
      leia(nomes[i])
      escreva("informe a idade do ",i+1, "° usuário")
      leia(idades[i])
    }
    // saida
    para (inteiro i = 0; i<10;i++)
    {
      escreva("nome do ", i+1, "° usuário: ", nomes[i], ".")
      escreva("Idade: ", idades[i])
    }
  }
}
