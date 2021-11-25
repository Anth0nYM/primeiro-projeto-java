public class App {
    public static void main(String[] args) throws Exception {
    ContaDeBanco conta1 = new ContaDeBanco();
    conta1.agencia = 1;
    conta1.numero = 1;
    conta1.nomeCliente = "Anthony";
    conta1.saldo = 100000.00;
    
 
    boolean deposito = conta1.depositar(10000);
     System.out.println(deposito); 
  
     double saque = conta1.saca(200.00);
     System.out.println(saque);
    }
}

