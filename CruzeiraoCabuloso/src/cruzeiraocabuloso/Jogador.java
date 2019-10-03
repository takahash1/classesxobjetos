package cruzeiraocabuloso;

public class Jogador {
    
    private String nome;
    private String sexo;
    private int idade;
    private double salario;
    
    public Jogador(String nome, String sexo, int idade, double salario){
        
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.salario = salario;
    }
    
    public String getNome(){
        return (this.nome);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSexo(){
        return (this.sexo);
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public int idade(){
        return (this.idade);
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public double getSalario(){
        return (this.salario);        
    }
    
    public void setSalario(double salario){
        this.salario = salario;         
    }
}
