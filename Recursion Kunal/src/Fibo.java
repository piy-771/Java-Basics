public class Fibo {
    public static void main(String[] args) {
//        int ans = fibo(4);
//        System.out.println(ans);
        String[] names = {"Apple"," Mango"," Orange", "Banana"};
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].length() > names[j].length()) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }

            }
        }
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");

        }

        for (int i = names.length-1; i >= 0; i--) {
            for (int j = names.length-2; j>=0; j--) {
                if (names[i].length() > names[j].length()) {
                    System.out.println(names[i]);
                    break;
                }
                else {
                    System.out.println(names[0]);
                }
                break;
            }
            break;
        }
//            for (int i = names.length - 1; i >= 0; i--) {
//                if (names[i].length() > names[i - 1].length()) {
//                    System.out.println(names[i]);
//                    break;
//
//                }
//            }

//        for(int i =0;i< names.length;i++){
//            for(int j = 1;j<names.length;j++){
//                if(names[i].length()<names[j].length()){
//                    continue;
//                }else {
//                    System.out.println(names[j]);
//                    break;
//                }
//            }
//        }
//        for(int i = 0;i<names.length;i++){
//            System.out.println(names[i]);
//        }
            }
//    static int fibo(int n){
//        if (n < 2) {
//            return n;
//        }
//        return  fibo(n-1) + fibo(n-2);
//    }

        }
