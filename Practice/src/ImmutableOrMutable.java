public class ImmutableOrMutable {
    public static void main(String[] args) {
        String string = "Piyush";
        System.out.println(string.hashCode());
        string = "jiya";
        System.out.println(string);
        String string1 = "Piyush";
        System.out.println(string1.hashCode());

        StringBuilder stringBuilder  = new StringBuilder("Lily");
        System.out.println(stringBuilder.hashCode());
        StringBuilder stringBuilder1 = new StringBuilder("Lily");
        System.out.println(stringBuilder1.hashCode());
    }
}
