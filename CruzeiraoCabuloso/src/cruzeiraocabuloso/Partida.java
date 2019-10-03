package cruzeiraocabuloso;

public class Partida {
    
    private String Clube1;
    private String Clube2;
    private String resultado;
    private String estadio; 
  
    public Partida(String Clube1, String Clube2, String resultado, String estadio){
        
        this.Clube1 = Clube1;
        this.Clube2 = Clube2;
        this.resultado = resultado;
        this.estadio = estadio;
    }
    
    public String getClube1(){
        return (this.Clube1);
    }
    
    public void setClube1(String Clube1){
        this.Clube1 = Clube1;
    }
    
    public String getClube2(){
        return (this.Clube2);
    }
    
    public void setClube2(String Clube2){
        this.Clube2 = Clube2;
    }
    
    public String getResultado(){
        return (this.resultado);
    }
    
    public void setResultado(String resultado){
        this.resultado = resultado;
    }
    
    public String getEstadio(){
        return (this.estadio);
    }
    
    public void setEstadio(String estadio){
        this.estadio = estadio;
    }
    
}

