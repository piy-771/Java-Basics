import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {
        int[] arr1 = {2,1,25,63,56};
        int[] arr2 = {2,1,202,3,56};
        boolean flag = true;
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if(arr1[i] == arr2[j]){
                        flag = true;
                        break;
                    }
                    else{
                        flag = false;
                    }
                }
                if(!flag){
                    break;
                }

            }

        }



        if(flag){
            System.out.println("not equal");
        }else{
            System.out.println("equal");
        }
        /*
        char[] arr = {v,a,i};
        char[] brr = {v,a,i,b}
         */
        //wap to toggle the case of given character array
        char[] brr = {'v','A','i','3'};

        for (int i = 0; i < brr.length; i++) {
            int temp = (int)brr[i];
            if(brr[i]>='a' && brr[i]<='z'){
                brr[i] = (char)(temp-32);
            }else if(temp>='A' && temp<='Z'){
                brr[i] = (char)(temp+32);
            }
        }
        System.out.println(Arrays.toString(brr));
        //wap to count occurrence of all the alphabets in the given data array
        //char[] upperCase
        //char[] lowerCase
        //int[] upperCaseCount
        //int[] lowerCaseCount
        char[] arr = {'X','y','J','U','K','k','k','u','v','A','p','i','S','C','O','X','X','N','m','o','U','C','f','e','c','g','D','M','i','w','I','C','B','Q','A','a','c','y','P','e','c','H','z','j','W','M','y','D','D','a','t','c','T','r','a','K','a','w','D','u','t','O','j','G','S','P','m','g','Q','d','F','M','f','u','U','f','a','A','m','a','I','X','E','r','x','T','E','D','R','u','l','a','W','b','a','w','F','x','Z','l','K','K','W','T','q','E','x','f','w','w','s','p','e','a','p','z','C','C','k','o','W','s','P','C','n','F','A','t','c','Z','F','y','B','z','t','J','U','K','U','Q','u','b','W','L','U','n','j','W','r','M','w','f','q','K','k','l','c','D','U','d','u','t','S','f','e','e','r','k','n','g','i','s','j','u','R','H','j','Y','T','d','r','d','H','o','d','l','o','F','z','h','K','w','F','t','q','Y','Q','c','G','C','z','b','D','o','K','L','T','x','B','N','N','K','Y','X','m','S','w','Z','P','i','D','C','B','y','v','d','J','d','g','w','S','k','J','i','A','u','A','n','u','u','L','O','l','U','R','W','f','F','y','W','S','Q','S','M','A','X','j','J','S','L','F','t','q','V','j','n','g','v','G','P','l','Y','r','S','Z','d','K','R','m','m','b','v','y','b','J','h','k','H','i','I','D','q','P','K','g','E','N','r','s','a','m','q','r','j','N','p','e','F','b','c','u','J','C','j','Z','K','g','E','o','I','w','P','G','z','M','T','D','y','G','l','H','I','c','r','b','S','R','j','p','E','O','Q','h','d','x','n','X','u','J','M','N','c','l','H','b','I','t','F','y','f','R','C','f','I','y','P','z','n','h','u','Z','e','B','j','L','y','X','a','H','L','D','N','N','H','F','n','o','B','D','q','Y','K','J','K','W','f','O','U','N','e','y','k','q','d','q','h','H','Z','F','H','y','O','l','c','v','t','e','W','O','C','I','p','J','f','e','S','T','p','j','H','I','h','i','w','o','Y','a','k','f','e','k','v','F','m','M','R','J','B','T','f','k','B','S','E','x','o','f','s','E','i','P','L','N','t','f','O','X','E','i','O','K','O','I','S','o','a','s','l','D','d','A','n','A','e','R','o','q','f','W','n','F','I','o','r','i','P','J','r','Z','d','y','B','y','a','J','W','v','Q','O','H','p','C','w','Z','F','E','u','K','k','u','U','G','n','y','d','S','c','I','n','j','x','k','A','o','X','K','v','m','e','o','E','E','r','D','K','D','z','i','J','x','k','C','B','T','R','s','d','v','t','N','t','M','g','W','V','d','R','W','w','U','i','g','c','j','k','A','x','V','D','U','F','l','p','K','w','Y','H','B','B','u','F','v','I','p','R','Y','P','A','u','k','h','a','D','z','m','D','V','D','v','D','M','j','Z','V','c','w','c','p','U','y','N','B','r','z','h','Y','G','C','c','T','N','r','g','w','G','L','O','z','n','U','D','e','I','T','s','R','O','b','X','h','Z','O','S','X','v','A','H','s','o','F','L','K','P','f','N','N','D','D','f','D','h','O','B','F','y','j','O','Z','Z','j','H','V','T','g','P','P','s','m','P','s','L','q','e','p','R','A','U','o','N','R','T','F','b','q','g','I','C','R','x','t','C','c','Y','U','J','K','O','e','z','c','D','J','D','L','S','T','G','J','H','N','q','x','W','m','b','x','c','f','j','E','E','U','U','J','q','N','V','F','X','n','e','u','C','X','j','J','O','o','K','K','N','I','V','w','e','W','E','N','M','v','C','m','J','M','V','I','k','U','S','t','U','X','B','L','Z','J','C','o','z','u','P','o','f','E','I','J','x','b','m','t','O','G','s','z','o','i','l','p','M','p','p','q','y','m','r','m','c','O','K','l','S','X','o','h','J','H','l','F','A','Z','R','C','c','u','P','F','e','k','V','B','T','i','o','U','u','Y','Y','R','H','U','i','w','k','f','y','Y','W','p','I','h','W','C','q','L','r','L','A','Z','M','n','z','j','d','Y','T','I','w','N','p','P','p','u','n','J','x','q','p','b','W','S','l','B','O','u','H','i','N','L','j','E','K','k','f','A','E','x','x','Y','e','s','L','j','t','P','G','t','U','N','B','M','U','o','W','S','W','B','M','b','x','I','I','l','U','K','f','I','x','O','h','f','f','q','y','F','h','n','P','v','n','W','P','r','s','v','F','V','R','c','Y','F','g','E','J','Q','R','E','l','J','l','x','G','d','J','d','X','S','S','s','u','K','P','N','C','J','l','i','E','h','E','y','x','t','a','g','k','l','T','H','Z','W','y','u','j','F','k','m','b','Z','z','o','v','T','o','a','Y','n','v','D','p','i','R','O','d','o','i','L','m','M','M','z','c','Z','T','b','M','n','c','X','h','M','Q','b','p','t','w','m','l','l','I','x','m','T','K','t','i','E','Q','N','S','A','g','k','c','a','x','p','W','B','g','s','f','O','g','a','C','H','B','N','U','Z','M','e','Q','p','F','o','s','a','H','t','i','X','K','L','A','D','j','j','R','t','u','n','o','v','z','J','t','J','x','m','m','o','A','G','d','j','X','f','K','l','G','f','m','P','v','o','M','D','P','E','D','V','r','P','I','l','R','O','V','b','E','d','k','g','E','U','j','j','q','J','S','G','f','U','V','w','m','x','E','z','m','B','e','D','X','J','Z','K','m','Q','E','b','w','G','L','V','i','r','i','l','E','Z','h','g','u','T','K','O','M','d','G','O','R','v','y','r','P','r','a','J','L','h','H','O','k','f','R','A','a','J','X','R','x','B','e','h','C','s','Z','l','F','H','f','q','I','X','z','N','E','f','P','J','Q','a','r','d','f','A','l','g','N','r','n','n','W','x','r','U','u','e','Y','P','i','m','W','j','u','E','m','P','T','w','w','i','r','t','J','b','l','g','e','A','L','R','R','r','s','C','o','s','P','q','C','r','j','K','j','U','c','u','x','P','H','k','k','G','m','R','Z','Z','r','E','r','g','F','q','H','j','d','Z','U','I','p','g','Y','U','a','Y','d','B','d','W','K','Z','w','c','V','u','t','N','q','A','J','O','H','d','y','A','v','n','P','i','a','U','F','p','E','A','n','q','N','N','B','C','p','z','r','f','o','q','c','o','O','x','Q','c','s','v','T','q','j','y','H','F','T','f','b','L','j','E','D','q','l','W','z','B','s','q','i','j','Z','I','S','M','P','m','t','M','x','l','E','W','a','F','E','J','o','E','E','L','E','H','I','Y','v','G','W','H','K','u','j','a','V','e','X','I','u','O','h','l','S','j','y','z','S','I','Q','a','U','J','w','G','E','o','O','g','u','C','m','B','M','h','i','r','X','b','I','j','T','w','O','s','N','Z','M','c','f','t','F','e','e','j','D','P','t','Z','Y','y','y','z','y','X','i','d','q','l','f','P','j','J','z','m','T','p','N','q','W','s','I','C','c','w','k','M','Q','H','Y','M','H','C','m','x','F','Z','w','o','y','A','U','E','W','W','Z','B','b','q','Q','s','W','a','y','O','O','X','e','a','f','D','c','l','M','j','R','X','D','G','d','V','N','Z','Y','T','I','p','k','x','Q','r','t','O','w','l','y','S','B','O','l','x','t','N','x','S','L','x','A','Y','p','s','a','W','X','n','t','V','H','f','x','o','Q','s','Z','a','W','t','F','W','j','H','Q','D','X','C','o','b','T','t','g','r','w','F','n','T','c','n','b','Z','S','l','g','H','M','a','Z','F','A','F','k','f','j','t','a','q','e','v','c','u','K','l','s','p','F','k','n','o','X','z','h','b','G','d','v','c','n','f','X','h','g','v','A','Z','B','N','r','c','b','P','H','k','L','W','o','n','w','I','W','e','A','T','U','c','e','H','x','M','c','J','R','C','c','B','X','f','T','P','t','J','n','k','o','D','Q','l','E','C','G','c','l','q','G','B','o','G','c','W','A','X','R','O','m','f','Y','B','L','m','r','w','b','E','Z','n','e','p','G','O','M','e','i','U','M','C','M','i','I','W','h','Y','N','C','r','u','Y','h','e','F','f','T','A','H','J','Q','Z','G','x','F','b','Q','R','a','T','J','V','y','k','s','b','x','B','v','n','j','C','X','Y','x','N','z','L','h','S','y','k','v','d','e','y','H','T','x','R','R','S','N','W','Z','V','A','B','L','w','l','C','y','D','f','P','m','c','i','X','v','Y','q','Z','m','P','q','F','W','y','D','P','g','u','U','r','T','L','m','y','v','P','C','T','q','t','t','p','E','A','d','v','s','K','V','U','G','M','D','O','K','o','n','E','G','T','i','B','k','M','L','d','g','C','T','q','R','I','M','a','q','m','v','w','V','T','D','V','R','U','p','k','c','m','O','E','f','Y','L','v','c','u','r','i','G','z','o','B','k','Z','l','H','e','D','c','I','v','D','s','h','W','o','c','z','I','P','M','s','o','s','O','h','i','j','n','n','g','v','L','C','E','y','t','K','f','X','J','h','e','G','u','M','F','C','a','j','H','R','g','e','j','v','E','v','e','a','G','B','z','E','F','d','Q','m','Z','z','c','v','L','Q','w','b','Z','t','h','X','P','M','J','U','C','d','a','u','a','w','S','Y','K','K','M','u','g','i','E','y','L','e','L','w','z','g','o','f','e','v','O','f','X','t','S','d','v','M','C','N','k','i','G','i','k','r','u','I','c','k','w','S','B','R','E','s','n','y','g','A','m','Z','U','S','v','m','o','Y','r','w','X','B','Z','H','H','d','v','o','p','s','q','f','g','P','Z','K','X','s','x','f','v','v','t','p','Y','R','S','c','P','c','w','e','a','n','p','s','r','Q','h','C','R','O','U','N','I','r','G','K','l','V','Z','p','g','M','b','m','D','e','Y','R','K','V','f','P','P','x','n','a','h','l','I','P','L','r','p','m','m','s','K','f','E','b','m','P','e','y','o','R','U','E','f','S','p','B','Z','M','r','A','Q','W','f','Y','i','I','o','p','P','t','C','o','z','W','a','Q','E','F','o','i','Z','D','s','p','X','f','C','U','T','j','Z','C','F','O','H','p','o','S','G','A','C','Y','A','Y','l','k','o','m','Y','m','T','z','O','x','c','O','r','Y','u','m','H','U','B','N','N','J','K','Q','V','z','E','O','O','c','i','u','r','o','d','t','h','X','G','K','t','W','S','u','v','U','o','s','b','l','y','O','F','r','x','h','g','L','U','q','x','x','P','c','q','M','f','e','E','d','i','r','F','F','D','b','V','V','E','o','x','G','H','j','F','T','p','b','F','k','g','G','w','B','l','G','b','Q','Z','O','f','C','k','F','h','Y','G','E','N','p','e','V','d','g','l','Q','O','A','q','M','c','Q','n','f','K','m','s','j','B','L','b','P','T','j','j','G','J','J','p','u','T','c','P','j','y','s','j','j','v','l','U','Q','Z','Q','Y','M','n','H','a','C','G','e','u','Y','u','h','J','H','o','l','u','V','v','P','E','E','u','T','S','S','v','s','m','T','n','C','s','O','d','O','I','v','f','r','p','U','B','S','G','Q','u','W','G','O','D','C','b','g','l','u','q','K','T','y','U','B','m','X','P','U','I','P','A','o','W','a','t','b','i','F','x','O','z','Y','O','d','L','V','E','Z','Z','d','f','l','S','B','l','d','u','U','i','q','e','y','u','W','N','f','t','S','P','w','a','e','p','P','q','K','i','N','v','S','J','j','O','u','Z','t','f','N','d','m','c','s','z','i','k','Q','T','x','b','w','Y','e','p','n','v','C','b','M','S','I','R','I','T','c','s','j','A','P','W','F','R','e','E','Z','q','y','B','w','t','y','L','Y','p','E','T','J','l','m','k','M','J','H','Q','B','i','B','d','J','b','s','A','M','p','e','z','M','N','P','P','a','c','j','V','B','s','x','E','s','x','p','U','F','H','V','T','P','q','q','F','b','f','I','J','m','q','E','q','e','u','A','b','d','N','i','Q','Y','g','E','P','p','n','m','n','D','X','v','z','g','r','M','B','a','l','X','S','A','b','l','w','i','Z','U','i','x','z','q','S','S','U','I','H','o','N','T','Z','z','D','E','L','t','y','a','F','p','G','H','T','X','g','R','U','B','D','l','t','n','v','T','v','n','U','m','x','O','x','c','w','B','R','g','N','q','c','c','t','U','F','D','D','T','c','u','x','H','c','N','G','p','E','s','n','I','Z','p','e','x','a','b','u','s','A','S','n','O','f','X','U','j','O','S','x','a','t','X','o','Y','b','a','b','V','K','p','i','Q','z','o','M','M','B','k','y','R','f','s','p','l','F','I','F','J','D','b','N','x','b','Z','P','a','F','x','y','p','A','a','v','X','S','N','w','s','R','O','x','R','C','j','f','x','F','e','D','v','A','n','M','T','y','a','Y','D','o','p','F','w','x','k','k','H','J','x','O','H','V','s','R','m','C','l','k','p','o','S','i','T','s','g','i','n','Z','C','l','i','M','O','K','q','t','K','P','o','j','d','I','d','Y','v','g','y','h','F','j','K','n','b','O','z','K','l','Q','l','V','m','y','f','F','T','T','k','S','J','F','y','N','J','Q','b','q','W','L','V','U','u','L','V','M','q','s','Z','q','j','h','a','F','b','e','U','V','W','f','e','l','w','W','d','B','D','H','r','K','L','J','S','s','T','M','u','K','g','c','e','g','H','k','g','O','o','n','B','K','f','R','N','q','y','t','o','G','t','J','q','M','H','W','n','W','V','X','c','Q','D','a','K','l','Q','D','U','D','g','e','D','W','b','g','P','L','t','E','h','O','W','i','t','w','L','A','z','E','F','z','c','x','J','k','m','n','Z','G','T','q','f','z','g','f','U','u','N','K','a','M','L','m','g','B','J','D','y','W','a','R','D','x','e','S','Q','o','f','E','G','s','L','U','q','m','F','u','n','K','a','X','Y','j','S','Q','A','P','W','c','Z','j','D','x','n','D','N','W','T','b','m','M','A','S','Y','D','k','Z','z','a','b','U','i','E','R','S','B','A','n','R','L','r','K','N','e','V','y','G','C','J','E','t','j','A','I','u','v','Q','u','S','E','w','H','g','d','p','M','a','O','v','S','T','a','g','k','P','H','N','v','K','p','t','f','B','z','e','Y','g','e','d','q','r','x','M','o','D','l','w','P','V','B','y','b','H','l','e','D','b','A','y','n','H','c','s','K','L','N','f','F','t','G','P','x','e','t','f','r','u','k','h','o','D','U','Y','A','N','M','N','h','j','w','M','Q','h','V','O','x','O','W','I','o','W','z','T','z','N','k','U','l','H','N','j','M','B','z','H','C','a','F','H','Z','D','Z','t','E','W','k','R','Q','i','v','v','l','y','R','M','U','n','H','S','D','K','n','z','m','h','H','d','D','y','n','X','i','E','l','D','u','c','Y','U','s','r','U','N','L','m','U','I','C','o','F','X','H','s','y','H','S','p','c','a','I','k','m','U','a','V','s','k','n','S','X','V','N','c','y','X','L','T','J','f','Q','g','i','y','D','u','h','Q','I','g','Z','C','B','G','Z','l','K','L','D','G','C','d','L','O','F','m','u','y','Z','p','w','O','r','O','s','J','t','Y','n','j','h','m','x','s','c','Z','Z','e','i','x','e','E','O','J','h','X','w','R','Q','o','t','h','n','i','f','U','I','D','e','K','s','K','G','v','c','W','N','p','g','A','a','O','x','H','o','q','l','H','u','r','W','d','Y','Y','O','b','z','R','U','o','D','n','M','c','P','Q','r','A','H','J','c','a','V','i','e','B','B','P','K','v','s','z','Q','j','s','D','E','Q','X','c','y','x','N','D','C','C','z','C','Y','O','s','C','v','r','B','o','H','B','x','q','w','e','o','J','x','P','t','c','p','E','C','V','r','O','X','W','K','O','q','b','D','m','z','K','s','H','j','y','w','V','X','M','f','f','W','e','y','M','i','q','t','d','P','a','f','B','I','f','Z','s','y','X','i','k','I','B','E','V','m','u','o','U','o','C','W','D','N','b','X','w','R','v','e','e','g','x','l','B','O','d','x','D','B','T','O','V','P','g','x','s','y','N','y','T','h','B','d','G','U','w','K','h','O','Q','h','s','J','N','Y','l','N','W','h','A','y','F','l','n','t','K','F','j','G','S','z','U','z','g','D','B','g','q','b','H','g','s','E','u','b','h','K','p','N','p','G','F','K','n','T','e','C','i','M','H','n','c','L','x','P','K','X','L','U','J','B','z','T','A','s','O','z','M','i','q','i','U','R','y','P','w','F','T','t','y','y','P','I','I','m','O','i','K','m','h','a','F','a','z','I','c','d','I','R','P','P','O','I','w','X','T','J','t','k','a','R','h','q','Q','J','l','C','M','W','N','r','W','u','H','c','A','m','b','Q','b','c','P','f','O','O','W','a','c','V','r','p','e','d','y','R','j','U','G','C','J','A','y','t','K','l','Z','Z','a','A','R','j','V','O','x','b','u','c','Y','B','I','M','G','J','A','w','W','g','E','G','S','X','k','U','D','i','y','O','d','N','f','b','m','k','E','J','g','a','y','I','Q','r','G','Q','R','B','D','y','r','p','Q','C','O','G','l','o','y','Y','v','i','E','p','r','M','T','A','Q','a','k','o','A','G','Y','W','x','M','n','G','q','G','o','C','u','C','t','S','r','s','C','j','Q','M','P','J','n','I','k','k','A','R','w','n','M','i','w','K','Z','h','U','j','x','Z','G','k','L','I','f','A','H','z','I','k','o','p','W','H','y','T','J','O','q','b','f','H','X','K','A','a','D','o','I','J','B','N','P','g','V','g','f','h','Q','a','h','j','Q','O','p','J','X','x','C','M','X','m','c','r','E','E','c','p','x','A','g','D','T','x','F','R','L','O','I','v','U','C','m','x','m','m','S','X','L','s','M','h','F','t','b','l','k','j','r','A','Y','s','w','R','x','N','f','K','u','K','r','b','q','r','p','e','q','E','w','x','C','I','x','c','O','h','k','l','D','d','q','J','v','S','e','O','V','k','T','s','M','v','P','X','g','X','R','m','P','m','m','B','m','B','C','K','f','O','q','M','q','t','h','v','W','R','V','Y','f','E','G','g','c','S','g','v','D','E','C','V','g','L','f','O','B','k','f','O','v','s','Q','T','U','e','n','b','L','a','G','n','p','E','I','S','e','o','r','m','M','H','N','O','x','i','b','q','S','y','f','n','N','C','s','G','C','p','V','B','F','l','M','w','z','d','K','d','D','m','S','a','O','e','L','h','a','e','l','Z','I','z','s','V','v','C','k','l','o','J','f','H','w','q','U','C','R','s','d','W','g','F','t','g','K','x','C','M','s','N','i','S','u','y','x','c','x','T','r','m','U','W','g','K','I','e','K','B','z','J','u','e','k','Q','X','t','s','G','U','t','O','E','X','e','q','z','G','p','O','l','O','W','W','b','C','j','S','E','e','f','I','y','r','F','a','J','B','l','H','W','E','q','B','O','G','S','J','W','U','b','i','T','i','z','n','J','J','g','s','G','m','U','Z','B','B','k','G','L','O','N','h','R','m','j','o','s','h','p','z','k','N','C','H','k','B','R','D','x','d','p','O','s','j','o','r','Z','X','P','v','I','q','e','g','f','w','L','D','T','E','k','M','T','b','n','A','a','C','r','h','x','T','j','F','Y','q','d','Y','i','C','d','h','y','Y','F','W','Y','a','K','g','E','c','a','F','L','x','b','a','W','g','u','L','f','l','h','H','D','b','C','T','u','J','S','H','P','H','A','h','X','u','o','d','y','v','b','p','d','i','c','m','j','e','Z','Y','D','Z','w','W','S','q','p','y','M','o','k','P','R','d','r','q','k','z','t','z','V','q','G','g','l','w','P','W','i','h','Q','u','W','u','t','N','h','C','p','a','j','Y','Y','D','P','I','x','x','t','B','o','r','O','x','T','o','x','c','R','v','o','r','D','h','v','G','l','N','i','Y','p','A','z','y','v','t','c','t','J','y','C','M','N','V','p','H','K','C','a','R','W','g','M','d','K','T','Y','Q','y','B','T','B','S','Y','Q','T','V','t','g','C','h','l','L','c','b','x','c','I','h','x','l','h','E','K','o','C','e','I','r','q','o','T','R','N','w','E','S','a','D','X','Z','t','b','t','L','L','G','x','j','c','z','q','Y','l','Y','j','c','G','P','H','M','r','H','y','X','U','Z','u','R','q','b','a','m','w','c','E','t','m','V','K','W','e','n','Q','R','r','R','j','q','o','k','v','c','j','D','L','K','h','K','J','Y','m','M','P','s','X','C','q','J','F','z','f','z','T','i','i','z','l','A','I','Y','W','q','P','F','O','i','x','O','c','d','E','r','j','k','s','T','S','F','r','h','V','A','r','g','p','m','J','h','Y','b','F','P','g','Q','h','q','l','D','N','F','i','g','P','U','i','R','L','i','P','J','V','U','j','g','k','k','M','N','D','l','P','u','R','f','S','j','Y','n','T','l','P','C','h','k','U','e','A','J','X','F','B','a','H','w','Y','U','p','m','A','d','T','L','C','J','F','f','f','w','c','c','p','U','I','k','d','J','z','t','T','v','l','U','f','y','q','u','Y','V','D','t','X','k','q','R','j','m','A','V','r','S','y','Z','h','I','D','a','t','q','w','O','p','k','t','b','Q','C','H','k','W','l','z','P','T','f','R','A','s','o','D','t','E','y','j','p','x','p','J','C','e','E','r','V','s','B','y','Y','X','r','N','d','c','o','B','x','J','x','Y','Z','p','c','m','F','c','d','j','W','Z','P','l','V','K','P','s','l','d','d','H','o','v','t','P','e','C','R','x','m','v','R','S','N','X','t','P','l','q','D','r','l','X','g','L','F','u','f','C','J','p','L','X','C','T','y','l','Y','Z','f','u','d','R','G','u','j','V','M','t','Q','H','c','p','n','i','Q','w','k','i','T','r','t','x','h','s','Y','M','p','U','K','e','L','i','B','P','B','s','v','f','w','D','L','B','c','Y','t','N','G','q','G','B','m','R','G','e','k','O','b','p','N','D','j','w','Q','m','u','K','U','r','u','e','P','M','W','f','p','Z','R','r','F','k','p','p','J','F','j','m','Q','V','n','P','O','W','S','A','j','u','R','x','F','B','P','H','T','t','l','C','n','U','D','e','i','I','H','f','U','C','w','e','K','y','C','l','s','A','D','L','E','R','X','Q','i','Y','e','t','B','h','L','P','Q','F','i','n','x','O','u','K','A','E','A','W','l','x','u','R','G','C','v','w','l','O','S','N','b','c','O','I','D','V','t','D','U','L','b','J','C','i','Y','b','O','j','u','E','L','l','H','U','m','k','H','E','m','E','b','s','i','C','t','v','h','G','W','f','T','l','Z','s','O','l','k','p','K','s','F','Z','J','p','n','E','X','p','Q','o','U','m','f','i','u','H','K','W','Q','Q','c','U','s','W','A','N','S','j','m','i','W','K','L','W','T','J','V','P','m','t','s','d','m','Z','J','K','w','o','H','f','y','A','a','q','v','v','h','u','i','p','e','s','E','T','I','S','L','S','F','a','J','a','U','V','a','I','A','O','u','a','c','k','I','c','S','x','i','d','R','e','B','K','b','h','F','k','O','G','H','V','P','E','o','Z','y','t','d','J','I','Z','A','c','N','U','Z','x','q','v','L','g','K','K','v','X','e','h','a','H','X','t','L','i','n','L','E','P','e','t','n','R','O','Q','c','k','f','S','k','s','D','u','d','s','n','q','a','w','J','k','H','B','E','t','p','D','g','X','e','r','y','M','I','O','T','A','r','C','P','Q','X','t','e','y','I','Y','r','B','H','Z','R','e','m','G','i','C','Y','u','g','o','c','U','O','n','r','o','G','F','J','M','m','m','N','T','q','Q','v','f','g','Y','D','T','F','I','u','a','c','c','g','Y','w','V','n','H','B','y','Q','Q','N','k','N','I','O','t','z','v','T','x','H','n','L','k','D','t','v','P','Y','t','O','I','o','F','X','x','J','E','a','B','C','w','h','X','d','m','E','C','c','Z','B','A','T','W','p','r','m','X','n','R','k','G','o','K','s','a','d','j','X','R','x','g','X','U','P','O','F','G','F','J','j','h','r','D','e','x','f','q','n','k','R','O','O','l','H','B','C','S','q','J','C','D','P','x','p','X','A','d','a','n','t','l','c','M','w','P','C','l','B','n','r','u','x','w','b','P','n','F','g','k','B','P','T','B','f','K','j','C','s','y','w','U','O','s','A','l','n','J','K','i','K','R','Q','x','n','d','q','x','z','o','B','R','Q','b','R','w','y','Q','O','T','l','d','t','D','X','x','h','R','y','W','j','h','g','y','n','Q','y','t','y','A','v','I','j','s','F','l','v','w','r','W','s','K','A','K','i','Z','u','k','f','c','L','q','z','u','d','s','t','L','U','l','m','V','v','a','Z','m','z','L','D','L','v','p','B','h','N','Z','i','z','u','p','N','t','S','l','c','p','H','I','u','q','i','O','y','D','g','u','W','U','t','p','P','H','V','i','o','n','J','m','s','A','a','n','E','N','a','I','v','d','L','k','n','Z','u','v','r','P','H','o','X','a','M','l','N','t','C','F','y','z','D','N','H','f','Q','v','Z','E','P','i','e','Z','i','W','l','t','D','x','Z','d','W','C','C','Y','W','O','R','r','A','K','q','X','t','g','e','u','r','h','L','R','S','K','e','p','n','s','Z','A','L','F','A','W','z','y','T','Q','g','r','B','H','D','H','R','c','c','p','N','o','M','v','e','O','t','X','x','I','C','M','O','M','L','Z','B','K','O','Q','X','j','J','Y','d','v','M','E','E','G','X','L','X','U','y','U','e','Y','C','m','e','t','K','n','z','K','e','G','V','r','q','P','k','B','s','n','S','b','f','m','t','b','n','m','P','B','j','V','X','S','O','z','F','b','s','j','A','H','e','R','W','f','e','H','y','m','W','p','k','U','D','y','i','Y','U','V','n','e','r','T','F','M','b','Q','q','S','R','O','X','z','T','s','r','p','X','N','N','r','b','p','b','V','f','Z','b','c','g','S','o','X','m','S','X','E','e','L','e','B','m','y','M','L','W','o','w','V','Q','M','l','j','m','E','u','h','u','n','M','E','M','O','G','e','H','f','z','C','F','F','e','D','B','F','y','S','K','e','F','g','N','Q','p','B','o','n','x','w','I','c','Q','n','s','r','r','e','L','B','m','J','A','C','O','b','I','z','P','f','I','F','v','i','Z','e','n','R','i','d','K','X','x','g','T','b','u','w','X','f','s','D','u','K','L','K','P','D','O','M','L','d','Q','u','w','a','U','W','j','M','r','n','Q','S','V','u','D','X','D','l','l','L','r','R','q','B','c','a','u','v','g','b','Z','N','f','Y','R','b','x','Q','R','t','x','R','u','M','P','C','a','s','r','i','N','n','X','F','R','h','u','y','i','j','q','c','C','t','w','Y','u','C','G','S','a','n','n','u','X','i','I','Y','J','L','g','n','F','u','g','M','n','J','A','w','b','D','A','f','x','A','W','d','L','u','m','J','C','c','d','w','h','o','S','O','O','I','h','j','T','j','W','f','Q','a','U','V','V','T','b','g','E','g','i','j','G','n','N','K','m','w','g','M','G','F','c','R','f','K','N','S','t','q','w','V','F','v','U','Q','h','I','P','n','q','K','v','f','F','g','L','h','y','U','r','Z','I','p','A','M','X','i','a','F','q','O','c','f','b','y','j','D','k','d','N','w','f','I','T','D','h','F','I','O','o','l','y','d','I','K','z','G','j','h','x','x','g','R','L','O','I','f','P','j','g','n','y','e','w','a','v','y','k','f','f','o','s','J','H','F','K','G','d','h','k','J','P','a','A','P','G','N','W','x','T','z','K','c','J','n','m','M','L','p','d','H','c','D','R','J','O','g','F','i','Q','j','x','I','n','E','m','e','T','F','p','Q','N','P','S','s','h','h','A','O','c','d','f','q','X','V','c','p','o','a','G','L','D','W','H','l','Y','I','E','U','l','G','Q','Q','d','j','B','z','i','f','D','x','f','q','V','D','h','W','O','Z','j','n','d','B','L','m','A','n','W','E','S','n','I','J','p','x','X','e','M','p','a','t','p','w','Q','X','d','j','N','d','X','S','K','e','I','j','Z','r','n','B','D','o','M','s','T','G','g','I','O','K','a','N','c','J','R','m','k','f','N','D','i','S','p','V','i','o','n','d','m','B','k','u','p','p','H','Y','T','d','J','p','d','W','Z','N','X','I','E','Z','V','d','P','W','x','U','o','J','X','x','l','c','X','j','d','R','c','z','I','O','s','n','D','Y','K','r','b','N','X','F','q','v','E','H','O','D','J','R','p','S','B','b','N','K','Z','N','n','f','v','R','N','o','z','k','K','i','G','l','f','C','A','V','s','q','t','e','T','w','a','A','r','u','K','H','n','T','p','l','J','t','J','A','W','s','I','z','g','F','M','w','J','w','a','x','N','I','K','Q','J','z','l','f','A','V','n','F','R','A','P','K','X','X','m','W','H','m','E','E','l','E','g','t','Z','x','D','k','i','F','D','T','N','X','H','w','G','S','X','v','W','u','Q','P','A','I','o','z','O','J','E','S','t','a','p','y','o','N','k','E','z','u','m','G','b','q','K','y','d','Z','g','l','T','e','u','N','B','L','P','u','h','T','k','h','j','k','n','M','l','M','q','i','J','G','C','M','P','w','t','o','A','a','l','c','b','H','s','u','D','v','t','D','G','D','A','h','Z','t','U','T','M','Y','V','h','W','Z','m','X','g','m','J','u','n','C','N','A','G','S','z','K','T','P','j','K','I','l','w','Q','a','s','R','F','E','A','f','K','Y','r','B','x','w','R','g','P','n','y','v','E','t','H','w','M','d','e','m','i','a','A','q','B','c','X','Y','y','l','k','j','i','G','t','Z','F','o','L','T','g','n','r','D','D','A','E','J','M','o','E','b','R','f','S','y','y','z','H','I','F','r','d','v','W','K','y','o','M','H','A','J','Q','p','P','r','s','J','Y','N','g','i','h','S','i','l','H','Z','c','M','T','l','o','L','u','V','i','I','e','v','v','L','q','P','f','s','p','Z','z','I','i','p','Z','Y','i','T','C','N','n','E','w','P','n','w','m','M','h','t','A','r','N','O','L','f','C','J','P','u','O','J','W','I','K','G','s','L','V','u','V','Y','t','r','Q','X','N','q','f','P','E','Y','R','Q','y','X','U','W','M','T','b','o','k','F','D','P','e','H','M','E','t','I','K','w','H','P','p','Q','h','K','n','N','x','S','u','q','O','z','M','h','E','q','C','w','B','K','R','I','I','v','P','V','H','R','V','J','U','R','B','o','Q','V','R','R','P','B','H','d','e','e','b','a','l','m','H','X','h','D','J','k','p','v','n','N','t','R','c','t','K','E','O','C','F','q','O','E','Z','Y','M','r','H','J','E','S','d','r','E','i','r','I','Y','A','j','t','D','n','w','b','I','u','S','i','x','X','n','b','V','U','L','O','H','r','j','O','m','Z','T','Z','z','O','X','K','F','H','N','a','b','v','M','s','o','e','x','F','j','t','K','e','H','u','i','P','f','W','w','p','X','r','q','j','y','T','L','F','r','v','d','E','G','b','d','y','s','B','N','w','O','S','y','I','C','f','U','D','b','k','X','y','w','O','F','X','x','i','e','N','R','x','C','a','a','R','m','O','O','U','y','L','e','x','h','D','x','a','T','X','y','l','N','E','b','B','R','w','l','w','c','w','J','M','G','N','n','D','O','T','s','v','t','O','R','Z','P','N','y','S','E','N','a','K','n','H','y','U','T','r','z','u','m','V','J','Q','I','q','i','B','H','b','F','t','i','e','D','a','w','a','o','M','e','T','a','E','B','j','a','g','m','C','f','m','S','q','e','e','W','q','C','A','M','t','A','w','b','h','Q','e','A','v','D','R','Z','S','p','x','Q','B','P','h','t','B','k','s','G','s','i','Q','E','L','W','x','A','E','c','J','x','Y','w','Z','e','U','N','K','G','f','D','n','A','U','Q','P','B','H','X','U','l','f','F','H','c','R','A','a','G','Z','e','R','N','b','T','m','M','F','X','f','H','Q','D','r','T','u','j','U','n','n','d','L','w','I','t','I','f','b','v','H','v','I','g','X','r','f','A','d','F','m','d','f','n','P','X','u','Q','V','q','h','g','s','O','o','R','q','s','h','M','N','w','E','J','L','E','B','d','Y','M','o','L','Q','u','u','H','v','g','E','z','n','Q','T','m','D','Y','z','N','y','g','E','A','t','D','N','Y','V','j','P','u','g','K','M','E','L','F','S','V','H','r','N','v','a','B','A','x','f','W','Q','W','L','B','l','J','x','f','d','t','C','o','G','k','Q','z','I','k','a','G','c','F','p','d','y','u','B','L','G','f','F','O','L','X','c','l','b','w','D','C','m','p','D','H','F','J','t','G','e','j','A','j','U','T','e','o','Q','T','N','W','E','v','w','n','b','H','g','Z','C','V','K','s','f','q','B','y','c','o','n','y','N','e','d','g','k','C','N','V','k','Y','t','S','D','f','v','o','D','R','B','a','J','p','R','B','s','U','y','y','C','i','O','S','E','V','m','L','f','b','A','Z','c','I','d','M','B','z','q','c','o','O','S','t','a','l','S','s','w','f','n','N','i','U','A','s','I','k','R','p','N','G','j','k','C','P','R','E','O','h','R','w','B','A','X','D','p','S','T','v','e','O','X','H','Y','t','k','g','t','d','l','E','u','J','U','S','V','c','e','b','v','D','P','k','l','A','N','y','N','B','S','S','m','g','A','c','j','X','b','K','V','I','A','I','l','o','S','Z','A','g','o','a','E','g','h','O','e','D','C','A','g','y','S','V','K','z','a','q','R','b','x','R','J','w','F','o','g','d','j','U','Q','J','z','y','A','a','x','m','L','G','b','q','A','Y','v','u','m','e','p','y','r','Z','W','E','r','m','h','x','L','c','z','N','x','t','G','C','d','L','k','R','I','P','m','E','e','b','D','n','D','N','C','H','S','M','L','Y','n','d','O','h','p','Z','B','e','a','r','w','T','i','W','y','q','a','L','D','i','o','H','A','k','N','m','g','s','H','Q','v','t','X','x','u','p','g','b','f','l','f','G','N','o','i','T','q','w','C','C','P','s','W','G','g','u','M','T','J','z','h','n','u','v','h','V','H','Y','o','J','t','P','g','P','S','S','d','B','c','y','s','j','y','S','a','q','r','k','m','t','U','y','k','R','v','L','F','c','I','X','p','v','C','p','s','O','S','p','Z','F','v','P','B','G','F','R','r','m','K','l','o','i','f','g','k','y','A','M','Q','K','r','q','o','W','k','i','M','N','n','w','a','G','K','a','A','j','E','Z','D','N','H','O','G','W','a','N','q','R','S','g','V','H','b','x','c','N','l','m','M','s','N','D','t','a','e','p','B','s','y','T','L','u','k','S','u','J','O','f','n','k','b','K','d','n','U','j','R','g','b','u','Y','W','u','Q','U','z','o','Z','h','I','N','e','y','X','A','H','q','c','d','Y','I','J','x','N','l','f','u','x','m','p','t','T','o','O','I','c','f','D','o','i','h','z','J','O','r','J','b','M','M','w','q','O','Q','z','t','z','n','J','R','U','t','n','d','u','f','E','Y','H','k','i','Y','D','W','o','X','J','B','h','T','P','n','d','N','x','U','y','f','i','i','i','v','I','P','M','Y','O','w','s','C','u','S','w','x','m','X','Q','T','i','R','j','F','b','C','A','Y','P','z','Z','l','U','n','G','s','M','f','W','o','p','P','l','m','I','o','x','U','c','X','u','H','e','q','u','j','L','C','p','M','L','k','S','T','R','I','D','d','E','V','J','Y','I','D','i','n','n','H','j','n','F','i','O','x','W','T','T','l','L','C','c','i','J','e','G','E','m','I','r','h','y','s','l','X','j','Q','F','M','u','g','i','Y','I','L','A','N','G','g','k','L','e','z','O','y','h','p','h','m','K','S','C','S','j','A','K','I','M','O','a','G','q','i','G','Q','k','E','g','Q','G','C','h','Q','Q','b','V','X','B','s','F','a','A','l','c','L','V','v','I','M','F','P','d','V','G','F','h','s','N','N','w','o','g','K','n','e','J','X','O','F','u','W','H','u','n','h','Z','C','p','F','a','V','z','A','x','l','h','A','N','J','z','e','O','L','m','D','i','x','I','v','R','v','a','M','A','E','v','S','p','f','t','g','b','P','m','Z','e','A','j','t','L','u','f','o','E','E','o','s','m','L','t','P','S','p','m','N','B','T','a','w','g','T','Z','x','s','E','T','J','e','f','n','O','f','n','N','t','l','y','G','d','l','N','Z','Y','Y','L','X','E','W','U','Y','h','B','s','A','B','r','L','w','T','e','C','k','K','w','D','C','Z','c','F','J','J','z','x','V','k','h','d','J','T','z','u','A','U','u','Y','m','D','h','n','S','g','t','Z','g','D','p','E','i','d','R','e','x','x','u','P','l','m','R','c','y','X','C','Y','h','E','o','S','k','G','y','G','E','J','H','D','g','F','X','s','W','L','y','u','c','X','k','M','k','y','F','T','k','t','f','o','X','N','e','g','a','j','b','m','h','g','y','z','W','p','q','Y','w','m','G','a','V','T','J','A','J','J','c','k','B','H','C','p','x','y','U','P','x','D','V','m','M','X','z','J','Q','W','A','I','j','a','F','p','n','e','l','T','w','w','o','s','p','s','m','p','Y','u','H','J','x','g','a','B','x','y','J','V','f','m','K','a','e','T','e','B','M','K','m','s','y','s','z','h','Y','y','I','p','o','P','d','W','n','a','N','s','R','S','I','p','i','A','b','l','b','z','y','r','a','a','B','B','w','i','M','E','Z','C','y','n','R','Y','L','K','I','b','J','L','f','m','Q','q','U','R','W','h','w','b','b','h','s','D','m','H','w','s','f','s','M','V','x','e','d','t','c','w','l','f','w','s','b','r','w','v','D','I','K','a','M','b','t','s','e','a','n','f','S','P','d','v','a','n','A','N','l','Z','K','V','U','a','w','E','J','c','m','B','a','X','h','s','O','X','O','J','W','y','v','b','m','Z','S','e','X','M','J','Q','K','T','q','n','R','F','p','A','Q','r','w','B','Z','T','z','J','E','Y','a','Z','A','e','I','o','x','s','J','s','B','e','r','o','A','f','o','T','c','v','A','i','H','W','x','M','L','X','A','h','v','B','m','d','B','v','i','i','Y','G','Z','l','x','R','m','r','N','R','q','a','o','t','K','F','V','Y','V','B','Z','z','R','I','U','S','s','W','V','Z','u','l','H','O','t','Z','n','Y','q','Z','s','G','r','U','c','x','L','W','J','V','u','A','b','q','s','d','M','X','Z','i','i','q','P','i','T','z','n','E','R','z','Q','a','n','b','S','j','x','u','K','B','K','X','B','m','i','F','r','k','S','V','U','m','f','n','X','K','z','D','K','H','Y','G','z','h','b','N','y','L','f','c','a','i','B','Z','q','K','r','C','T','U','a','T','j','J','U','e','A','r','V','y','c','C','u','J','X','V','I','Z','V','L','I','M','U','P','s','q','X','D','K','k','y','o','C','d','Z','q','K','b','y','F','V','E','U','O','O','C','O','C','G','S','o','J','Q','K','l','Z','m','z','H','P','n','a','F','h','e','A','y','w','j','r','Z','w','c','j','E','W','V','J','W','K','S','y','Z','d','V','J','f','R','G','G','z','v','f','G','H','K','X','u','V','C','u','h','G','J','R','P','N','q','S','I','O','T','b','j','G','S','w','g','t','a','u','S','X','N','j','Q','v','A','T','f','H','x','b','b','p','G','D','A','z','z','A','l','E','E','C','w','l','b','U','K','o','m','b','z','K','a','J','s','Q','i','p','L','G','i','a','A','J','g','f','y','Q','n','F','M','x','o','e','W','P','s','P','j','j','z','Y','m','f','j','O','G','U','g','Z','v','V','b','B','a','R','Q','b','A','U','J','P','i','m','q','g','D','x','K','y','h','E','k','s','Y','E','G','c','w','d','r','c','D','B','X','e','Y','V','G','Q','x','O','i','v','l','H','V','a','f','l','c','N','c','A','L','y','A','L','N','d','m','c','S','o','y','s','P','W','q','J','Z','k','U','z','t','O','C','T','V','b','Q','c','A','o','f','X','y','Q','e','u','K','D','y','z','u','p','R','s','y','O','U','K','H','N','S','S','T','I','I','j','p','m','w','q','x','U','P','m','l','y','B','a','q','b','W','k','M','C','d','U','w','n','I','Z','H','y','k','J','z','f','F','O','U','j','z','e','w','c','w','L','X','x','h','C','F','v','W','B','v','V','d','S','T','w','x','t','c','U','Z','H','U','r','G','D','z','N','C','m','Z','o','S','B','y','p','Z','u','l','Q','J','v','O','H','j','S','S','b','A','C','d','T','S','J','a','E','q','O','z','T','A','m','L','Z','c','y','N','W','K','u','q','Z','d','c','z','G','s','Z','C','p','K','g','K','d','S','n','B','W','u','K','p','I','T','A','E','b','K','j','V','l','s','P','V','i','G','W','g','Z','g','K','P','F','B','I','t','e','E','U','V','R','J','t','M','D','u','y','Y','q','h','A','G','A','U','P','H','g','d','T','Z','j','Z','I','U','f','Y','x','a','a','B','D','u','n','B','v','x','D','B','E','Y','z','i','O','b','o','Q','u','x','j','i','R','U','U','r','B','R','k','q','x','o','w','h','x','k','K','a','T','J','Y','j','d','x','g','S','Y','s','S','M','M','V','R','H','w','z','i'};
        for (int i = 0; i < arr.length; i++) {

        }
    }
}
