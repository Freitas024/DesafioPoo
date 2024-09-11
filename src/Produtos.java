public class Produtos {
    private String id;
    private String categoria;
    private double preco;

    public Produtos(String id, String categoria, double preco){
        this.id = id;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco ){
        this.preco = preco;
    }

}
