package cruzeiraocabuloso;

public class Clube {
    
    private String nome;
    private String sigla;
    private int divisao;
    private String[] Jogador;
    private String Tecnico;
    
    public Clube(String nome, String sigla, int divisao, String[] Jogador, String Tecnico){
        
        this.nome = nome;
        this.sigla = sigla;
        this.divisao = divisao;
        this.Jogador = Jogador;
        this.Tecnico = Tecnico;
        
    }
        
        public String getNome(){
            return (this.nome);
        }
        
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public String getSigla(){
            return (this.sigla);
        }
        
        public void setSigla(String sigla){
            this.sigla = sigla;
        }        
        
        public int getDivisao(){
            return (this.divisao);
        }
        
        public void setDivisao(int divisao){
            this.divisao = divisao;
        }
        
        public String[] getJogador(){
            return (this.Jogador);
        }
        
        public void setJogador(String[] Jogador){
            this.Jogador = Jogador;
        }
        
        public String getTecnico(){
            return (this.Tecnico);
        }
        
        public void setTecnico(String Tecnico){
            this.Tecnico = Tecnico;
        }
}

