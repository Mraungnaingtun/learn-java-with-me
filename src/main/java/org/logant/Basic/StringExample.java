package org.logant.Basic;

public class StringExample {

    /*
     * String are immutable
     */

    // store string1 in heap
    // store "Value1" in string pool
    String string1 = new String("Value1");

    // stored in string pool
    // string2 references the "Value2" object directly from the pool
    String string2 = "Value2";

    // multi line
    String abc = """
            fjkadlfaksdf
            a;sdfkasdk
            ;asdfkalskdf
            asdfaslkd
            asdf
            """;

    public static void oftenUse() {

        String s1 = "  Hello, Java!  ";
        String s2 = "hello, java!";
        String s3 = "JAVA PROGRAMMING";
        String s4 = "This is a test string. Testing string methods.";

        // 1. Length and Character Inspection
        System.out.println("1. Length and Character Inspection:");
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Character at index 4 in s1: " + s1.charAt(4));
        System.out.println("Unicode code point at index 4 in s1: " + s1.codePointAt(4));
        System.out.println();

        // 2. String Comparison
        System.out.println("2. String Comparison:");
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println(s1.trim());
        System.out.println("s1 equalsIgnoreCase s2: " + s1.trim().equalsIgnoreCase(s2.trim()));
        System.out.println("s1 compareTo s2: " + s1.trim().compareTo(s2.trim()));
        System.out.println();

        // 3. Searching
        System.out.println("3. Searching:");
        System.out.println("s4 contains 'test': " + s4.contains("test"));
        System.out.println("s4 startsWith 'This': " + s4.startsWith("This"));
        System.out.println("s4 endsWith 'methods.': " + s4.endsWith("methods."));
        System.out.println("Index of 'test' in s4: " + s4.indexOf("test"));
        System.out.println("Last index of 'test' in s4: " + s4.lastIndexOf("test"));
        System.out.println();

        // 4. Substrings
        System.out.println("4. Substrings:");
        System.out.println("Substring from index 10 in s4: " + s4.substring(10));
        System.out.println("Substring from index 10 to 15 in s4: " + s4.substring(10, 15));
        System.out.println();

        // 5. Modification
        System.out.println("5. Modification:");
        System.out.println("Replace 'test' with 'example' in s4: " + s4.replace("test", "example"));
        System.out.println("Trim whitespace from s1: '" + s1.trim() + "'");
        System.out.println("Strip leading/trailing spaces from s1: '" + s1.strip() + "'");
        System.out.println();

        // 6. Case Conversion
        System.out.println("6. Case Conversion:");
        System.out.println("s3 toLowerCase: " + s3.toLowerCase());
        System.out.println("s2 toUpperCase: " + s2.toUpperCase());
        System.out.println();

        // 7. Splitting and Joining
        System.out.println("7. Splitting and Joining:");
        String[] words = s4.split(" ");
        System.out.println("Words in s4:");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Join words with ', ': " + String.join(", ", words));
        System.out.println();

        // 8. Utility
        System.out.println("8. Utility:");
        System.out.println("Is s1 empty: " + s1.isEmpty());
        System.out.println("Is s1 blank: " + s1.isBlank());
        System.out.println("Convert s4 to char array:");
        char[] chars = s4.toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        // 9. Formatting
        System.out.println("9. Formatting:");
        String formatted = String.format("Name: %s, Age: %d", "John Doe", 25);
        System.out.println("Formatted string: " + formatted);
        System.out.println();

        // 10. Encoding and Decoding
        System.out.println("10. Encoding and Decoding:");
        byte[] bytes = s3.getBytes();
        System.out.println("Bytes of s3:");
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();
    }


    
}