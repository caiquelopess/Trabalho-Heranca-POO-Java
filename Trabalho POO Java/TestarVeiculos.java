public class TestarVeiculos {
    public static void main(String[] args) {
        try {
            // Instancia o objeto Carro
            Carro carro = new Carro("Sedan", 2024, 4);

            // Instancia o objeto Moto
            Moto moto = new Moto("Esportiva", 2024, 600);

            // Exibe informações iniciais
            System.out.println("Informações iniciais:");
            carro.exibirInformacoes();
            System.out.println();
            moto.exibirInformacoes();

            // Aumenta a velocidade dos veículos
            try {
                carro.acelerar(30);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao acelerar carro: " + e.getMessage());
            }
            try {
                moto.acelerar(50);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao acelerar moto: " + e.getMessage());
            }

            // Exibe informações após acelerar
            System.out.println("\nApós acelerar:");
            carro.exibirInformacoes();
            System.out.println();
            moto.exibirInformacoes();

            // Reduz a velocidade dos veículos
            try {
                carro.frear(50);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao frear carro: " + e.getMessage());
            }
            try {
                moto.frear(20);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao frear moto: " + e.getMessage());
            }

            // Exibir informações depois de frear
            System.out.println("\nApós frear:");
            carro.exibirInformacoes();
            System.out.println();
            moto.exibirInformacoes();

            // Chamar os outros métodos
            System.out.println();
            carro.abrirPorta();
            moto.empinar();

            // Cria os simuladores de viagem
            SimuladorViagem simCarro = new SimuladorViagem(carro);
            SimuladorViagem simMoto = new SimuladorViagem(moto);

            // Inicia as simulações em threads separadas
            Thread t1 = new Thread(simCarro);
            Thread t2 = new Thread(simMoto);

            // Inicia as threads
            t1.start();
            t2.start();

            // Aguarda a conclusão das threads
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                System.out.println("Simulação interrompida.");
            }

        // Exceção ao criar veículo
        } catch (AnoInvalidoException e) {
            System.out.println("Erro ao criar veículo: " + e.getMessage());
        }
    }
}