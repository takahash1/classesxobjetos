package testefuncao;


public class Veiculo {
    private String cor;
    private String marca;
    private String modelo;
    private int npass;
    private double qtlitros;
            
    public Veiculo(String cor, String marca, String modelo, int npass, double qtlitros){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.npass = npass;
        this.qtlitros = qtlitros;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getNpass(){
        return npass;
    }
    public void setNpass(int npass){
        this.npass = npass;
    }
    public double getQtlitros(){
        return qtlitros;
    }
    public void setQtlitros(double qtlitros){
        this.qtlitros = qtlitros;
    }
}
