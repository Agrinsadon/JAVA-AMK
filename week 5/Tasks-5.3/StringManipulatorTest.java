import static org.junit.jupiter.api.Assertions.*;
// You can test the code one by one i dont know if it is what is wanted on the task but it works
class StringManipulator {

    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public int findLength(String str) {
        return str.length();
    }

    public String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    public String convertToLowerCase(String str) {
        return str.toLowerCase();
    }

    public boolean containsSubstring(String str, String subStr) {
        return str.contains(subStr);
    }

    public static class StringManipulatorTest {

        @org.junit.Test
        public void testConcatenate() {
            StringManipulator stringManipulator = new StringManipulator();
            assertEquals("HelloWorld", stringManipulator.concatenate("Hello", "World"));
        }

        @org.junit.Test
        public void testFindLength() {
            StringManipulator stringManipulator = new StringManipulator();
            assertEquals(5, stringManipulator.findLength("Hello"));
        }

        @org.junit.Test
        public void testConvertToUpperCase() {
            StringManipulator stringManipulator = new StringManipulator();
            assertEquals("HELLO", stringManipulator.convertToUpperCase("Hello"));
        }

        @org.junit.Test
        public void testConvertToLowerCase() {
            StringManipulator stringManipulator = new StringManipulator();
            assertEquals("hello", stringManipulator.convertToLowerCase("Hello"));
        }

        @org.junit.Test
        public void testContainsSubstring() {
            StringManipulator stringManipulator = new StringManipulator();
            assertTrue(stringManipulator.containsSubstring("Hello", "el"));
            assertFalse(stringManipulator.containsSubstring("Hello", "abc"));
        }
    }
}
