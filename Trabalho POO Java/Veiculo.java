public class Veiculo {
    // Atributos privados do veículo
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    // Construtor, inicializa modelo, ano e velocidade
    public Veiculo(String modelo, int ano) throws AnoInvalidoException {
        if (ano < 1900) {
            throw new AnoInvalidoException("Ano inválido para o veículo: " + ano);
        }
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
            throw new IllegalArgumentException("Valor para aumentar a velocidade não pode ser negativo.");
        }
        velocidadeAtual += valorAumentar;
    }

    // Reduz a velocidade atual
    public void frear(double valorReduzir) {
        if (valorReduzir < 0) {
            throw new IllegalArgumentException("Valor para reduzir a velocidade não pode ser negativo.");
        }
        if (valorReduzir > velocidadeAtual) {
            throw new IllegalArgumentException("Valor para reduzir é maior que a velocidade atual.");
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