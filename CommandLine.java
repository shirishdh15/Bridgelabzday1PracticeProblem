package Day1PracticeProblems;
public class CommandLine {
    static int staticVariable;
    int instanceVariable;
    static {
        System.out.println("Static block executed.");
        staticVariable = 10;
    }
    {
        System.out.println("Instance block executed.");
        instanceVariable = 20;
    }
    public static void staticMethod() {
        System.out.println("Static method called.");
        System.out.println("Value of staticVariable: " + staticVariable);
    }
    public void instanceMethod() {
        System.out.println("Instance method called.");
        System.out.println("Value of instanceVariable: " + instanceVariable);
    }
    public static void main(String[] args) {
        CommandLine.staticMethod();
        System.out.println("-----------------------");
        CommandLine obj = new CommandLine();
        obj.instanceMethod();
    }
}