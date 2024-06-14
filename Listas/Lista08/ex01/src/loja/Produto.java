package loja;

import exception.NomeInvalidoException;
import exception.PrecoInvalidoException;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }


    public void setNome(String nome) throws NomeInvalidoException{
        if(nome.length() > 3){
            this.nome = nome;
        }

        throw new NomeInvalidoException();
    }
    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco) throws PrecoInvalidoException{
        if(preco > 0){
            this.preco = preco;
            return;
        }

        throw new PrecoInvalidoException();
    }
    public double getPreco(){
        return this.preco;
    }
}
