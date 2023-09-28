import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculationTest {
    @Test
    public void testFee1() throws Exception {
        try {
            double output = Calculation.fee(-Double.MAX_VALUE, true, true);
            fail("Không ném ngoại lệ");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Input không hợp lệ");
        }
    }

    @Test
    public void testFee2() throws Exception {
        try {
            double output = Calculation.fee(-1.0, true, false);
            fail("Không ném ngoại lệ");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Input không hợp lệ");
        }
    }

    @Test
    public void testFee3() throws Exception {
        try {
            double output = Calculation.fee(-0.1, false, true);
            fail("Không ném ngoại lệ");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Input không hợp lệ");
        }
    }

    @Test
    public void testFee4() throws Exception {
        try {
            double output = Calculation.fee(0.0, false, false);
            assertEquals(12000.0, output, 0.0);
        } catch (Exception e) {
            fail("Bắt ngoại lệ không đúng");
        }
    }

    @Test
    public void testFee5() throws Exception {
        try {
            double output = Calculation.fee(0.1, true, true);
            assertEquals(27000.0, output, 0.0);
        } catch (Exception e) {
            fail("Bắt ngoại lệ không đúng");
        }
    }

    @Test
    public void testFee6() throws Exception {
        try {
            double output = Calculation.fee(1.0, true, false);
            assertEquals(17000.0, output, 0.0);
        } catch (Exception e) {
            fail("Bắt ngoại lệ không đúng");
        }
    }

    @Test
    public void testFee7() throws Exception {
        try {
            double output = Calculation.fee(1.9, false, true);
            assertEquals(22000.0, output, 0.0);
        } catch (Exception e) {
            fail("Bắt ngoại lệ không đúng");
        }
    }

    @Test
    public void testFee8() throws Exception {
        try {
            double output = Calculation.fee(2.0, false, false);
            assertEquals(12000.0, output, 0.0);
        } catch (Exception e) {
            fail("Bắt ngoại lệ không đúng");
        }
    }

    @Test
    public void testFee9() throws Exception {
        try {
            double output = Calculation.fee(2.0, true, true);
            assertEquals(27000.0, output, 0.0);
        } catch (Exception e) {
            fail("Bắt ngoại lệ không đúng");
        }
    }

    @Test
    public void testFee10() throws Exception {
        try {
            double output = Calculation.fee(2.1, true, false);
            assertEquals(17400.0, output, 0.0);
        } catch (Exception e) {
            fail("Bắt ngoại lệ không đúng");
        }
    }

    @Test
    public void testFee11() throws Exception {
        try {
            double output = Calculation.fee(2.1, false, true);
            assertEquals(22400.0, output, 0.0);
        } catch (Exception e) {
            fail("Bắt ngoại lệ không đúng");
        }
    }

    @Test
    public void testFee12() throws Exception {
        try {
            double output = Calculation.fee(8, false, false);
            assertEquals(36000.0, output, 0.0);
        } catch (Exception e) {
            fail("Bắt ngoại lệ không đúng");
        }
    }
}