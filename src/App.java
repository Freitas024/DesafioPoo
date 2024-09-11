public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Cliente: \n");
        Cliente c1 = new Cliente("Vinicius", "0321.654.8645/0003-45");
        System.out.println(c1.getNome());
        System.out.println(c1.getCnpj());

        System.out.println("=====================================================================================");

        System.out.println("Funcionario(a): \n");
        Funcionarios Func1 = new Funcionarios("Keyla Adriely", "1302.56454.8462/0004-45", 18000);
        System.out.println(Func1.getNome());
        System.out.println(Func1.getCnpj());
        System.out.println(Func1.getSalario());
        
        System.out.println("=====================================================================================");
        
    
    }
}
