import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int[][] array = new int[2][3];
       //array = {{1,2,3},{4,5,6}};

//        System.out.println(array.length);
//        for(int i = 0;i<array.length;i++){
//            for (int j = 0; j < 3; j++) {
//                    array[i][j] = scanner.nextInt();
//            }
//        }
//
        for(int i = 0;i<array.length;i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

       int[][][] array3D = new int[2][2][3];
//       array3D = {
//                {
//                        {1, 2, 3},
//                        {4, 5, 6}
//                },
//                {
//                        {7, 8, 9},
//                        {10, 11, 12}
//                }
//        };

        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0;k < array3D[i][j].length;k++){
                   // System.out.println("Element at [" + i + "][" + j + "][" + k + "]: " + array3D[i][j][k]);
                    System.out.print(array3D[i][j][k]+ " ");
                }
                System.out.println();
            }
            
        }
       // System.out.println(array.length);


//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                for (int k = 0; k < 5; k++) {
//                    System.out.print(array[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//        }

    }
}
