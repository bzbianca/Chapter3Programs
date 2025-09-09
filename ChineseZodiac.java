import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class ChineseZodiac {
    public static Scanner scanner = new Scanner(System.in);

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int year = getIntInput("Enter a year: ");
        int zodiacYear = year % 12;
        switch (zodiacYear) {
            case 0:
                System.out.println("The Chinese Zodiac animal for " + year + " is: monkey");
            case 1:
                System.out.println("The Chinese Zodiac animal for " + year + " is: rooster");
            case 2:
                System.out.println("The Chinese Zodiac animal for " + year + " is: dog");
            case 3:
                System.out.println("The Chinese Zodiac animal for " + year + " is: pig");
                break;
            case 4:
                System.out.println("The Chinese Zodiac animal for " + year + " is: rat");
                break;
            case 5:
                System.out.println("The Chinese Zodiac animal for " + year + " is: ox");
                break;
            case 6:
                System.out.println("The Chinese Zodiac animal for " + year + " is: tiger");
                break;
            case 7:
                System.out.println("The Chinese Zodiac animal for " + year + " is: rabbit");
                break;
            case 8:
                System.out.println("The Chinese Zodiac animal for " + year + " is: dragon");
                break;
            case 9:
                System.out.println("The Chinese Zodiac animal for " + year + " is: snake");
                break;
            case 10:
                System.out.println("The Chinese Zodiac animal for " + year + " is: horse");
                break;
            case 11:
                System.out.println("The Chinese Zodiac animal for " + year + " is: sheep");
                break;
            default: System.out.println("Error: invalid year");
                break;
        }
    }
}