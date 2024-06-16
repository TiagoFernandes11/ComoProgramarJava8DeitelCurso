package livro.cap10.classes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
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
