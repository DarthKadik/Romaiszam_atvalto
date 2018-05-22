/*
 * @author DarthKadik
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
import java.io.IOException;
import java.text.DecimalFormat;


public class Szam {
    private static ArrayList<Character> romaiSzam = new ArrayList<>();
    private static ArrayList<Integer> arabSzamLista = new ArrayList<>();
    private static int eredmeny;
  

            
    public static void setSzam(String szam) throws IOException {
        
        Locale.setDefault(new Locale("hu", "HU")); //Végeredmény (eredmeny) megfelelő megjelenítéséhez
        
        for (int i = 0; i < szam.length(); i++) { //Character tömbből Integer tömbbé
            romaiSzam.add(szam.charAt(i));
            
                switch (romaiSzam.get(i)) {
                    case 'I':
                        arabSzamLista.add(1);
                        break;
                    case 'V':
                        arabSzamLista.add(5);
                        break;
                    case 'X':
                        arabSzamLista.add(10);
                        break;
                    case 'L':
                        arabSzamLista.add(50);
                        break;
                    case 'C':
                        arabSzamLista.add(100);
                        break;
                    case 'D':
                        arabSzamLista.add(500);
                        break; 
                    case 'M':
                        arabSzamLista.add(1000);
                        break;
                    default:
                        System.out.println("Használj római számokat");
                        arabSzamLista.add(0);
                        break;
                }    
        }
   
    }
    
    public static int getEredmeny() throws java.io.IOException {
        int szl = arabSzamLista.size() - 1;
        while ( szl > 0) { //Lista vizsgálata hátulról elölre
            if (arabSzamLista.get(szl) <= arabSzamLista.get(szl - 1)) {
                eredmeny = eredmeny + arabSzamLista.get(szl);
                szl--;
            }
            else {
                eredmeny = eredmeny + (arabSzamLista.get(szl) - arabSzamLista.get(szl - 1));
                szl--;
                szl--;
            }
        }
       
        if (arabSzamLista.get(0) >= arabSzamLista.get(1)) { //IX helyett 10-et jelenített meg
            eredmeny = eredmeny + arabSzamLista.get(0);
        }
       
        return eredmeny;
    }
    
}
