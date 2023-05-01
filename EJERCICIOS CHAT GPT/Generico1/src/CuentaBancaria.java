
import java.util.Scanner;

public class CuentaBancaria {
    Scanner scan = new Scanner(System.in);
    private int saldo=0;
    String yesOrNo;
    /* Crear una clase "CuentaBancaria" con atributos como número de cuenta, 
    nombre del titular y saldo. Luego, crear métodos para depositar y retirar 
    dinero de la cuenta, y para imprimir el saldo actual. Asegurarse de que el 
    método de retiro no permita retirar más dinero del que hay en la cuenta. */
    
    public int getSaldo() {
        return saldo;
    }
    public void mostrarSaldo(){
        System.out.println("Su saldo es: "+getSaldo());;
    }
    public void retirar(){

        System.out.println("Seleccione la cantidad que desea retirar");
        int cantidad = scan.nextInt();
        if(saldo==0){
            System.out.println("Usted no dispone de dinero en la cuenta");
        }else{

            if(saldo<cantidad){
                System.out.println("La cantidad ingresada es mayor a la disponible. Desea retirar el dinero disponible en la cuenta? [Y/N]");
                yesOrNo= scan.next();
                while(!(yesOrNo.equals("Y")) && !(yesOrNo.equals("y")) && !(yesOrNo.equals("N")) && !(yesOrNo.equals("n"))){
                    System.out.println("Por favor, ingrese Y o N");
                    yesOrNo= scan.next();
                }

            if(yesOrNo.equals("Y") || yesOrNo.equals("y")){
                    saldo= saldo-cantidad;
                    if(saldo<0){
                        saldo=0;
                    }
                    mostrarSaldo();
                } else{
                    System.out.println("Entendido, se le devolvera al menu principal");
                }
    
            }
        }
        
    }

    public void depositar(){
        System.out.println("Ingrese la cantidad que desea depositar");
        int cantidad = scan.nextInt();
        saldo+=cantidad;
        System.out.println("Deposito realizado con exito.");
        mostrarSaldo();
    }
}
