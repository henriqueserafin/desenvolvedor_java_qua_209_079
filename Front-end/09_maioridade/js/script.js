// variavel do formulário
const form = document.querySelector("form")

// arrow function
const msg = () =>{
    // variaveis locais
    let nome = document.querySelector('#nome').value;
    let idade = document.querySelector('#idade').value;
    const result = (idade >=18) ? 'é maior de idade.':'é menor de idade.';

    document.querySelector('#result').innerHTML = `${nome} ${result}`; 

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

