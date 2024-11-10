public class StringPracticeQuestiion {
    public static void main(String[] args) {
         /*
    WAP to find the smallest String from the given
    String[] names = {Piyush Sahu,Harish Chourasiya,Anjali Prajapati,Gauri Dahake,Ankita Bobde,Shiddharth Patel,Madhur Sahu,Aaditya Rajawat,Akshay Mishra,Devansh Sharma,Kanishka singh kushwaha,Anushka Shrivastava,Devanshi Choudhary,Devanshi bamaliya,Divyansh Malviya,Adarsh Tiwari,Aatmik kushwaha,Ankit Gujre,shanawaz alam,Raman Jatav,Aditya Tanwani,Mohd Nadir Ansari,Deepika Patel,Megha thakre,Dharam singh};
    A String is said to be small based on its length
     */
        String[] names = {"Piyush Sahu","Harish Chourasiya","Anjali Prajapati","Gauri Dahake","Ankita Bobde","Shiddharth Patel","Madhur Sahu","Aaditya Rajawat","Akshay Mishra","Devansh Sharma","Kanishka singh kushwaha","Anushka Shrivastava","Devanshi Choudhary","Devanshi bamaliya","Divyansh Malviya","Adarsh Tiwari","Aatmik kushwaha","Ankit Gujre","shanawaz alam","Raman Jatav","Aditya Tanwani","Mohd Nadir Ansari","Deepika Patel","Megha thakre","Dharam singh"};
        String smallestString = names[0];
        for (int i = 1; i < names.length; i++) {
            if(names[i].length()<smallestString.length()){
                smallestString = names[i];
            }
        }
        System.out.println("Smallest String = " + smallestString);

        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if(names[i].startsWith("A") || names[i].startsWith("E") || names[i].startsWith("I") || names[i].startsWith("O") || names[i].startsWith("A")){
                System.out.println("names = " + names[i]);
                count++;
            }
        }
        System.out.println("count = " + count);
        //wap to compare two  string using compare to method .if the  first string is small it will return negative value and if second string is small it will return +ve value if eqaul it will return
        String firstString = "vivek";
        String secondString = "vaibhav";
        int compare = firstString.compareTo(secondString);
        System.out.println(compare);
        if(compare<0){
            System.out.println("first String is smaller than second array");
        }else if(compare>0){
            System.out.println("Second string is smaller ");
        }else{
            System.out.println("Both string are equal");
        }
    }
}
