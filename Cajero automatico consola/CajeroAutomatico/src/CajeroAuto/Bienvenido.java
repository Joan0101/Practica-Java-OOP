package CajeroAuto;

public class Bienvenido extends CajeroBase{
    
    @Override
    protected void operacion(){
            System.out.println("1. Consultar saldo. ");
            System.out.println("2. Retirar.");
            System.out.println("3. Depositar.");
            System.out.println("4. Salir");
            a=scan.nextInt();
            
    }

    

}
