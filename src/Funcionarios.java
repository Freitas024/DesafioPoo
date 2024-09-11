public class Funcionarios extends Cliente{
    private double salario;

    public Funcionarios(String nome, String cnpj, double salario) {
        super(nome, cnpj);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
   
}
