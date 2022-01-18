import com.sun.org.apache.xpath.internal.objects.XString;

import javax.swing.*;
import java.util.*;

public class gubbe {
    public static void main(String[] args) {
       // String text1 = ("Vill du välja ord? ja/nej");
        //if (text1 = ja){
          //  JOptionPane.showInputDialog("Skriv ditt ord");
        //}
        //else{

        //}


        String stri = "Hello jag heter";
        String strar[] = stri.split(" ");
        String random = (strar[new Random().nextInt(strar.length)]);
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(strar));
        System.out.println(random);
        for (int x = 0; x < arr.size(); x++) {
            System.out.println("ordet är valt");
        }
        System.out.println("gissa en bokstav");
        Scanner in = new Scanner(System.in);
        String gissning = in.nextLine();
        gissning = gissning.toUpperCase();
        System.out.println(gissning);
        //for ()
    }
}
