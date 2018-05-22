/*
 * @author DarthKadik
 */

import java.text.DecimalFormat;
import java.util.Locale;    
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Kezelo {
    private static ArrayList<Character> romaiSzam = new ArrayList<>();

    static Scanner szkenner = new Scanner(System.in); // Új Scanner példány létrehozása a billentyűzetről való beolvasáshoz
    
    public static void main(String[] args) throws java.io.IOException{
         System.out.println("Írj be egy római számot I és MMMCMXCIX között!");
       
        String szam = szkenner.nextLine();
        Szam.setSzam(szam); //A szám osztály setSzam metódusának hívása, a szam String átalakítása Integer tömbbé
        new Window();   //Ablak megjelenítése (csak úgy)
        szkenner.close();
       
    }
    
    public static String getEredmenyString() throws java.io.IOException {  //javax.swing.JLabel paramétere String kell, hogy legyen, eredmeny átalakítása Stringé
        DecimalFormat formatum = new DecimalFormat();
        return formatum.format(Szam.getEredmeny());
        
    }
    
}
