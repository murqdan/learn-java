public class MathOperations {
    public static void main(String[] args) {
        Integer x = 10;
        Integer y = 3;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        Integer z = 100;

        z += 10;
        System.out.println(z); //110

        z -= 10;
        System.out.println(z); //100

        z *= 10;
        System.out.println(z); //1000

        Integer a = 0;

        a++;
        System.out.println(a); //1

        a--;
        System.out.println(a); //0

        Boolean man = false;
        Boolean woman = !man;

        System.out.println(woman); //true
    }
}
