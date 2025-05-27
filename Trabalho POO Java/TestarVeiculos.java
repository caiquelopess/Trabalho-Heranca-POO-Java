public class TestarVeiculos {
    public static void main(String[] args) {
        // Instancia o objeto Carro
        Carro carro = new Carro("Sedan", 2023, 4);

        // Instancia o objeto Moto
        Moto moto = new Moto("Esportiva", 2024, 600);

        // Exibe informações iniciais
        System.out.println("Informações iniciais:");
        carro.exibirInformacoes();
        System.out.println();
        moto.exibirInformacoes();

        // Aumenta a velocidade dos veículos
        carro.acelerar(30);
        moto.acelerar(50);

        // Exibe informações após acelerar
        System.out.println("\nApós acelerar:");
        carro.exibirInformacoes();
        System.out.println();
        moto.exibirInformacoes();

        // Reduz a velocidade dos veículos
        carro.frear(50);
        moto.frear(20);

        // Exibir informações depois de frear
        System.out.println("\nApós frear:");
        carro.exibirInformacoes();
        System.out.println();
        moto.exibirInformacoes();

        // Chamar os outros métodos
        System.out.println();
        carro.abrirPorta();
        moto.empinar();
    }
}