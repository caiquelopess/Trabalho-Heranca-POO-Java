Aluno: Caique Machado Lopes
Data de conclusão: 27/05/2025 15h23
Projeto: Modelando Veículos com Herança

O que foi feito:
- Classe base Veiculo, com os atributos modelo, ano e velocidadeAtual (todos privados).
- Métodos públicos para acessar os atributos, acelerar, liberar e exibir informações.
- Classe Carro, derivada de Veículo, com atributo específico numeroPortas, construtor próprio, método abrirPorta() e sobrescrita do método exibirInformacoes().
- Classe Moto, derivada de Veículo, com atributo específico cilindradas, construtor próprio, método empinar() e sobrescrita do método exibirInformações().
- Classe de teste TestarVeiculos, que instancia objetos das classes Carro e Moto, testa os métodos de acelerar, frear, exibir informações e os métodos específicos de cada classe.

Extra:
- Maior parte do projeto foi comentada para facilitar o entendimento do código.
- O código foi testado e está funcionando conforme a atividade.
- Caso seja necessário compilar:
    Executar: javac *.java
- Para rodar:
    Executar: java TestarVeiculos


Trabalho:

Modelando Veículos com Herança
Objetivo: Este exercício visa fortalecer o conceito de herança em programação orientada a objetos,
demonstrando como classes derivadas podem herdar e especializar características de uma classe
base. Contexto: Vamos modelar diferentes tipos de veículos. Todos os veículos unidos
algumas características básicas, mas cada tipo tem suas particularidades.
Instruções:
1. Crie uma classe base chamada Veículo:
o Esta classe deve ter os seguintes atributos privados:
 modelo (String)
 ano (int)
 velocidadeAtual (duplo)
o Implemente um construtor público que receba o modelo e o ano como parâmetros e inicialize um
velocidadeAtual com 0.0.
o Implemente os seguintes métodos públicos:
 getModelo(): retorna o modelo do veículo.
 getAno(): Retorno do ano do veículo.
 getVelocidadeAtual(): Retorna a velocidade atual do veículo.
 acelerar(double incremento): Aumenta a velocidadeAtual pelo valor do incremento.
Se o incremento for negativo, uma mensagem de erro será exibida e a velocidade não será alterada.
 frear(double decremento): Diminui a velocidadeAtual pelo valor do decremento. Se o
decremento para negativo ou maior que a velocidadeAtual, exiba uma mensagem de erro e não
alterar a velocidade.
 exibirInformações(): Imprime o modelo, o ano e a velocidade atual do veículo.
2. Crie duas classes derivadas de Veículo:
o Carro:
 Adicione um atributo privado específico: numeroPortas (int).
 Implemente um construtor público que receba o modelo, o ano e o número de portas como
parâmetros. Lembre-se de chamar o construtor da superclasse (Veiculo).
 Implemente um método público específico: abrirPorta(): Imprime uma mensagem baixa
que uma porta do carro estava aberta.
 Sobrescreva o método exibirInformações() para incluir o número de portas nas informações
exibidos.
o Moto:
 Adicione um atributo privado específico: cilindradas (int).
 Implemente um construtor público que receba o modelo, o ano e as cilindradas como parâmetros.
Lembre-se de chamar o construtor da superclasse (Veiculo).
 Implemente um método público específico: empinar(): Imprime uma mensagem abaixo que
a moto está empinando (apenas para demonstração!).
 Sobrescreva o método exibirInformações() para incluir as cilindradas nas informações
exibidos.
3. Crie uma classe de teste chamada TestaVeiculos com o método main():
o Dentro do método main(), execute as seguintes ações:
 Crie um objeto da classe Carro com modelo “Sedan”, ano 2023 e 4 portas.
 Crie um objeto da classe Moto com modelo “Esportiva”, ano 2024 e 600 cilindradas.
 Exiba as informações iniciais de ambos os veículos usando o método exibirInformacoes().
 Acelere o carro em 30 km/hea moto em 50 km/h.
 Exiba novamente as informações de ambos os veículos.
 Tente frear o carro em 50 km/hea moto em 20 km/h.
 Exiba mais uma vez as informações.
 Chame os métodos específicos para abrirPorta() no objeto Carro e empinar() no objeto Moto.
