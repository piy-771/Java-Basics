import javax.swing.*;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {

     try{
         int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
         if(age<0){
             System.err.println("Invalid age");
         }
     }
     catch (NumberFormatException numberFormatException){
         JOptionPane.showMessageDialog(null,"Enter a input of integer type " + numberFormatException );
     }
     JOptionPane.showMessageDialog(null,"Process over");
    }
}
