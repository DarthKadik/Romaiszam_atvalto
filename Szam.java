/*
 * @author DarthKadik
 */

import java.util.ArrayList;
import java.util.Locale;
import java.io.IOException;


public class Szam {
    private static ArrayList<Character> romaiSzam = new ArrayList<>();
    private static ArrayList<Integer> arabSzamLista = new ArrayList<>();
    private static int eredmeny;
  

            
    public static void setSzam(String szam) throws IOException {
        romaiSzam.clear();
        arabSzamLista.clear();
        eredmeny = 0;
        
        Locale.setDefault(new Locale("hu", "HU")); //Végeredmény (eredmeny) megfelelő megjelenítéséhez
        
        boolean error = false;
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
                        Window hibaÜzenet = new Window();
                        hibaÜzenet.error();
                        //arabSzamLista.add(0)
                        error = true;
                        
                }
                
                if (error) {
                    break;
                } 
         
        }

        int szl = arabSzamLista.size() - 1;
        while ( szl >= 0) { //Lista vizsgálata hátulról elölre
            if ((szl == 0) || (arabSzamLista.get(szl) <= arabSzamLista.get(szl - 1))) {
                eredmeny = eredmeny + arabSzamLista.get(szl);
                szl--;
            }
            else {
                eredmeny = eredmeny + (arabSzamLista.get(szl) - arabSzamLista.get(szl - 1));
                szl--;
                szl--;
            }
        }
       
       Kezelo.setEredmenyMeghivasa(eredmeny);
    }
    
}
