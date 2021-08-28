package aplicativos;

public class Pessoa extends Piloto{

    public String nome;
    public String sobrenome;
    public String CPF;
    public static String
    imprimeCPF ( String CPF){
    return(CPF.substring(0,3) + "." + CPF.substring(3,6) + "." + CPF.substring(6,9) + "-" + CPF.substring(9, 11));
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getImprimeCPF() {
        return imprimeCPF(CPF);
    }
    public void setCPF( String CPF) {
        this.CPF = CPF;
    }

    
   
    
  
       
    

}
   