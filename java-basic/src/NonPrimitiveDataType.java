public class NonPrimitiveDataType {
    public static void main(String[] args) {
        Integer thisIsInteger = 100;
        Long thisIsLong = 10000L;

        Byte thisIsByte = null;
        System.out.println(thisIsByte);

        thisIsByte = 100;
        System.out.println(thisIsByte);

        int thisIsInt = 100;
        Integer thisIsIntegerNonPrimitive = thisIsInt;

        short thisIsShortPrimitive = thisIsIntegerNonPrimitive.shortValue();
        long thisIsLongPrimitive = thisIsIntegerNonPrimitive.longValue();
        float thisIsFloatPrimitive = thisIsIntegerNonPrimitive.shortValue();
    }
}
