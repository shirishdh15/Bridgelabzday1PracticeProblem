package Day1PracticeProblems;

public class StaticDemo {
    static int count = 0;
    static {
        System.out.println("Static block executed.");
        count = 10;
    }
    static void displayCount() {
        System.out.println("Count: " + count);
    }
    public static void main(String[] args) {

        System.out.println("Initial count: " + count);
        displayCount();
        count = 20;
        displayCount();
    }
}
