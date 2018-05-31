/*
 * @author DarthKadik
 */  
public class Kezelo {
    private static Window ablak;
    
    public static void main(String[] args) throws java.io.IOException {
        ablak = new Window();
    }
    
    public static void setEredmenyMeghivasa(int szam){
        ablak.setEredmenyLabel(szam);
    }
    
}
