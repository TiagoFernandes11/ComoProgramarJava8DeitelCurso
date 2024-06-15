package livro.cap10;

import lombok.Data;

@Data
public class CommissionEmployee {
    private final String fisrtName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commisionRate;

    public CommissionEmployee(String fisrtName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >=0");
        }
        if (commisionRate <= 0 || commisionRate >= 1) {
            throw new IllegalArgumentException("CommissionRate must be > 0 and < 1.0");
        }
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >=0");
        }
        this.grossSales = grossSales;
    }

    public void setCommisionRate(double commisionRate) {
        if (commisionRate <= 0 || commisionRate >= 1) {
            throw new IllegalArgumentException("CommissionRate must be > 0 and < 1.0");
        }
        this.commisionRate = commisionRate;
    }

    public double earnings() {
        return this.commisionRate * this.grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee",
                fisrtName, lastName, "social security number", socialSecurityNumber, "gross sales",
                grossSales, "commmision rate", commisionRate);
    }
}
