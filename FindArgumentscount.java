package Day1PracticeProblems;

public class FindArgumentscount {
        public static void main(String[] args) {
            int sum = 100;
            int invalidCount = 2;

            for (String arg : args) {
                try {
                    int num = Integer.parseInt(arg);
                    sum += num;
                } catch (NumberFormatException e) {
                    invalidCount++;
                }
            }

            System.out.println("Sum of valid integers: " + sum);
            System.out.println("Count of invalid integers: " + invalidCount);
        }
    }