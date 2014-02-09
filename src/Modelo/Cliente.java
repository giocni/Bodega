//Clase de la identidad Cliente con sus propiedades
package Modelo;

public class Cliente {
    
    //Declaro las variables
    private String Iden_Clie;
    private String Nomb_Clie;
    private String Apel_Clie;
    private String Tele_Clie;

    public String getIden_Clie() {
        return Iden_Clie;
    }

    public void setIden_Clie(String Iden_Clie) {
        this.Iden_Clie = Iden_Clie;
    }

    public String getNomb_Clie() {
        return Nomb_Clie;
    }

    public void setNomb_Clie(String Nomb_Clie) {
        this.Nomb_Clie = Nomb_Clie;
    }

    public String getApel_Clie() {
        return Apel_Clie;
    }

    public void setApel_Clie(String Apel_Clie) {
        this.Apel_Clie = Apel_Clie;
    }

    public String getTele_Clie() {
        return Tele_Clie;
    }

    public void setTele_Clie(String Tele_Clie) {
        this.Tele_Clie = Tele_Clie;
    }   
}