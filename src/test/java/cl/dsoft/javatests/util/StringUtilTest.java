package cl.dsoft.javatests.util;

// import static org.junit.Assert.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String result = StringUtil.repeat("hola", 3);
        //System.out.println(result);
        /*
        if (!result.equals("holaholahola")) {
            //System.out.println("ERROR");
            throw new RuntimeException("Error");
        }
        */
        assertEquals(result, "holaholahola");

        String result2 = StringUtil.repeat("hola", 1);
        //System.out.println(result2);
        /*
        if (!result2.equals("hola")) {
            //System.out.println("ERROR");
            throw new RuntimeException("Error");
         }
         */

    }

    private static void assertEquals(String actual, String expected) {
        if (!expected.equals(actual)) {
            throw new RuntimeException(actual + " is not equal to " + expected);
        }
    }


}