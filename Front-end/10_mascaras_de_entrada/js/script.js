/**
 * Elemento de input para CPF, usado para aplicar máscara de entrada.
 */
const cpfMask = document.querySelector('#cpf')

/**
 * Elemento de input para telefone, usado para aplicar máscara de entrada.
 */
const telefoneMask = document.querySelector('#telefone')

/**
 * Elemento de input para CEP, usado para aplicar máscara de entrada.
 */
const cepMask = document.querySelector('#cep')

/**
 * Elemento do formulário principal da página.
 */
const form = document.querySelector('form')

/**
 * Função que coleta os valores dos campos do formulário e exibe o resultado formatado.
 */
const btn = () => {
    let nome = document.querySelector('#nome').value;
    let cpf = document.querySelector('#cpf').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;
    let result = `Nome: ${nome}<br>
                  CPF: ${cpf}<br>
                  Telefone: ${telefone}<br>
                  CEP: ${cep}`;
    
    document.querySelector("#result").innerHTML = result;
}

/**
 * Adiciona um ouvinte de evento ao campo CPF para permitir apenas números.
 * Esta linha garante que apenas dígitos sejam inseridos no campo CPF.
 */
cpfMask.addEventListener('input', function(){
    this.value=this.value
    .replace(/\D/g,'')
    .replace(/(\d{3})(\d)/, '$1.$2')
    .replace(/(\d{3})(\d)/, '$1.$2')
    .replace(/(\d{3})(\d{1,2})$/, `$1-$2`);
});

telefoneMask.addEventListener('input', function(){
    this.value=this.value
    .replace(/\D/g,'')
    .replace(/(\d{2})(\d)/, '($1) $2')
    .replace(/(\d{4,5})(\d)/, '$1-$2')
    .replace(/(-\d{4})\d+?$/, '$1');
});
cepMask.addEventListener('input', function(){
    this.value=this.value
    .replace(/\D/g,'')
    .replace(/(\d{5})(\d)/, '$1-$2')
});
form.addEventListener('submit', function(event){
    event.preventDefault();
    btn();
});
