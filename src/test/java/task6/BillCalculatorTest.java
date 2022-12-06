package task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillCalculatorTest {
    BillCalculator billCalculator = new BillCalculator();

    @Test
    void shouldReturnProperWhenCalculateBillPlusServicePayment() {
        double payment = billCalculator.calculate(4, 2);
        assertEquals(6, payment);
    }

    @Test
    void shouldReturnProperWhenCalculateBillMinusDiscountPlusServicePayment() {
        double payment = billCalculator.calculate(4, 2, 1);
        assertEquals(5, payment);
    }

    @Test
    void shouldReturnProperWhenCalculateBillPlusPaymentPlusFeeTakeAway() {
        double payment = billCalculator.calculate(4, 2, (short) 1);
        assertEquals(7, payment);
    }

    @Test
    void shouldReturnProperWhenCalculateIsNotBillPlusServicePayment() {
        double payment = billCalculator.calculate(4, 2);
        assertNotEquals(5, payment);
    }

    @Test
    void shouldReturnProperWhenCalculateIsNotBillMinusDiscountPlusServicePayment() {
        double payment = billCalculator.calculate(4, 2, 1);
        assertNotEquals(7, payment);
    }

    @Test
    void shouldReturnProperWhenCalculateIsNotBillPlusPaymentPlusFeeTakeAway() {
        double payment = billCalculator.calculate(4, 2, (short) 1);
        assertNotEquals(8, payment);
    }
}