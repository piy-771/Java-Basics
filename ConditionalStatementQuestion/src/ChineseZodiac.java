/*Write a program to accept birth year of user in YYYY format (like 1983) and print the chinese zodiac of the user.

Chinese zodiac is represented by an animal sign as follows:
0: monkey
1: rooster
2: dog
3: pig
4: rat
5: ox
6: tiger
7: rabbit
8: dragon
9: snake
10: horse
11: sheep
To get the corresponding value modulo-division year by 12*/

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Birth Year in YYYY format");
        int birthYear = scanner.nextInt();
        int moduloDivision = birthYear%12;
        if(birthYear > 999 && birthYear <= 9999){
            switch (moduloDivision) {
                case 0:
                    System.out.println("Chinese Zodiac - Monkey");
                    break;
                case 1:
                    System.out.println("Chinese Zodiac - Rooster");
                    break;
                case 2:
                    System.out.println("Chinese Zodiac - Dog");
                    break;
                case 3:
                    System.out.println("Chinese Zodiac - Pig");
                    break;
                case 4:
                    System.out.println("Chinese Zodiac - Rat");
                    break;
                case 5:
                    System.out.println("Chinese Zodiac - Ox");
                    break;
                case 6:
                    System.out.println("Chinese Zodiac - Tiger");
                    break;
                case 7:
                    System.out.println("Chinese Zodiac - Rabbit");
                    break;
                case 8:
                    System.out.println("Chinese Zodiac - Dragon");
                    break;
                case 9:
                    System.out.println("Chinese Zodiac - Snake");
                    break;
                case 10:
                    System.out.println("Chinese Zodiac - Horse");
                    break;
                case 11:
                    System.out.println("Chinese Zodiac - Sheep");
            }
        }else{
            System.out.println("Enter in valid format");
        }

    }
}
