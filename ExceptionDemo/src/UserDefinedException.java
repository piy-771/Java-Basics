import javax.swing.*;

class AgeValidator extends  Exception{
    public AgeValidator(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

class AgeValidation{
    public void validateAge() throws  NumberFormatException{
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
        try{
            if(age<18) throw  new AgeValidator("Error:age can not be less than 18");

        }catch (AgeValidator ageValidator){
            System.out.println(ageValidator.getMessage());
        }
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        AgeValidation obj = new AgeValidation();
        try{
            obj.validateAge();
        }catch (NumberFormatException numberFormatException){
            System.out.println(numberFormatException);
        }
    }
}
