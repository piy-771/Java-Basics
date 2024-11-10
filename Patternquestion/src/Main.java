public class Main {
    public static void main(String[] args) {
        //Solid Rectangle
//        int n = 4;
//        int m = 5;
//        for(int i =0;i<n;i++){
//            for(int j = 0;j<m;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i =0;i<n;i++){
//            for( int j = 0;j<m;j++){
//                if(i == 0 || i == n-1 || j==0 || j==m-1){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i =0;i<n;i++){
//            for(int j =0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i =0;i<n;i++){
//            for(int j =0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <6; j++) {
                if (i == 0 || j == 0 || i==5 || j == 5) {
                    System.out.print("* ");
                }else if((i== j)){
                    System.out.print("* ");
                }
                else if((i+j== 5)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }


            }
            System.out.println();
        }
    }
}