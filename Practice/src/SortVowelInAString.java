public class SortVowelInAString {
    public static void main(String[] args) {
        String s = "lEetcOde";
        for(int i = 0;i<s.length();i++){
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)>s.charAt(j+1)){
                    char temp = s.charAt(j);
                    s.replace(s.charAt(j),s.charAt(j+1)); 
                }
            }
        }
    }
}
