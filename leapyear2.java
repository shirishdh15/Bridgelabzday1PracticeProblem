package Day1PracticeProblems;
import java.util.Scanner;
public class leapyear2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();
            if (year >= 1582) {
                if (isLeapYear(year)) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            } else {
                System.out.println("Please enter a valid year (>= 1582).");
            }
            scanner.close();
        }
        public static boolean isLeapYear(int year) {
            return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        }
    }