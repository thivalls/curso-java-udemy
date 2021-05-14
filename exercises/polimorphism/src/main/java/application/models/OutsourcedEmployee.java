package application.models;

public class OutsourcedEmployee extends Employee {

    private double aditionalCharge;

    public OutsourcedEmployee(String name, double hours, double valuePerHour, double aditionalCharge) {
        super(name, hours, valuePerHour);
        this.aditionalCharge = aditionalCharge;
    }

    public double getAditionalCharge() {
        return aditionalCharge;
    }

    public void setAditionalCharge(double aditionalCharge) {
        this.aditionalCharge = aditionalCharge;
    }

    @Override
    public Double calculaPagamento() {
        return super.calculaPagamento() + aditionalCharge * 1.1;
    }
}
