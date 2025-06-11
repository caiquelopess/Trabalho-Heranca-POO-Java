import java.util.Random;

public class SimuladorViagem implements Runnable {
    private Veiculo veiculo;

    public SimuladorViagem(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public void run() {
        Random random = new Random();
        System.out.println("Iniciando viagem com o veículo: " + veiculo.getModelo());
        for (int i = 1; i <= 5; i++) {
            double incremento = 5 + random.nextInt(11); // 5 a 15 km/h
            try {
                veiculo.acelerar(incremento);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao acelerar durante a simulação: " + e.getMessage());
            }
            System.out.printf("Iteração %d - Velocidade atual do %s: %.2f km/h%n", i, veiculo.getModelo(), veiculo.getVelocidadeAtual());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Viagem interrompida para o veículo: " + veiculo.getModelo());
                return;
            }
        }
        // Freia completamente ao final
        try {
            veiculo.frear(veiculo.getVelocidadeAtual());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao frear durante a simulação: " + e.getMessage());
        }
        System.out.println("Viagem finalizada para o veículo: " + veiculo.getModelo());
    }
}