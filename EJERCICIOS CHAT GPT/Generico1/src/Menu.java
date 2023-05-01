import java.util.Scanner;
public class Menu {
    Scanner scan = new Scanner(System.in);
    CuentaBancaria cuenta = new CuentaBancaria();
    int opcion=0;
    
    public Menu(){
        do{
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            

            opcion = scan.nextInt();
    
            while(opcion>4 || opcion<1){
                System.out.println("Por favor, ingrese una opcion correcta");
                opcion = scan.nextInt();
            }
            
            switch(opcion){
                case 1: cuenta.depositar();
                break;
                case 2: cuenta.retirar();
                break;
                case 3: cuenta.mostrarSaldo();
                break;             
            }
        }while(opcion!=4);
    }
}
