package CajeroAuto;

public class Retirar extends CajeroBase {
    
    @Override
    public void operacion(){
        System.out.println("-----------------------------------------");
        System.out.println("Ingrese el monto total a retirar. ");
        a=scan.nextInt();

        switch(a){
            case 1:
                System.out.println("-----------------------------------------");
                System.out.println("Retiro realizado con exito.");
                System.out.println("El monto retirado es una suma de: "+saldoGetter());
                saldoSetter(0);
                System.out.println("Su saldo actual: "+saldoGetter());
                System.out.println("-----------------------------------------");
            break;
            case 2:
            System.out.println("-----------------------------------------");
                    System.out.println("Operacion cancelada, sera dirigido al menu principal.");
                    System.out.println("-----------------------------------------");

        }
        if(saldoGetter()<a){
            System.out.println("El monto que usted esta intentando retirar es superior al disponible en su cuenta.");
            System.out.println("Desea retirar la totalidad del dinero disponible en su cuenta?");
            System.out.println("1. Si.");
            System.out.println("2. No.");
            a=scan.nextInt();
            while(a!=1 && a!=2){
                System.out.println("Elija una opcion valida.");
                System.out.println("1. Si.");
                System.out.println("2. No.");
                a=scan.nextInt();
                System.out.println(a);
            }

            if(a==1){
                System.out.println("-----------------------------------------");
                System.out.println("Retiro realizado con exito.");
                System.out.println("El monto retirado es una suma de: "+saldoGetter());
                saldoSetter(0);
                System.out.println("Su saldo actual: "+saldoGetter());
                System.out.println("-----------------------------------------");
            }else{
                if(a==2){
                    System.out.println("-----------------------------------------");
                    System.out.println("Operacion cancelada, sera dirigido al menu principal.");
                    System.out.println("-----------------------------------------");
                }
            }
         
        }else{
            if(a>0){
                System.out.println("-----------------------------------------");
                System.out.println("Usted retiro un total de: "+a);
                saldoSetter(saldoGetter() - a);
                System.out.println("Su saldo actual: "+saldoGetter());
                exito();
                System.out.println("-----------------------------------------");
                
        }
      }
    }
}
