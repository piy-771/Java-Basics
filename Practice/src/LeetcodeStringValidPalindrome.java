public class LeetcodeStringValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan26, a canal: Panama";
        String b ="";
        String a = "";
        for(int i = s.length()-1;i>=0;i--){
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=48 && s.charAt(i)<=57) ){
                a +=  s.charAt(i);
            }
        }
        for(int i = 0;i<s.length();i++){
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=48 && s.charAt(i)<=57) ){
                b += s.charAt(i);
            }
        }
        if((a.toLowerCase()).equals(b.toLowerCase())){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
