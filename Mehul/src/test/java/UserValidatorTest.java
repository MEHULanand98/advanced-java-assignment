import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    void testValidUsername() {
        assertTrue(UserValidator.isValidUsername("Mehul123"));
    }
    @Test
    void testUsernameWithSpecialCharacters() {
        assertFalse(UserValidator.isValidUsername("Mehul@123"));
    }
    @Test
    void testUsernameTooShort() {
        assertFalse(UserValidator.isValidUsername("Ab1"));
    }
    @Test
    void testEmptyUsername() {
        assertFalse(UserValidator.isValidUsername(""));
    }
    @Test
    void testNullUsername() {
        assertFalse(UserValidator.isValidUsername(null));
    }
    @Test
    void testNullPassword() {
        assertFalse(UserValidator.isValidPassword(null));
    }
    @Test
    void testEmptyPassword() {
        assertFalse(UserValidator.isValidPassword(""));
    }
    @Test
    void testPasswordTooShort() {
        assertFalse(UserValidator.isValidPassword("Ab1"));
    }
    
}
