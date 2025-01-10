import java.util.Arrays;

public class ArrayMidReverse {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int midPoint = (numbers.length - 1) / 2;
        for (int i = 0; i < midPoint; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - (i + 1)];
            numbers[numbers.length - (i + 1)] = temp;

        }
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
    }
}
