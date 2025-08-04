programa {
  funcao inicio() {
    // declaração de variáveis
    real x, y, resultado
    inteiro opcao

    // loop faça enquanto
    faca {
      // menu
      escreva("Informe a opção desejada:\n")
      escreva("1 - soma.\n")
      escreva("2 - subtração.\n")
      escreva("3 - multiplicação.\n")
      escreva("4 - divisão.\n")
      escreva("5 - sair do programa\n")
      leia(opcao)

      // entrada de dados
      se (opcao >= 1 e opcao <= 4) {
        escreva("Informe o valor de x: ")
        leia(x)
        escreva("Informe o valor de y: ")
        leia(y)
      }

      // verificar escolha 
      escolha(opcao) {
        caso 1:
          resultado = x + y
          escreva("O resultado é: ", resultado, "\n")
          pare
        caso 2:
          resultado = x - y
          escreva("O resultado é: ", resultado, "\n")
          pare
        caso 3:
          resultado = x * y
          escreva("O resultado é: ", resultado, "\n")
          pare
        caso 4:
          resultado = x / y
          escreva("O resultado é: ", resultado, "\n")
          pare
          /*
          se (y != 0) {
            resultado = x / y
            escreva("O resultado é: ", resultado, "\n")
          } senao {
            escreva("Erro: divisão por zero.\n")
          }
          */
          pare
        caso 5:
          escreva("Programa encerrado.\n")
          pare
        caso contrario:
          escreva("Opção Inválida\n")
      }
    } enquanto(opcao != 5)
  }
}
