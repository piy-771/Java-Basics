import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Piyush",56.32);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(45.85);
        System.out.println("Balance for Customer " + customer.getName() + " is " + customer.getBalance());


        ArrayList<Integer>  intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(5);

        for(int i =0;i<intList.size();i++){
            System.out.println(i + " : " + intList.get(i));
        }
        intList.add(1,8);

        for(int i =0;i<intList.size();i++){
            System.out.println(i + " : " + intList.get(i));
        }
    }
}