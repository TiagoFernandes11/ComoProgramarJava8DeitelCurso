package livro.cap10.classes;

import lombok.Getter;
import lombok.Setter;

@Getter
public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        if(wage < 0.0){
            throw new IllegalArgumentException("Wage must be > 0");
        }
        if(hours < 0 || hours > 168){
            throw new IllegalArgumentException("hours must be >= 0 and <= 168");
        }
        this.wage = wage;
        this.hours = hours;
    }

    public void setWage(double wage) {
        if(wage < 0.0){
            throw new IllegalArgumentException("Wage must be > 0");
        }
        this.wage = wage;
    }

    public void setHours(double hours) {
        if(hours < 0 || hours > 168){
            throw new IllegalArgumentException("hours must be >= 0 and <= 168");
        }
        this.hours = hours;
    }

    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return (40 * wage) + ((hours - 40) * 1.5);
        }
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s %,.2f", super.toString(), "hourly wage", getWage(), "hours worked", getHours());
    }
}
