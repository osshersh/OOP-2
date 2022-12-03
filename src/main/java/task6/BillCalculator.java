package task6;

public class BillCalculator {

    public double calculate(double bill, float paymentService){
        return bill + paymentService;
    }
    public double calculate(double bill, float paymentService, double discount){
        return (bill - discount) + paymentService;
    }

    public double calculate(double bill, float paymentService, short feeTakeAway){
        return bill + paymentService + feeTakeAway;
    }
}

