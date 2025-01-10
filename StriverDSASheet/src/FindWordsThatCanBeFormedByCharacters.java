public class FindWordsThatCanBeFormedByCharacters {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        chars.contains("t");
        int sum = 0;
        System.out.println(words[2].charAt(0));
        for(int i = 0;i<words.length;i++){
            for(int j = 0;j<words[i].length();j++){
                CharSequence temp = new CharSequence() {
                }
                if(chars.contains(temp)){
                    sum++;
                }else{
                    if(j != words[i].length()){
                        sum=0;
                    }

                    break;
                }
            }
        }
        System.out.println("sum = " + sum);
    }
}
