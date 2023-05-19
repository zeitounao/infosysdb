/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author kazuo
 */
public class Tecnico {
    private String nome = null;
    private double salario = 0 ;
    private double valorDaHora = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorDaHora() {
        return valorDaHora;
    }

    public void setValorDaHora(double valorDaHora) {
        this.valorDaHora = valorDaHora;
    }
    
    
    public Tecnico(String nome, double salario,double valorDaHora){
        setNome(nome);
        setSalario(salario);
        setValorDaHora(valorDaHora);
        
    }

    @Override
    public String toString(){
        String ret = null;
        
        ret = "Nome...: ["+getNome()+"]" +"\n"+ "Salario: [" + getSalario() + "]"
                +"\n" + "Valor da Hora: [" + getValorDaHora() + "]"+ "\n";
        
        return ret;
        
    }
}
