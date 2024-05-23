import loja.Loja;
import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Loja minhaLoja = new Loja();
        minhaLoja.setNomeLoja("Minha loja mil grau");

        Produto produto1 = new Produto("Coca-cola", 15, "vermelha");
        produto1.setNome("Coca Cola");
        produto1.getCor();
        produto1.getQuantidadeEstoque();
        minhaLoja.adicionarProduto(produto1);

        Produto produto2 = new Produto();
        produto2.setNome("Pepsi");
        produto2.setCor("Azul");
        produto2.setQuantidadeEstoque(25);
        minhaLoja.adicionarProduto(produto2);

        minhaLoja.listarProdutos();
    }
}
