import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LoginAppTest {


    @Test
    void ValidEmail_ValidPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("tomclark@example.com","password202");
        assertEquals("Tom Clark", result);
    }

    @Test
    void VEmail_InvalidPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("tomclark@example.com","password456");
        assertNull(result);
    }

    @Test
    void InvalidEmail_ValidPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("ehtasham@example.com","password202");
        assertNull(result);
    }


    @Test
    void NullEmailPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser(null,null);
        assertNull(result);
    }

    @Test
    void EmptyEmailPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("","");
        assertNull(result);
    }
}