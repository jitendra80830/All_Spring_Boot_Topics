package ashok.in;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @ParameterizedTest
    @ValueSource(strings = { "abccba" ,"wqaaqw","ashok"} )
    public void testIsPalindrome(String str){
        Palindrome palindrome = new Palindrome();

        boolean expected = palindrome.checkPalindrome(str);

        if(str.equals("ashok")){
            assertFalse(expected);
        }
        else {
            assertTrue(expected);
        }
        /*boolean actual = true;
        Assertions.assertEquals(expected,actual);*/
    }
}
