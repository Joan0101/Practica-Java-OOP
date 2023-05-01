package CajeroAuto;


public class Cajero{

    Bienvenido welcome = new Bienvenido();
    
    
    public void comenzar(){
        do{     
            welcome.operacion();
        if(welcome.a!=4){ // Condicional sobre a de welcome por que es el numero que determina que funcion aplicar
            if(welcome.a==1){
                Consultar query = new Consultar();
                query.operacion();
            }else{
                if(welcome.a==2){
                    Retirar withdraw = new Retirar();
                    withdraw.operacion();
                }else{
                    if(welcome.a==3){
                        Depositar toDeposit = new Depositar();
                        toDeposit.operacion();
                    }
                }
            }
        }
        }while(welcome.a!=4);
 
    }
}
