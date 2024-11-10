import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
 //   public  static int[] baseArray = new int[10];
    public static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
//        printArray(baseArray);
//
//        resize();
//        baseArray[10] =56;
//        baseArray[11] = 95;
//        printArray(baseArray);
//
//        getInput();
        boolean quit = false;
        int choice  = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice :");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
groceryList.printGroceryList();
break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;

            }
        }
    }
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice option");
        System.out.println("\t 1 - To print the list of grocery list");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search an item in the list");
        System.out.println("\t 6 - To quit the application");
    }
    public static void addItem(){
        System.out.println("Please enter the grocery item : ");
        groceryList.addGroceryItem(sc.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter current item name: ");
        String itemNo = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter replacement item : ");
        String newItem = sc.nextLine();
        groceryList.modifyGroceryItem(itemNo,newItem);
    }
    public static void removeItem(){
        System.out.println("Enter item number: ");
        String itemNo = sc.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }
    public static void searchForItem(){
        System.out.print("Enter the item search for :");
        String searchItem = sc.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem );
        }else {
            System.out.println(searchItem + " not on file");
        }
        
    }
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
//public static void getInput(){
//
//        for(int i =0;i<baseArray.length;i++){
//            baseArray[i] = sc.nextInt();
//        }
//}
//public static void printArray(int[] arr) {
//    for (int i = 0; i < arr.length; i++) {
//        System.out.print(arr[i] + " ");
//        System.out.println();
//    }
//}
//    public static void resize () {
//        int[] original = baseArray;
//        baseArray = new int[12];
//        for (int i = 0; i < original.length; i++) {
//            baseArray[i] = original[i];
//        }
//    }
}

