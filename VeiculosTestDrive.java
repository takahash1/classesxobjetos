package testefuncao;

import java.util.Scanner;

public class VeiculosTestDrive {

    private static String cor;
    private static String marca;
    private static String modelo;
    private static int npass;
    private static double qtlitros;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        for (int x = 0; x < 2; x++) {            
        
        System.out.println("Digite a cor do veículo " + (x+1) + ":");
        String corr = s.nextLine(); 
        s.nextLine();
        System.out.println("Digite a marca do veículo " + (x+1) + ":");
        String marcaa = s.nextLine();
        System.out.println("Digite o modelo do veículo: " + (x+1) + ":");
        String modeloo = s.nextLine();
        System.out.println("Digite o número de passageiros do veículo " + (x+1) + ":");
        int npasss = s.nextInt();
        System.out.println("Digite a quantidade de litros do veículo " + (x+1) + ":");
        double qtlitross = s.nextDouble();
        }
        Veiculo v1 = new Veiculo(cor, marca, modelo, npass, qtlitros);
        Veiculo v2 = new Veiculo(cor, marca, modelo, npass, qtlitros);
        Veiculo v3 = new Veiculo(cor, marca, modelo, npass, qtlitros);

        System.out.println("A marca do veículo 1 é: " + v1.getMarca());
        System.out.println("A marca do veículo 2 é: " + v2.getMarca());
        System.out.println("A marca do veículo 3 é: " + v3.getMarca());
    }

}
