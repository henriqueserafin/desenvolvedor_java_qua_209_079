// 07 - escolha caso
programa {
  funcao inicio() {
    // declaração de variáveis
    inteiro opcao
    real x, y, resultado

    //entrada de dados
    escreva("Informe o valor de x: ")
    leia(x)
    escreva("Informe o valor de y: ")
    leia(y)
    escreva("Informe a opção desejada:\n")
    escreva("1 - soma.\n")
    escreva("2 - subtração.\n")
    escreva("3 - multiplicação.\n")
    escreva("4 - divisão.\n")
    leia(opcao)

    escolha(opcao)
    {
    caso 1: resultado = x+y
      escreva("O resultado é: ", resultado)
      pare
    caso 2: resultado = x-y
      escreva("O resultado é: ", resultado)
      pare
    caso 3: resultado = x*y
      escreva("O resultado é: ", resultado)
      pare
    caso 4: resultado = x/y
      escreva("O resultado é: ", resultado)
      pare
    caso contrario:
      escreva("Opção Inválida")
    }
  }
}
