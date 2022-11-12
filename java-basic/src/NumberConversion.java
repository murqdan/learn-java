public class NumberConversion {
    public static void main(String[] args) {
        byte thisIsByte = 10;
        short thisIsShort = thisIsByte;
        int thisIsInt = thisIsShort;

        int thisIsInt2 = 1000;
        byte thisIsByte2 = (byte) thisIsInt2;
    }
}
