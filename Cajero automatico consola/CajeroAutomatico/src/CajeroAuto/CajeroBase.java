package CajeroAuto;
import java.util.Scanner;
public abstract class CajeroBase{
    Scanner scan = new Scanner(System.in);
    private static int saldo=500;
    public int a;
    
    protected abstract void operacion();

    protected void exito(){
        System.out.println("Operacion realizada con exito.");
    }
    protected int saldoGetter(){
        return saldo;
    }
    protected void saldoSetter(int saldete){
        saldo = saldete;
    }
    
}
