public class TernaryOperator {
    public static void main(String[] args) {
        var score = 80;

        /* if (score >= 75) {
            System.out.println("Pass");
        } else {
            System.out.println("Try Again");
        } */

        String result = score >= 75 ? "Pass" : "Try Again";
        System.out.println(result);
    }
}
