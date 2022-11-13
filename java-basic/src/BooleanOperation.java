public class BooleanOperation {
    public static void main(String[] args) {
        var absent = 70;
        var finalScore = 80;

        boolean absentPass = absent >= 75;
        boolean scorePass = finalScore >= 75;

        System.out.println(absentPass);
        System.out.println(scorePass);

        var graduated = absentPass && scorePass;
        System.out.println(graduated);
    }
}
