public class ForEach {
    public static void main(String[] args) {
        String[] fruits = {
                "Banana", "Grape", "Orange", "Lemon", "Mango"
        };

        for(int index = 0; index < fruits.length; index++) {
            System.out.println(fruits[index]);
        }

        System.out.println("For Each");

        for(var fruit: fruits) {
            System.out.println(fruit);
        }
    }
}
