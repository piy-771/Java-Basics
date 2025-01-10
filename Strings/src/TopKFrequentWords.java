import java.util.*;

public class TopKFrequentWords {
    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        List<Integer> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        System.out.println(map);
       // System.out.println(map.values());

        PriorityQueue<Map.Entry<String,Integer>> queue = new PriorityQueue<>((a,b)->{;
        if(!a.getValue().equals(b.getValue())){
            return b.getValue() - a.getValue();
        }

        return a.getKey().compareTo(b.getKey());
    });
        queue.addAll(map.entrySet());
        for(int i = 0;i<k;i++){
        list.add(queue.poll().getKey());
    }

        //return ans;
        System.out.println(list);

//        for (int i = 0; i < words.length; i++) {
//            if(map.containsKey(words[i])){
//
//            }
//        }
    }
}
