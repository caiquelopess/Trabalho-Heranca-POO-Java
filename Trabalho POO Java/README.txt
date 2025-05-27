Aluno: Caique Machado Lopes
Data de conclusão: 27/05/2025 15:23
Projeto: Modelando Veículos com Herança

O que foi feito:
- Classe base Veiculo, com os atributos modelo, ano e velocidadeAtual (todos privados).
- Métodos públicos para acessar os atributos, acelerar, frear e exibir informações.
- Classe Carro, derivada de Veiculo, com atributo específico numeroPortas, construtor próprio, método abrirPorta() e sobrescrita do método exibirInformacoes().
- Classe Moto, derivada de Veiculo, com atributo específico cilindradas, construtor próprio, método empinar() e sobrescrita do método exibirInformacoes().
- Classe de teste TestarVeiculos, que instancia objetos das classes Carro e Moto, testa os métodos de acelerar, frear, exibir informações e os métodos específicos de cada classe.

Extra:
- Maior parte do projeto foi comentada para facilitar o entendimento do código.
- O código foi testado e está funcionando conforme a atividade.
- Caso necessário compilar:
    Executar: javac *.java
- Para rodar:
    Executar: java TestarVeiculos


Trabalho:

Modelando Veículos com Herança
Objetivo: Este exercício visa reforçar o conceito de herança em programação orientada a objetos,
demonstrando como classes derivadas podem herdar e especializar características de uma classe
base. Contexto: Vamos modelar diferentes tipos de veículos. Todos os veículos compartilham
algumas características básicas, mas cada tipo tem suas particularidades.
Instruções:
1. Crie uma classe base chamada Veiculo:
o Esta classe deve ter os seguintes atributos privados:
 modelo (String)
 ano (int)
 velocidadeAtual (double)
o Implemente um construtor público que receba o modelo e o ano como parâmetros e inicialize a
velocidadeAtual com 0.0.
o Implemente os seguintes métodos públicos:
 getModelo(): Retorna o modelo do veículo.
 getAno(): Retorna o ano do veículo.
 getVelocidadeAtual(): Retorna a velocidade atual do veículo.
 acelerar(double incremento): Aumenta a velocidadeAtual pelo valor do incremento.
Se o incremento for negativo, exiba uma mensagem de erro e não altere a velocidade.
 frear(double decremento): Diminui a velocidadeAtual pelo valor do decremento. Se o
decremento for negativo ou maior que a velocidadeAtual, exiba uma mensagem de erro e não
altere a velocidade.
 exibirInformacoes(): Imprime o modelo, o ano e a velocidade atual do veículo.
2. Crie duas classes derivadas de Veiculo:
o Carro:
 Adicione um atributo privado específico: numeroPortas (int).
 Implemente um construtor público que receba o modelo, o ano e o número de portas como
parâmetros. Lembre-se de chamar o construtor da superclasse (Veiculo).
 Implemente um método público específico: abrirPorta(): Imprime uma mensagem indicando
que uma porta do carro foi aberta.
 Sobrescreva o método exibirInformacoes() para incluir o número de portas nas informações
exibidas.
o Moto:
 Adicione um atributo privado específico: cilindradas (int).
 Implemente um construtor público que receba o modelo, o ano e as cilindradas como parâmetros.
Lembre-se de chamar o construtor da superclasse (Veiculo). 
 Implemente um método público específico: empinar(): Imprime uma mensagem indicando que
a moto está empinando (apenas para demonstração!).
 Sobrescreva o método exibirInformacoes() para incluir as cilindradas nas informações
exibidas.
3. Crie uma classe de teste chamada TestaVeiculos com o método main():
o Dentro do método main(), realize as seguintes ações:
 Crie um objeto da classe Carro com modelo "Sedan", ano 2023 e 4 portas.
 Crie um objeto da classe Moto com modelo "Esportiva", ano 2024 e 600 cilindradas.
 Exiba as informações iniciais de ambos os veículos usando o método exibirInformacoes().
 Acelere o carro em 30 km/h e a moto em 50 km/h.
 Exiba novamente as informações de ambos os veículos.
 Tente frear o carro em 50 km/h e a moto em 20 km/h.
 Exiba mais uma vez as informações.
 Chame os métodos específicos abrirPorta() no objeto Carro e empinar() no objeto Moto. 
