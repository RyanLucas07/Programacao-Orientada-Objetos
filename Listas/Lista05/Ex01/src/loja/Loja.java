package loja;

import java.util.ArrayList;

public class Loja {
    private String nomeLoja;
    private int quantidadeFuncionario;
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public Loja(String nomeLoja, ArrayList<Produto> produtos){
        this.nomeLoja = nomeLoja;
        this.produtos = produtos;
    }
    public Loja(){

    }
    
    public void setNomeLoja(String nome){
        this.nomeLoja = nome;
    }
    public String getNomeLoja(){
        return this.nomeLoja;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionario){
        this.quantidadeFuncionario = quantidadeFuncionario;
    }
    public int getQuantidadeFuncionario(){
        return this.quantidadeFuncionario;
    }
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    public ArrayList<Produto> getProdutos(){
        return this.produtos;
    }
    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }
    public void listarProdutos(){
        for (Produto produto : produtos) {
            System.out.println(produto.getNome());
        }
    }

}
