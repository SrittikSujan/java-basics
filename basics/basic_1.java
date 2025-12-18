public class basic_1 {
    public static void main(String[] args) {

        // INTEGRAL NUMBERS METADATA
        System.out.println();
        System.out.println("Byte Range:"); // size = 1 byte
        System.out.println("-----------");
        byte a1 = 100;
        System.out.println("Example Byte value: " + a1);
        System.out.println("Minimun Byte value is: " + Byte.MIN_VALUE);
        System.out.println("Maximum Byte value is: " + Byte.MAX_VALUE);
        System.out.println();

        System.out.println("Short Range:"); // size = 2 bytes
        System.out.println("-----------");
        short a2 = 100;
        System.out.println("Example Short value: " + a2);
        System.out.println("Minimun Short value is: " + Short.MIN_VALUE);
        System.out.println("Maximum Short value is: " + Short.MAX_VALUE);
        System.out.println();

        System.out.println("Integer Range:"); // size = 4 bytes
        System.out.println("-----------");
        int a3 = 100;
        System.out.println("Example Integer value: " + a3);
        System.out.println("Minimun Integer value is: " + Integer.MIN_VALUE);
        System.out.println("Maximum Integer value is: " + Integer.MAX_VALUE);
        System.out.println();

        System.out.println("Long Range:"); // size = 8 bytes
        System.out.println("-----------");
        long a4 = 100;
        System.out.println("Example Long value: " + a4);
        System.out.println("Minimun Long value is: " + Long.MIN_VALUE);
        System.out.println("Maximum Long value is: " + Long.MAX_VALUE);
        System.out.println();

        // DECIMAL NUMBERS METADATA
        System.out.println("Float Range:"); // size = 4 bytes
        System.out.println("-----------");
        float b1 = 100;
        System.out.println("Example Float value: " + b1);
        System.out.println("Minimun positive Float value is: " + Float.MIN_VALUE);
        System.out.println("Maximum positive Float value is: " + Float.MAX_VALUE);
        System.out.println("Minimun negative Float value is: -" + Float.MAX_VALUE);
        System.out.println("Maximum negative Float value is: -" + Float.MIN_VALUE);
        System.out.println();

        System.out.println("Double Range:"); // size = 8 bytes
        System.out.println("-----------");
        double b2 = 100;
        System.out.println("Example Double value: " + b2);
        System.out.println("Minimun positive Double value is: " + Double.MIN_VALUE);
        System.out.println("Maximum positive Double value is: " + Double.MAX_VALUE);
        System.out.println("Minimun negative Double value is: -" + Double.MAX_VALUE);
        System.out.println("Maximum negative Double value is: -" + Double.MIN_VALUE);
        System.out.println();

        // TRUE/FALSE METADATA
        boolean isAdult = false; // size = 1 bit
        isAdult = true;
        System.out.println("Boolean Range:");
        System.out.println("-----------");
        System.out.println("Example Boolean value: " + isAdult);
        System.out.println("Boolean values can be either 'true' or 'false'");
        System.out.println();

        // CHARACTERS METADATA
        System.out.println("Character Range:"); // size = 2 bytes
        System.out.println("-----------");
        char c1 = 'a';
        char c2 = 10084;
        System.out.println("Example Character value: " + c1);
        System.out.println("Corresponding Integer value: " + (int) c1); // typecasting
        System.out.println("Example Character value: " + c2 );
        System.out.println("Corresponding Integer value: " + (int) c2); // typecasting
        System.out.println("Minimun Character value is: " + Character.MIN_VALUE);
        System.out.println("Corresponding Integer value is: " + (int) Character.MIN_VALUE);
        System.out.println("Maximum Character value is: " + Character.MAX_VALUE);
        System.out.println("Corresponding Integer value is: " + (int) Character.MAX_VALUE);
        System.out.println();

        // WIDENING CONVERSION
        System.out.println("Bucket System");
        System.out.println("-------------");
        byte byteValue = 10;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("Byte:" + byteValue);
        System.out.println("Short:" + shortValue);
        System.out.println("Int:" + intValue);
        System.out.println("Long:" + longValue);
        System.out.println("Float:" + floatValue);
        System.out.println("Double:" + doubleValue);
        System.out.println();

        // NARROWING CONVERSION
        System.out.println("Packet System");
        System.out.println("-------------");
        double doubleValue1 = 123.456789;
        float floatValue1 = (float) doubleValue1;
        long longValue1 = (long) floatValue1;
        int intValue1 = (int) longValue1;
        short shortValue1 = (short) intValue1;
        byte byteValue1 = (byte) shortValue1;

        System.out.println("Double:" + doubleValue1);
        System.out.println("Float:" + floatValue1);
        System.out.println("Long:" + longValue1);
        System.out.println("Int:" + intValue1);
        System.out.println("Short:" + shortValue1);
        System.out.println("Byte:" + byteValue1);
        System.out.println();

        // STRINGS METADATA
        String s1 = "hello"; // string literal
        String s2 = "hello";
        String s3 = new String("hello"); // using constructor
        // stored in --> heap (string pool)

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        String s4 = s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s4);

        String text = "Hello Guys";

        // Length
        System.out.println(text.length());

        // Accessing characters
        System.out.println(text.charAt(0));

        // Substring
        System.out.println(text.substring(0,5));

        // Contains, startsWith, endsWith
        System.out.println(text.contains("World"));

        // Replace
        System.out.println(text.replace("World", "Java"));

    }
}