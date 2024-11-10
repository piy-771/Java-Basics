public class Main {
    public static void main(String[] args) {
//        String s = "Piyush";
//        System.out.println(s.length());
//        String ls =  s.toLowerCase();
//        System.out.println(ls);
//        String us = ls.toUpperCase();
//        System.out.println(us );
//        System.out.println(s);
//        String nonTrim = "  io jkjsn p";
//      //  String trimhk = nonTrim.trim();
//        System.out.println(nonTrim.trim());
//        System.out.println(nonTrim.startsWith(" "));
//        System.out.println(nonTrim.endsWith(" p "));
//        System.out.println(nonTrim.lastIndexOf("j"));
        String s = "  pi nfgk knrgne erng erubg yu sh";
        String ans = "";
//        for(int i = 0;i<s.length();i++){
//            if(s.charAt(i) != ' '){
//                ans += s.charAt(i);
//            }
//
//        }
        int i = 0;
        while (i<s.length()) {
            if (s.charAt(i) != ' ') {
                ans += s.charAt(i);

            }i++;
        }
        System.out.println(ans);
        System.out.println(ans.length());

    }

}