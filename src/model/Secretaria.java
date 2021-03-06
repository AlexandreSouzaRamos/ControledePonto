package model;

//Item 4
public class Secretaria extends Funcionario{
    private String telefone;
    private String ramal;

    public Secretaria() {
        super();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public Secretaria(int idFunc, String nome, String email, String documento, String telefone, String ramal) {
        super(idFunc, nome, email, documento);
        this.telefone = telefone;
        this.ramal = ramal;
    }
    
      @Override
    public String getNome() {
        return "Secretária " + super.getNome(); 
    }
    
}
