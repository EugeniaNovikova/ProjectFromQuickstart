package lesson4;

import org.assertj.core.api.ThrowableAssertAlternative;
import org.junit.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import sun.security.pkcs11.wrapper.Functions;
import org.junit.jupiter.api.Assertions;

import java.util.logging.Logger;

import static lesson4.hw4.countTriangleArea;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class hw4 {

    Functions functions = new Functions();
    private static Logger logger = (Logger) LoggerFactory.getLogger(hw4.class);
    @Test
    void calcArea() throws BadTriangleException {
        double result = countTriangleArea(2, 2, 2);
        Assertions.assertEquals(1.7320508075688772, result);
    }

    @Test
    void badTriangleTest() {
        ThrowableAssertAlternative<BadTriangleException> thrownBy = assertThatExceptionOfType(BadTriangleException.class).isThrownBy(
                () -> countTriangleArea(-1, 1, 1));
    }
}
