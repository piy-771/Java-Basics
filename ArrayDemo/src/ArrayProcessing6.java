public class ArrayProcessing6 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,1,2,1,3,3,6,8,7,1,1,2,1};
        int maxRepeatCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for(int j = i;j<numbers.length;j++){
                if(numbers[i] == numbers[j]){
                    count ++;
                }

            }
            if (count > maxRepeatCount) {
                maxRepeatCount = count;
                System.out.println("maxCount changes");
                System.out.println("numbers[" + i + "] = " + numbers[i]);
            }
        }
        System.out.println("maxRepeatCount = " + maxRepeatCount);


    }
}
