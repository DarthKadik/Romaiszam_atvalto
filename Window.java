/*
 * @author DarthKadik
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

@SuppressWarnings("Serial") //A fordíto megynyugtatása, JFrame miatt
public class Window extends JFrame implements ActionListener{ //JFrame alosztálya, ablak deklarálása
    private static final long serialVersionUID = 1L;
    
    JButton gomb =new JButton("OK");
    JLabel eredmenyLabel = new JLabel("");
    JLabel eredmenyElotag = new JLabel("Az eredmény:");
    JTextField bevitel = new JTextField(5);
    
    
    public Window() throws java.io.IOException{
        setTitle("Római szám átváltó");
        add(bevitel);
        add(gomb);
        gomb.addActionListener(this);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setAlwaysOnTop (true);
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        try {
            add(eredmenyElotag);
            add(eredmenyLabel);
            Szam.setSzam(bevitel.getText());
        } catch (IOException ex) {
            eredmenyLabel.setText("Ajjaj, valami baj van");
        }
    }
    
    public  void setEredmenyLabel(int szam) {
        this.eredmenyLabel.setText(Integer.toString(szam));
    }
    
    public void error() {
        this.bevitel.setVisible(false);
        this.eredmenyElotag.setVisible(false);
        this.eredmenyLabel.setText("Használj római számokat (pl.: MMCD)");
    }
}
