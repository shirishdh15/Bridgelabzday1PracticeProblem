package Day1PracticeProblems;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int y;
        System.out.print("Enter a year: ");
        Scanner r = new Scanner(System.in);
        y = r.nextInt();
        if (y % 100 != 0 && y % 400 == 0 || y%100==0 && y%4==0)
        {
            System.out.println(y + " is a Leap Year.");
        } else {
            System.out.println("is a not leap year");
        }
    }
}