import javax.swing.*;
import java.util.Random;

public class PopBox {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Ennter Your NName");
        JOptionPane.showMessageDialog(null, "Hello,\n"+name);
        Random rd = new Random();
        int z = rd.nextInt();
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
        JOptionPane.showMessageDialog(null, "You are "+z+" old");
        JOptionPane.showMessageDialog(null, "But For Real \n\tYou are "+age+" old");
    }
}
