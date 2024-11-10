import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Array Syntax;
//        datatype[] variable_name = new datatype[size]

        //How array work internally

        int[] ros; //declaration of array.ros is getting defined in the stack
        ros = new int[5]; //initialisation: actually here object is being created in the memory(heap)
        //array of primitive
//        for(int i =0;i<5;i++){
//            ros[i] = in.nextInt();
//        }
//        for(int i =0;i<5;i++){
//            System.out.print(ros[i] + " ");
//        }
//
//        for(int num : ros){ //for every element in array, print the element
//            System.out.print(num + " "); //here num represents element of the aaray
//        }
//
//        System.out.println(Arrays.toString(ros));

        //array of object
        String[] str = new String[4];
        for(int i =0;i<4;i++){
           str[i] = in.next();
        }
        for( String num : str){
            System.out.print(num + " ");
        }

    }
}