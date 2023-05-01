package CajeroAuto;

public class Depositar extends CajeroBase {
    
    
    @Override
    protected void operacion(){
        System.out.println("-----------------------------------------");
        System.out.println("Ingrese el monto total a depositar. ");
        a=scan.nextInt();
        if(a>0){
            System.out.println("Usted ha depositado un total de: "+a);
            saldoSetter(saldoGetter() + a);
            System.out.println("Su saldo actual: "+saldoGetter());
            exito();     
            System.out.println("-----------------------------------------");      
            }else{
                System.out.println("Porfavor, ingrese un monto valido");
            }
        }
}
