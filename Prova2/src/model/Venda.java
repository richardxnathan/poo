package model;

import java.util.ArrayList;

public class Venda {
    
    private TipoEntrega tipoEntrega;
    private ArrayList<Produto> produtos = new ArrayList();
    private Cliente cliente;
    private Vendedor vendedor;

    public TipoEntrega getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(TipoEntrega tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public void inserirProduto(Produto produto){
        if(produtos.size() >= 10){
            throw new IllegalArgumentException("Limite máximo de produtos atingido.");
        } else {
            produtos.add(produto);
        }
    }
    
    public double calcularValorProdutos(){
        if(produtos.size() == 0 || cliente == null){
            throw new IllegalArgumentException("Falta adcionar produtos ou cliente a compra.");
        }
        
        double total = 0;
        
        for(Produto p : produtos){
            total += p.getValor();
        }
        
        if(cliente.isMesAniversario()){
            return total * 0.95;
        }
        
        return total;
    }
    
    public double calcularValorEntrega(){
        if(tipoEntrega == null){
            throw new IllegalArgumentException("Tipo de entrega não definido.");
        }
        
        if(this.getTipoEntrega() == TipoEntrega.RETIRADA_LOCAL){
            return 0;
        } else if (this.getTipoEntrega() == TipoEntrega.ENCOMENDA_PAC){
            return 7.75;
        } else {
            double pesoTotal = 0;
            
            for(Produto p : produtos){
                pesoTotal += p.getPeso();
            }
            
            return (10 + (pesoTotal * 0.025));
        }
    }
    
    public double calcularComissao(){
        if(vendedor == null){
            throw new IllegalArgumentException("Falta definir um vendedor a venda.");
        }
        
        return (this.calcularValorProdutos() * vendedor.getPercentualComissao());
    }
    
    
}
