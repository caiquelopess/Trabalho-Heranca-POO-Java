Aluno: Caique Machado Lopes
Projeto: Modelando Veículos com Herança e Concorrência

O que foi feito:
- Classe base Veiculo, com os atributos modelo, ano e velocidadeAtual (todos privados).
- Métodos públicos para acessar os atributos, acelerar, frear e exibir informações.
- Classe Carro, derivada de Veiculo, com atributo específico numeroPortas, construtor próprio, método abrirPorta() e sobrescrita do método exibirInformacoes().
- Classe Moto, derivada de Veiculo, com atributo específico cilindradas, construtor próprio, método empinar() e sobrescrita do método exibirInformacoes().
- Classe de teste TestaVeiculos, que instancia objetos das classes Carro e Moto, testa os métodos de acelerar, frear, exibir informações e os métodos específicos de cada classe.
- Tratamento de exceções: IllegalArgumentException para acelerar/frear e AnoInvalidoException para ano inválido.
- Simulação de viagem concorrente com threads usando a classe SimuladorViagem.

Extra:
- Maior parte do projeto foi comentada para facilitar o entendimento do código.
- O código foi testado e está funcionando conforme a atividade.
- Caso necessário compilar:
    Executar: javac *.java
- Para rodar:
    Executar: java TestarVeiculos

---

# Trabalho: Modelando Veículos com Herança e Concorrência

## Parte 1: Modelagem de Veículos com Herança

1. **Classe Base Veiculo**
   - Crie uma classe base chamada `Veiculo` com os atributos privados: `modelo` (String), `ano` (int), `velocidadeAtual` (double).
   - Implemente um construtor público que receba o modelo e o ano como parâmetros, inicializando a velocidadeAtual com 0.0.
   - Métodos públicos:
     - `getModelo()`, `getAno()`, `getVelocidadeAtual()`
     - `acelerar(double incremento)`: aumenta a velocidadeAtual.
     - `frear(double decremento)`: diminui a velocidadeAtual.
     - `exibirInformacoes()`: imprime modelo, ano e velocidade atual.

2. **Classes Derivadas de Veiculo**
   - `Carro`:
     - Atributo privado: `numeroPortas` (int).
     - Construtor recebe modelo, ano e numeroPortas.
     - Método específico: `abrirPorta()`.
     - Sobrescreva `exibirInformacoes()` para incluir o número de portas.
   - `Moto`:
     - Atributo privado: `cilindradas` (int).
     - Construtor recebe modelo, ano e cilindradas.
     - Método específico: `empinar()`.
     - Sobrescreva `exibirInformacoes()` para incluir as cilindradas.

## Parte 2: Testes e Tratamento de Exceções

3. **Classe de Teste TestaVeiculos**
   - Crie objetos `Carro` e `Moto` com dados fornecidos.
   - Exiba informações iniciais.
   - Acelere e freie os veículos, exibindo informações após cada operação.
   - Chame os métodos específicos (`abrirPorta`, `empinar`).

4. **Tratamento de Exceções**
   - Modifique os métodos `acelerar()` e `frear()` para lançar `IllegalArgumentException` em casos inválidos.
   - Envolva as chamadas em blocos try-catch na classe de teste.
   - Crie a exceção personalizada `AnoInvalidoException` (extends Exception) e lance-a no construtor de `Veiculo` se o ano for menor que 1900.
   - Envolva a criação dos objetos em blocos try-catch para capturar `AnoInvalidoException`.

## Parte 3: Simulação de Viagem com Threads

5. **Simulação Concorrente**
   - Crie a classe `SimuladorViagem` que implementa `Runnable`:
     - Atributo privado: `Veiculo`.
     - Construtor recebe um `Veiculo`.
     - No método `run()`, simule uma viagem em 5 iterações:
       - Acelere o veículo em valor aleatório (5 a 15 km/h).
       - Imprima a velocidade atual.
       - Aguarde 500ms entre as iterações (`Thread.sleep`).
       - Ao final, freie completamente (velocidade para 0).
       - Imprima início e fim da viagem.
   - Na classe `TestaVeiculos`, após as operações iniciais:
     - Crie dois objetos `SimuladorViagem` (um para cada veículo).
     - Crie e inicie duas threads, uma para cada simulador.
     - Use `join()` para aguardar o término das viagens.
     - Trate possíveis `InterruptedException`.
