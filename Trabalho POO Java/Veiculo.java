public class Veiculo {
    // Atributos privados do veículo
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    // Construtor, inicializa modelo, ano e velocidade
    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0;
    }

    // Retorna o modelo do veículo
    public String getModelo() {
        return modelo;
    }

    // Retorna o ano do veículo
    public int getAno() {
        return ano;
    }

    // Retorna a velocidade atual do veículo
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    // Aumenta a velocidade atual
    public void acelerar(double valorAumentar) {
        if (valorAumentar < 0) {
            System.out.println("Erro: valor para aumentar a velocidade não pode ser negativo.");
            return;
        }
        velocidadeAtual += valorAumentar;
    }

    // Reduz a velocidade atual
    public void frear(double valorReduzir) {
        if (valorReduzir < 0) {
            System.out.println("Erro: valor para reduzir a velocidade não pode ser negativo.");
            return;
        }
        if (valorReduzir > velocidadeAtual) {
            System.out.println("Erro: valor para reduzir é maior que a velocidade atual.");
            return;
        }
        velocidadeAtual -= valorReduzir;
    }

    // Exibe as informações do veículo
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}