import javax.swing.*;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        try{
            if(name.length() <3){
                System.err.println("Invalid name");
            }
            else{
                JOptionPane.showMessageDialog(null,"Hello " + name);
            }
        }
        catch (NullPointerException nullPointerException){
            JOptionPane.showMessageDialog(null,"String can not be null " + nullPointerException);
        }
        JOptionPane.showMessageDialog(null,"Process Over");
    }
}
