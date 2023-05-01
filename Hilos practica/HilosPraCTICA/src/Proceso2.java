public class Proceso2 extends Thread{

    
    @Override
    public void run(){
        for(int i=0;i<3;i++){
            System.out.print("A");
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error en el proceso 2 "+e);
            }
        }
    }


}