// variavel do formulário
const form = document.querySelector("form")

// arrow function
const msg = () =>{
    // variaveis locais
    let nome = document.querySelector('#nome').value;
    let peso = document.querySelector('#peso').value;
    let altura = document.querySelector('#altura').value;
    const result = peso/(altura*altura)
    let n = result.toFixed(2);

    let legenda =
        (result < 16.9)
        ? 'Magreza severa.'
        : (result < 18.5)
        ? 'Abaixo do peso.'
        : (result < 25)
        ? 'Peso normal.'
        : (result < 30)
        ? 'Acima do peso.'
        : (result < 35)
        ? 'Obesidade I.'
        : (result < 40)
        ? 'Obesidade II.'
        : 'Obesidade mórbida.';
    document.querySelector('#result').innerHTML = `Olá ${nome}, seu IMC é ${n}.<br>${legenda}`;

    // verifica a idade
    if (idade >= 18) {

         
        alert(`${nome} é maior de idade.`)
    } else {
        alert(`${nome} é menor de idade.`)
    }
}
// eventos
form.addEventListener(`submit`, function(event) {
    //desativa o submit
    event.preventDefault();

    msg()
});

// quero que use a tabela para mostar a legenda do imc
