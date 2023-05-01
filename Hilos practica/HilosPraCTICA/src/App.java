import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {
        
        Proceso1 letra1 = new Proceso1();
        Proceso2 letra2 = new Proceso2();
        Proceso3 letra3 = new Proceso3();

        
        letra1.start();
        letra1.sleep(10);
        letra2.start();
        letra2.sleep(20);   
        letra3.start();
        letra3.sleep(30);
        System.out.println(Math.PI);


        
    }
}
