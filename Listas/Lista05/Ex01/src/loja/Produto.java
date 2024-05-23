package loja;

public class Produto {
    private String nome;
    private int quantidadeEstoque;
    private String cor;
    
    public Produto(String nome, int quantidadeEstoque, String cor){
        this.nome = nome;
        this.cor = cor;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public Produto(){
        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public int getQuantidadeEstoque(){
        return this.quantidadeEstoque;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }
    
    public void imprimirAtributos(){
        System.out.println(this.nome);
        System.out.println(this.quantidadeEstoque);
        System.out.println(this.cor);

    }
}
