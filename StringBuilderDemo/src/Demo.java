public class Demo {
    public static void main(String[] args) {
        String s = "";
        int n = 1000;
        for(int i=0; i<n; i++) s = s + (65+(i+'a')%26);
        StringBuffer sbf = new StringBuffer(s);
        StringBuilder sbd = new StringBuilder(s);
        long start1 = System.nanoTime();
        for(int i=0; i<n; i++) {
            System.out.print(s.charAt(i));
        }
        long end1 = System.nanoTime();
        System.out.println("\n");

        long start2 = System.nanoTime();
        for(int i=0; i<n; i++) {
            System.out.print(sbf.replace(i,i+1, "x"));
        }
        long end2 = System.nanoTime();
        System.out.println("\n");

        long start3 = System.nanoTime();
        for(int i=0; i<n; i++) {
            System.out.print(sbd.replace(i,i+1, "x"));
        }
        long end3 = System.nanoTime();
        System.out.println("\n");

        System.out.println(end1 - start1);
        System.out.println(end2 - start2);
        System.out.println(end3 - start3);
    }
}
