public class SwitchStatement {
    public static void main(String[] args) {
        var score = "A";

        switch (score) {
            case "A":
                System.out.println("Great");
                break;
            case "B":
            case "C":
                System.out.println("Enough");
                break;
            case "D":
                System.out.println("Less");
                break;
            case "E":
                System.out.println("Very Less");
            default:
                System.out.println("Wrong Input!");
        }

        switch (score) {
            case "A" -> System.out.println("Great");
            case "B", "C" -> System.out.println("Enough");
            case "D" -> System.out.println("Less");
            case "E" -> System.out.println("Very Less");
            default -> {
                System.out.println("Wrong Input!");
            }
        }

        String result = switch (score) {
            case "A":
                yield "Great";
            case "B", "C":
                yield "Enough";
            case "D":
                yield "Less";
            case "E":
                yield "Very Less";
            default:
                yield "Wrong Input!";
        };
        System.out.println(result);
    }
}
