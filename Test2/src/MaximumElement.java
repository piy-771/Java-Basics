public class MaximumElement {
    public static void main(String[] args) {
        int maximumInteger = Integer.MIN_VALUE;
        int[] array = {4,8,2,10,3,6};
        for (int i = 0; i < array.length; i++) {
            if(array[i]>maximumInteger){
                maximumInteger = array[i];
            }
        }
        System.out.println("maximumInteger = " + maximumInteger);
    }
}
