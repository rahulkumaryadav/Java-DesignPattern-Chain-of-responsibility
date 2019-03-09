import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        CEOPurchesPower ceoPurchesPower=new CEOPurchesPower();
        DirectorPurchesPower directorPurchesPower=new DirectorPurchesPower();
        ManagerPurchesPower managerPurchesPower=new ManagerPurchesPower();



        ceoPurchesPower.setSucessor(directorPurchesPower);
        directorPurchesPower.setSucessor(ceoPurchesPower);
        managerPurchesPower.setSucessor(directorPurchesPower);



        while (true){
            System.out.println("Enter the amount who shoul approve ur budget");
            System.out.println(">>");


            try {
                double d=Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                managerPurchesPower.processRequest(new PurchesRequest(d,"By Stuff"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
