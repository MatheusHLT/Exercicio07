// Nome: Matheus Honorato Leite Teixeira
// Matricula: 1261929133

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double distancia;
        double combustivel;

        System.out.println("Distância percorrida (km):");
        distancia = scanner.nextDouble();
        System.out.println("Combustível gasto (litros):");
        combustivel = scanner.nextDouble();

        System.out.printf("Consumo médio: %s km/l", (distancia / combustivel));

        scanner.close();
    }
}
