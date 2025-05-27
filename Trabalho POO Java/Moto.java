public class Moto extends Veiculo {

    // Atributos específicos da moto
    private int cilindradas;

    // Construtor da moto
    public Moto(String modelo, int ano, int cilindradas) {
        super(modelo, ano);
        this.cilindradas = cilindradas;
    }

    // Métodos específicos da moto
    public void empinar() {
        System.out.println("A moto está empinando!");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas);
    }
}