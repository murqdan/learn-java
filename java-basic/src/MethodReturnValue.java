public class MethodReturnValue {
    public static void main(String[] args) {
        var result = sum(1, 1);
        System.out.println(result);

        System.out.println(sum(100,100));

        System.out.println(count(50, "+", 25));
        System.out.println(count(40, "-", 25));
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int count(int value1, String operation, int value2) {
        switch (operation) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
