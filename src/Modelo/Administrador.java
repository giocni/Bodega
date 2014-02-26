//Clase de la entidad Administrador con sus propiedades
package Modelo;

public class Administrador {
    
    //Declaro las variables
    private String Iden_Admi;
    private String Nomb_Admi;
    private String Apel_Admi;
    private String Pass_Admi;

    //Retorno el valor
    public String getIden_Admi() {
        return Iden_Admi;
    }

    //Le envio el valor
    public void setIden_Admi(String Iden_Admi) {
        this.Iden_Admi = Iden_Admi;
    }

    public String getNomb_Admi() {
        return Nomb_Admi;
    }

    public void setNomb_Admi(String Nomb_Admi) {
        this.Nomb_Admi = Nomb_Admi;
    }

    public String getApel_Admi() {
        return Apel_Admi;
    }

    public void setApel_Admi(String Apel_Admi) {
        this.Apel_Admi = Apel_Admi;
    }

    public String getPass_Admi() {
        return Pass_Admi;
    }

    public void setPass_Admi(String Pass_Admi) {
        this.Pass_Admi = Pass_Admi;
    }
}