public class StringClass {
    public static void main(String[] args) {
        String string = new String("Hello");
        System.out.println("Hash code of string = " + string.hashCode());
        String string1 = new String("Hello");
        System.out.println("Hash code of string1 = " + string1.hashCode());
        System.out.println(string==string1);  //it compare the reference  of string and reference take from heap memory
        System.out.println(string.equals(string1)); //if compare the value



        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        System.out.println(stringBuilder.hashCode());
        System.out.println(stringBuilder1.hashCode());
        System.out.println(stringBuilder.equals(stringBuilder1));  //false
        stringBuilder.append(" World");
        System.out.println(stringBuilder.hashCode());
        System.out.println(stringBuilder);



        String message = new String("hello java");
        System.out.println(message.hashCode());
        message = message.concat(" Hello user");
        System.out.println(message.hashCode());
        System.out.println("message = " + message);



        //is palindrome
        String reverse = new StringBuilder("naman").reverse().toString();
        String string2 = new StringBuilder("naman").toString();
        System.out.println(reverse);
        if(reverse.equals(string2)){
            System.out.println("palindrome");
        }
    }
}
