package fatecfranca.lista1;
public class Produto {
    int id; // int é um tipo de dado primitivo
    String nome; // String é um tipo de dado de Classe
    int qtde; // int é um tipo de dado primitivo
    float preco; // float é um tipo de dado primitivo
    boolean estoqueCritico; // boolean é um tipo de dado primitivo
    String descricao; // String é um tipo de dado de Classe
    // outros exemplo do tipo Classe: Integer, Float, Boolean

    public Produto(){
       
    }
    public Produto(int id, String nome, String descricao, 
            int qtde, boolean estoqueCritico, float preco){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.qtde = qtde;
        this.estoqueCritico = estoqueCritico;
        this.preco = preco;
    }
    public void mostraObjeto(){
        System.out.println("Id: " + this.id + "\n Nome " + 
            this.nome + "\n Descrição " + this.descricao +
            "\n Qtde: " +this.qtde + "\n Preço " + this.preco + 
                " Estoque crítico " + 
                (this.estoqueCritico ? "Sim" : "Não"));
    }
}
