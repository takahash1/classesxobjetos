package professor;

import java.util.Scanner;

public class professor {

    public String nome;
    public String matricula;
    public String endereco;
    public String email;
    public String materia;
    public int idade;
    

    public professor(String nome, String matricula, String endereco, String email, String materia, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.email = email;
        this.materia = materia;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        professor[] vet = new professor[5];
        String nome, matricula, endereco, email, materia;
        int idade;

        System.out.println("Digite os dados do professor: ");

        for (int x = 0; x < 2; x++) {
            System.out.println("Nome: ");
            nome = s.nextLine();
            s.nextLine();
            System.out.println("Matrícula: ");
            matricula = s.nextLine();
            System.out.println("Endereço: ");
            endereco = s.nextLine();
            System.out.println("E-mail: ");
            email = s.nextLine();
            System.out.println("Matéria aplicada: ");
            materia = s.nextLine();
            System.out.println("Idade: ");
            idade = s.nextInt();
           
            vet[x] = new professor(nome, matricula, endereco, email, materia, idade);
        }
        System.out.println("O primeiro professor é: ");
        System.out.println(vet[0].nome);
        System.out.println(vet[0].matricula);
        System.out.println(vet[0].endereco);
        System.out.println(vet[0].email);
        System.out.println(vet[0].materia);
        System.out.println(vet[0].idade);
        
        System.out.println("O segundo professor é: ");
        System.out.println(vet[1].nome);
        System.out.println(vet[1].matricula);
        System.out.println(vet[1].endereco);
        System.out.println(vet[1].email);
        System.out.println(vet[1].materia);
        System.out.println(vet[1].idade);
    }
}
