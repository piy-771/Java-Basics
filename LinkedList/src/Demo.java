import java.util.*;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "bhopal");
        addInOrder(placesToVisit, "ujjain");
        addInOrder(placesToVisit, "indore");
        addInOrder(placesToVisit, "jabalpur");
        addInOrder(placesToVisit, "sagar");
        printList(placesToVisit);
        addInOrder(placesToVisit,"alasta");
        addInOrder(placesToVisit,"indore");
        printList(placesToVisit);
        visit(placesToVisit);

//        printList(placesToVisit);
//        placesToVisit.add(1, "Bina");
//        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now Visiting " + i.next());
        }
        System.out.println("=======================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {


        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //equal, not to add
                System.out.println(newCity + " already included as a destination");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;

            } else if (comparison < 0) {
                // move to next city
            }
        }
        stringListIterator.add(newCity);
return true;
    }
    public static void visit(LinkedList cities){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward= true;
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("No cities in itenenary");
            return;
        }else{
            System.out.println("Now Visiting " + listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = sc.nextInt();
            sc.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now Visiting " + listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("Available Actions:\npress");
        System.out.println("0 - to quit\n"+
                "1 - go to next city\n"+
                "2 - go to previous city\n"+
                "3 - print menu option");
    }

}