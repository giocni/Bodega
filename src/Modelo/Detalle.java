//Clase de la entidad Detalle con sus propiedades
package Modelo;

public class Detalle {
    
    //Declaro las variables
    private String Nume_Deta;
    private String Nomb_Deta;
    private String Desc_Deta;
    private int Cant_Deta;
    private int Valo_Deta;
    private int Valt_Deta;
    private String Nume_Fact;
    
    public String getNume_Deta() {
        return Nume_Deta;
    }
    
    public void setNume_Deta(String Nume_Deta) {
        this.Nume_Deta = Nume_Deta;
    }
    
    public String getNomb_Deta() {
        return Nomb_Deta;
    }

    public void setNomb_Deta(String Nomb_Deta) {
        this.Nomb_Deta = Nomb_Deta;
    }

    public String getDesc_Deta() {
        return Desc_Deta;
    }

    public void setDesc_Deta(String Desc_Deta) {
        this.Desc_Deta = Desc_Deta;
    }

    public int getCant_Deta() {
        return Cant_Deta;
    }

    public void setCant_Deta(int Cant_Deta) {
        this.Cant_Deta = Cant_Deta;
    }

    public int getValo_Deta() {
        return Valo_Deta;
    }

    public void setValo_Deta(int Valo_Deta) {
        this.Valo_Deta = Valo_Deta;
    }
    
    public int getValt_Deta() {
        return Valt_Deta;
    }
    
    public void setValt_Deta(int Valt_Deta) {
        this.Valt_Deta = Valt_Deta;
    }
    
    public String getNume_Fact() {
        return Nume_Fact;
    }
    
    public void setNume_Fact(String Nume_Fact) {
        this.Nume_Fact = Nume_Fact;
    }
}