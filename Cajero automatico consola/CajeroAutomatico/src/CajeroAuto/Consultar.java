package CajeroAuto;

public class Consultar extends CajeroBase{
    
    @Override
    protected void operacion(){
        System.out.println("-----------------------------------------");
        System.out.println("Su saldo es de : "+saldoGetter());
        System.out.println("-----------------------------------------");
    }
}
