import java.util.*;

public class MaximumNumberOfPairInAnArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,3,2,2};
//        Arrays.sort(nums);
//        int[] ans = new int[100];
//        Stack<Integer> stack = new Stack<>();
//        for(int i = 0;i< nums.length;i++){
//           ans[nums[i]]++;
//        }
//        System.out.println(stack);
//        System.out.println(-3%2);
        //System.out.println(Arrays.toString(ans));
//        int count = 1;
//        Map<Integer,Integer> map = new HashMap<>();
//        int k = 0;
//        for(int num : nums){
//                map.put(num,map.getOrDefault(num,0) + 1);
//        }
//        System.out.println(map);
//        for(int freq :map.values()){
//            if(freq/2 == 0){
//
//            }
//        }

        String[] words = {"i","love","leetcode","i","love","coding"};
        Map<String,Integer> map = new TreeMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        System.out.println(map);
        

    }
}
