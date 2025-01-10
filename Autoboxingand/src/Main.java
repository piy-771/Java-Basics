import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Punjab national bank");

        bank.addBranch("Katra");

        bank.addCustomer("Katra","Harsh",10000.00);
        bank.addCustomer("Katra","Neeraj",3000.00);
        bank.addCustomer("Katra","Pranay",7000.00);

        bank.addBranch("Civil Line");
        bank.addCustomer("Civil Line","Mayank",45000);

        bank.addCustomerTransaction("Katra","Harsh",5600.02);
        bank.addCustomerTransaction("Katra","Harsh",4560.02);
        bank.addCustomerTransaction("Katra","Pranay",6520.50);

        bank.listCustomers("Katra",true);
        bank.listCustomers("Civil Line",true);

        bank.addBranch("Makroniya");
        if(!bank.addCustomer("Makroniya","Rohan",5621.02)){
            System.out.println("Error Makroniya does not exist");
        }
        if(!bank.addBranch("Katra")){
            System.out.println("Katra is already exist");
        }
    }
}