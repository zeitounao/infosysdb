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
public class Produto {
    private String descricao = null;
    private int estoque ;
    private boolean ativo = false;
    private double custo = 0;
    private double venda = 0;



    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }
    
    public Produto(String descricao, int estoque, boolean ativo, double custo, double venda){
        setDescricao(descricao);
        setEstoque(estoque);
        setCusto(custo);
        setAtivo(ativo);
        setVenda(venda);
    }
    @Override
    public String toString(){
        String ret = null;
        if(isAtivo()) ret = "[Ativo] = ";
        else ret ="[Fora de linha] - ";
        ret = ret + "Descrição.: [" + getDescricao() + "]\n"+
                "Estoque.....: [" + getEstoque() + "]\n"+
                "Custo.: [" + getCusto() + "]\n"+
                "Venda...: [" + getVenda() + "]\n";
        return ret;
    }


    

 

   
    
    
}
