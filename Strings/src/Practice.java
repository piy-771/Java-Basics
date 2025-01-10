public class Practice {
    public static void main(String[] args) {
        String title = "First leTTeR of EACH Word";
        String ans = "";
        String[] s = title.split(" ");
        for(int i = 0;i<s.length;i++){
            String temp = s[i].toLowerCase();
            System.out.println(s[i]);
            System.out.println((char)(s[i].charAt(0)-32));
            System.out.println(s[i].toLowerCase().substring(1));
            ans += (char)(temp.charAt(0)-32) + temp.toLowerCase().substring(1) + " ";
            //ans += temp + " ";
            //ans += s[i]+" ";
        }
        System.out.println(ans);
        //title.replace(title.charAt(0),(char)(title.charAt(0)-(char)32));
    }
}
