package lista2.exe0;
public class Pc {
    private String marca, modelo;
    private String processador;
    private int ram, disco;
    
    public Pc(){
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setRam(int ram){
        if ((ram > 0) && (ram % 2 == 0)){
            this.ram = ram;
        }
        else this.ram = 0;
    }
    public int getRam(){
        return this.ram;
    }
}
