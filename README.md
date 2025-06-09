Aluno: Caique Machado Lopes
Projeto: Modelando Veículos com Herança

✅ O que foi feito:
Implementação da classe base Veiculo, com os atributos privados: modelo, ano e velocidadeAtual.

Métodos públicos para:

Acessar os atributos.

Acelerar e frear o veículo com validação.

Exibir informações básicas.

Criação da classe Carro, derivada de Veiculo, com:

Atributo específico numeroPortas.

Construtor próprio.

Método abrirPorta().

Sobrescrita do método exibirInformacoes().

Criação da classe Moto, também derivada de Veiculo, com:

Atributo específico cilindradas.

Construtor próprio.

Método empinar().

Sobrescrita do método exibirInformacoes().

Criação da classe de teste TestaVeiculos, que:

Instancia objetos das classes Carro e Moto.

Testa os métodos de aceleração, frenagem, exibição de informações.

Executa os métodos específicos abrirPorta() e empinar().

💡 Extras:
Grande parte do código foi comentada para facilitar o entendimento.

Todo o código foi testado e está funcionando corretamente conforme os requisitos.

Instruções de compilação:

Para compilar: javac *.java

Para executar: java TestaVeiculos

🧠 Resumo do Exercício: Modelando Veículos com Herança
Objetivo:
Reforçar o conceito de herança em programação orientada a objetos, demonstrando como classes derivadas podem herdar e especializar características de uma classe base.

1. Classe Base: Veiculo
Atributos privados:

modelo (String)

ano (int)

velocidadeAtual (double)

Construtor público:

Recebe modelo e ano como parâmetros.

Inicializa velocidadeAtual com 0.0.

Lança AnoInvalidoException se o ano for menor que 1900.

Métodos públicos:

getModelo()

getAno()

getVelocidadeAtual()

acelerar(double incremento)

Valida se incremento é positivo.

Lança IllegalArgumentException caso contrário.

frear(double decremento)

Valida se decremento é válido.

Lança IllegalArgumentException caso seja inválido.

exibirInformacoes()

2. Classes Derivadas
🔸 Carro:
Atributo específico: numeroPortas (int)

Construtor próprio: recebe modelo, ano e numeroPortas

Método específico: abrirPorta()

Sobrescreve exibirInformacoes()

🔹 Moto:
Atributo específico: cilindradas (int)

Construtor próprio: recebe modelo, ano e cilindradas

Método específico: empinar()

Sobrescreve exibirInformacoes()

3. Classe de Teste: TestaVeiculos
Criar:

Carro sedan2023 = new Carro("Sedan", 2023, 4);

Moto esportiva2024 = new Moto("Esportiva", 2024, 600);

Exibir informações iniciais.

Acelerar:

Carro: 30 km/h

Moto: 50 km/h

Exibir informações atualizadas.

Frear:

Carro: 50 km/h (tentativa inválida)

Moto: 20 km/h

Exibir informações atualizadas.

Executar métodos:

abrirPorta() no carro

empinar() na moto

Tratamento de exceções:

try-catch para capturar IllegalArgumentException nos métodos acelerar() e frear().

try-catch para capturar AnoInvalidoException na criação dos objetos.

🔐 Exceções Personalizadas
AnoInvalidoException:
Extende Exception.

Construtor recebe uma mensagem de erro personalizada.

Lançada no construtor de Veiculo quando o ano < 1900.
