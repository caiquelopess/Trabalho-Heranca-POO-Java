public class Carro extends Veiculo {

    // Atributos específicos do carro
    private int numeroPortas;

    // Construtor do carro
    public Carro(String modelo, int ano, int numeroPortas) throws AnoInvalidoException {
        super(modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    // Métodos específicos do carro
    public void abrirPorta() {
        System.out.println("Uma porta do carro foi aberta.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de portas: " + numeroPortas);
    }
}