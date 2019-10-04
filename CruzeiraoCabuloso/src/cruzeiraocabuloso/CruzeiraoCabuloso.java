package cruzeiraocabuloso;

import java.util.Scanner;

public class CruzeiraoCabuloso {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] Jogador = new String[11];
        
        for(int x = 0; x < 11; x++){
        System.out.println("Digite o nome de 11 jogadores: ");
        Jogador[x] = s.nextLine();
        s.nextLine();
        
        }
        
        Clube c1 = new Clube("Cruzeiro", "CeC", "1", Jogador, "Abel Braga");
        Partida p1 = new Partida("Cruzeiro", "Atletico", "6x1", "Mineirão");
        Tecnico t1 = new Tecnico("Abel Braga", "M", 62, 400.000);
        
        System.out.println("Escalação do cruzeiro: ");
        for(int i = 0; i < 11; i++){
        
            System.out.println(Jogador[i++]);
    }
        
        System.out.println("A partida aconteceu entre os times : " + p1.getClube1() + " e " + p1.getClube2());
        System.out.println("O resultado foi " + p1.getResultado());
        System.out.println("O jogo foi realizado no estádio " + p1.getEstadio());
    }
}
