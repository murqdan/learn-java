public class IfStatement {
    public static void main(String[] args) {
        var score = 0;
        var absent = 0;

        if (score >= 80 && absent >= 80) {
            System.out.println("Your score A");
        } else if (score >= 70 && absent >= 70) {
            System.out.println("Your score B");
        } else if (score >= 60 && absent >= 60) {
            System.out.println("Your score C");
        } else if (score >= 50 && absent >= 50) {
            System.out.println("Your score D");
        } else {
            System.out.println("Your score E");
        }
    }
}
