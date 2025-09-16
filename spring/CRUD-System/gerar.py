import random
import re

# Listas de nomes brasileiros
primeiros_nomes_masculinos = [
    'João', 'José', 'Antonio', 'Francisco', 'Carlos', 'Paulo', 'Pedro', 'Lucas', 'Luiz', 'Marcos',
    'Luis', 'Gabriel', 'Rafael', 'Daniel', 'Marcelo', 'Bruno', 'Eduardo', 'Felipe', 'Raimundo', 'Rodrigo',
    'Manoel', 'Nelson', 'Roberto', 'Fabio', 'Ali', 'Gilberto', 'Moreno', 'Jorge', 'Julio', 'Enzo',
    'Nicolas', 'Jamil', 'Fabiano', 'Leonardo', 'Gustavo', 'Guilherme', 'Diego', 'Arthur', 'Sergio', 'Mauricio'
]

primeiros_nomes_femininos = [
    'Maria', 'Ana', 'Francisca', 'Antonia', 'Adriana', 'Juliana', 'Marcia', 'Fernanda', 'Patricia', 'Aline',
    'Sandra', 'Camila', 'Amanda', 'Bruna', 'Jessica', 'Leticia', 'Julia', 'Luciana', 'Vanessa', 'Mariana',
    'Gabriela', 'Valeria', 'Adriane', 'Beatriz', 'Laura', 'Caroline', 'Daniela', 'Luana', 'Sabrina', 'Carla',
    'Bianca', 'Natalia', 'Larissa', 'Tatiane', 'Renata', 'Jaqueline', 'Priscila', 'Raquel', 'Simone', 'Cristiane'
]

sobrenomes = [
    'Silva', 'Santos', 'Oliveira', 'Souza', 'Rodrigues', 'Ferreira', 'Alves', 'Pereira', 'Lima', 'Gomes',
    'Costa', 'Ribeiro', 'Martins', 'Carvalho', 'Almeida', 'Lopes', 'Soares', 'Fernandes', 'Vieira', 'Barbosa',
    'Rocha', 'Dias', 'Monteiro', 'Mendes', 'Ramos', 'Moreira', 'Azevedo', 'Cardoso', 'Melo', 'Campos',
    'Reis', 'Freitas', 'Gonçalves', 'Cavalcanti', 'Araújo', 'Castro', 'Nascimento', 'Correia', 'Pinto', 'Teixeira',
    'da Silva', 'dos Santos', 'de Oliveira', 'de Souza', 'da Costa', 'do Nascimento', 'de Lima', 'de Almeida',
    'da Mota', 'da Rocha', 'de Carvalho', 'de Moura', 'da Luz', 'de Jesus', 'de Andrade'
]

dominios_email = [
    'gmail.com', 'hotmail.com', 'yahoo.com.br', 'outlook.com', 'uol.com.br', 'bol.com.br',
    'terra.com.br', 'ig.com.br', 'globo.com', 'r7.com', 'moderna.com.br', 'empresa.com.br',
    'corporativo.com.br', 'negocio.com.br', 'comercial.com.br'
]

def gerar_cpf():
    """Gera um CPF válido"""
    def calcular_digito(cpf, peso):
        soma = sum(int(cpf[i]) * peso[i] for i in range(len(peso)))
        resto = soma % 11
        return 0 if resto < 2 else 11 - resto
    
    # Gera os 9 primeiros dígitos
    cpf = [random.randint(0, 9) for _ in range(9)]
    
    # Calcula o primeiro dígito verificador
    peso1 = [10, 9, 8, 7, 6, 5, 4, 3, 2]
    cpf.append(calcular_digito(cpf, peso1))
    
    # Calcula o segundo dígito verificador
    peso2 = [11, 10, 9, 8, 7, 6, 5, 4, 3, 2]
    cpf.append(calcular_digito(cpf, peso2))
    
    return ''.join(map(str, cpf))

def gerar_nome():
    """Gera um nome brasileiro"""
    genero = random.choice(['M', 'F'])
    
    if genero == 'M':
        primeiro_nome = random.choice(primeiros_nomes_masculinos)
    else:
        primeiro_nome = random.choice(primeiros_nomes_femininos)
    
    # Adiciona um segundo nome ocasionalmente
    if random.random() < 0.4:
        if genero == 'M':
            segundo_nome = random.choice(primeiros_nomes_masculinos)
        else:
            segundo_nome = random.choice(primeiros_nomes_femininos)
        nome = f"{primeiro_nome} {segundo_nome}"
    else:
        nome = primeiro_nome
    
    # Adiciona sobrenomes
    num_sobrenomes = random.choices([1, 2, 3], weights=[0.3, 0.6, 0.1])[0]
    sobrenomes_escolhidos = random.sample(sobrenomes, num_sobrenomes)
    
    nome_completo = f"{nome} {' '.join(sobrenomes_escolhidos)}"
    return nome_completo

def gerar_email(nome):
    """Gera um email baseado no nome"""
    # Remove acentos e caracteres especiais
    nome_limpo = nome.lower()
    nome_limpo = re.sub(r'[áàâãä]', 'a', nome_limpo)
    nome_limpo = re.sub(r'[éèêë]', 'e', nome_limpo)
    nome_limpo = re.sub(r'[íìîï]', 'i', nome_limpo)
    nome_limpo = re.sub(r'[óòôõö]', 'o', nome_limpo)
    nome_limpo = re.sub(r'[úùûü]', 'u', nome_limpo)
    nome_limpo = re.sub(r'[ç]', 'c', nome_limpo)
    nome_limpo = re.sub(r'[^a-z\s]', '', nome_limpo)
    
    partes = nome_limpo.split()
    
    # Diferentes formatos de email
    formatos = [
        f"{partes[0]}.{partes[-1]}",
        f"{partes[0]}{partes[-1]}",
        f"{partes[0][0]}{partes[-1]}",
        f"{partes[0]}_{partes[-1]}",
        f"{partes[0]}.{partes[-1]}{random.randint(1, 999)}"
    ]
    
    usuario = random.choice(formatos)
    dominio = random.choice(dominios_email)
    
    return f"{usuario}@{dominio}"

# Gerar 200 pessoas
pessoas = []
cpfs_gerados = set()

for i in range(200):
    # Garantir CPF único
    while True:
        cpf = gerar_cpf()
        if cpf not in cpfs_gerados:
            cpfs_gerados.add(cpf)
            break
    
    nome = gerar_nome()
    email = gerar_email(nome)
    
    pessoas.append((cpf, email, nome))

# Gerar os comandos INSERT
inserts = []
for cpf, email, nome in pessoas:
    insert = f"INSERT INTO pessoa (cpf, email, nome) VALUES ('{cpf}', '{email}', '{nome}');"
    inserts.append(insert)

# Salvar em arquivo
with open('inserts_pessoas.sql', 'w', encoding='utf-8') as f:
    for insert in inserts:
        f.write(insert + '\n')

print("Arquivo 'inserts_pessoas.sql' gerado com 200 registros!")
print("\nPrimeiros 5 registros:")
for i in range(5):
    print(inserts[i])

print(f"\n... e mais {len(inserts)-5} registros no arquivo.")