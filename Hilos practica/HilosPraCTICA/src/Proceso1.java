public class Proceso1 extends Thread{

    
    @Override
    public void run(){
        for(int i=0;i<3;i++){
            System.out.print("G");
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error en el proceso 1 "+e);
            }
        }
    }

}
