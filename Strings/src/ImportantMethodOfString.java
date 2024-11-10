import java.util.Scanner;

public class ImportantMethodOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String input = "Ramesh Sharma";
        //To get the length of string
        //int length = input.length();
        //getting character from string by using char charAt(int index)
        //char firstChar = input.charAt(0);
        //getting index of
        String[] namesOfStudents = new String[25];
        System.out.println("Enter name of students");
        for (int i = 0; i < namesOfStudents.length; i++) {
            namesOfStudents[i] = scanner.nextLine();
        }

        for (int i = 0; i < namesOfStudents.length; i++) {
            if(namesOfStudents[i].contains("a")){
                System.out.println(namesOfStudents[i]);
            }
            }
        //print all the student name whose first name ends with a
    }
}
