public class Vendas {
    private String data;
    private double valor_total; 
    private int itens_comprados;

    public Vendas(String data, double valor_total, int itens_comprados) {
        this.data = data;
        this.valor_total = valor_total;
        this.itens_comprados = itens_comprados;
    }
    
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public double getValor_total() {
        return valor_total;
    }
    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
    public int getItens_comprados() {
        return itens_comprados;
    }
    public void setItens_comprados(int itens_comprados) {
        this.itens_comprados = itens_comprados;
    }

}
