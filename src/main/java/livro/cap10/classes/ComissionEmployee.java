package livro.cap10.classes;

import lombok.Getter;
import lombok.Setter;

@Getter
public class ComissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if(commissionRate >= 1.0 || commissionRate <=0){
            throw new IllegalArgumentException("Commission rate must be > 0 and < 1");
        }
        if(grossSales < 0.0){
            throw new IllegalArgumentException("gross sales must be > 0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0){
            throw new IllegalArgumentException("gross sales must be > 0");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate >= 1.0 || commissionRate <=0){
            throw new IllegalArgumentException("Commission rate must be > 0 and < 1");
        }
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "commission employee", super.toString(), "gross sales", getGrossSales(), "commission rate", getCommissionRate());
    }
}
