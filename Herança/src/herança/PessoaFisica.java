package herança;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, String cnpj) {
        super(nome);
    }
    
    public String getCpf(){
        return(this.cpf);
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

}
