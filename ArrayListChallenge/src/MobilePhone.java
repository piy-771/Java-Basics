import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Integer> contacts = new ArrayList<>();
    public  void addContact(Integer number){
contacts.add(number);
    }
    public void  printContact(){
        System.out.println("you have " + contacts.size() + " in your mobile phone");
        for(int i = 0;i<=contacts.size();i++){
            System.out.println((i+1) + contacts.get(i));
        }
    }
    public void modifyContact(String name){
        contacts.set(name);

    }

}
