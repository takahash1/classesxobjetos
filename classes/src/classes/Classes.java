package classes;

import java.util.Scanner;

public class Classes {
        
    public static void main(String[] args) {
        String nome, endereco, descricao, nota;
        
        Scanner s = new Scanner(System.in);
            
        
        System.out.println("Digite as informações do aluno: ");
        
        for(int x = 0; x <2; x++){
            
            String[] disciplinas = new String[2];
            
            System.out.println("Nome: ");
            nome = s.nextLine();
            System.out.println("Endereço: ");
            endereco = s.nextLine();
            System.out.println("Disciplinas matriculadas: ");
            descricao = s.nextLine();
            System.out.println("Digite as notas dessa materia");
            nota = s.nextLine();
            
            disciplinas[0] = descricao;
            disciplinas[1] = nota;  
            
            
            aluno a1 = new aluno(nome, endereco, disciplinas);
            
        }
        
        System.out.println();
    }
    
}
