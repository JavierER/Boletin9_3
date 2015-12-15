package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Boletin9_3 {

    
    public static void main(String[] args) {
    int alt = Integer.parseInt(JOptionPane.showInputDialog("Altura:"));
    int base = Integer.parseInt(JOptionPane.showInputDialog("Base:"));
    while (base>0 & alt >0){
    if (base>0 && alt>0){
      JOptionPane.showMessageDialog(null,"La Area es: "+(base*alt));
    }
    else {
      JOptionPane.showMessageDialog(null,"La altura o la base son negativas");
    }
    }
    }
    
}
