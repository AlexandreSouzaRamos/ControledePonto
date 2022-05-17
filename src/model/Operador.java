package model;

//Item 5
public class Operador extends Funcionario{
    
    private double valorHora;

    public Operador() {
        super();
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Operador(int idFunc, String nome, String email, String documento, double valorHora) {
        super(idFunc, nome, email, documento);
        this.valorHora = valorHora;
    }
    
      @Override
    public String getNome() {
        return "Operador " + super.getNome(); 
    }
    
    
    
}
