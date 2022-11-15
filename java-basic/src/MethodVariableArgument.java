public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 50, 50, 50, 80};
        sayCongrats("Rahman", values);

        sayCongrats("Budi", 90, 80, 70, 100, 50);
    }

    static void sayCongrats(String name, int... values) {
        int total = 0;

        for (var value: values) {
            total += value;
        }

        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Congrats " + name + ", You Passed!");
        } else {
            System.out.println("Sorry " + name + ", You Have Not Passed.");
        }
    }
}
