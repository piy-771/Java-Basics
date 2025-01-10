/*Comparing Two Character Arrays with Case Insensitivity
Objective: To verify that two arrays—one containing lowercase characters and the other containing uppercase characters—are equal when compared in a case-insensitive manner.

Input: Array 1: An array of lowercase characters. Array 2: An array of uppercase characters. Expected Output: The two arrays should be considered equal if they contain the same characters when case differences are ignored.

   char[] array1 = {'a', 'b', 'c', 'd'}; char[] array2 = {'A', 'B', 'C', 'D'}; For this use the below function public static boolean compareArraysIgnoreCase(char[] array1, char[] array2) this method will return true if array are equals otherwise false.

Test Cases:
Test Case 1:

Input: array1 = {'a', 'b', 'c', 'd'}, array2 = {'A', 'B', 'C', 'D'}
Expected Output: true

Test Case 2:

Input: array3 = {'j', 'a', 'v', 'a'}, array4 = {'J', 'A', 'V', 'A'}
Expected Output: true

Test Case 3 (Failure Case):

Input: array5 = {'h', 'e', 'l', 'l', 'o'}, array6 = {'H', 'E', 'L', 'L', 'Z'}
Expected Output: false*/

public class J5SupriseTest {
    public static void main(String[] args) {

        char[] array1 = {'a', 'b', 'c', 'd'};
        char[] array2 = {'A', 'Z', 'C', 'l'};
        System.out.println(compareArraysIgnoreCase(array1,array2));
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(", World!");
//        String str4 = sb.toString();  // Output: "Hello, World!"

    }
     public static boolean compareArraysIgnoreCase(char[] array1, char[] array2){
        boolean flag = false;
        if(array1.length == array2.length){
            for (int i = 0; i <array1.length; i++) {
                if(array1[i]-32 == array2[i]){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }

        }
        if(!flag){
            return false;
        }
        else {
            return true;
        }
     }
}
