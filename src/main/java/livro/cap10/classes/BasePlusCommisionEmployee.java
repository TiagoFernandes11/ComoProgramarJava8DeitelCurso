package livro.cap10.classes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasePlusCommisionEmployee extends ComissionEmployee{
    private double baseSalary;

    public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("base salary must be > 0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,.2f", "base salaried", super.toString(), "base salary", getBaseSalary());
    }
}
