/*
 * @author DarthKadik
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("Serial") //A fordíto megynyugtatása, JFrame miatt
public class Window extends JFrame{ //JFrame alosztálya, ablak deklarálása
    public Window() throws java.io.IOException{
        setTitle("Római szám átváltó");
        add(new JLabel("Az eredmény:"));
        add(new JLabel(Kezelo.getEredmenyString()));
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setAlwaysOnTop (true);
        setVisible(true);
        
    }
}
